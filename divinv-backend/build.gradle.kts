import build.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.asciidoctor.convert") version "2.4.0"
    kotlin("jvm")
    kotlin("plugin.spring") version "1.6.10"
    kotlin("plugin.allopen") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
}

group = "de.wz.divinv"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("javax.xml.bind:jaxb-api:2.3.1")
    implementation("com.h2database:h2")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")

    implementation(Libs.okHttp) // http client / server
    implementation(project(":divinv-frontend"))

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.junit.vintage:junit-vintage-engine")
        exclude("mockito-core")
    }

    testImplementation(Libs.kotestRunnerJunit5)
    testImplementation(Libs.kotestAssertionsCore)
    testImplementation(Libs.kotestExtensionsSpring)
    testImplementation(Libs.mockk)
    testImplementation(Libs.mockkSpring)
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
    annotation("org.springframework.stereotype.Repository")
}

sourceSets.getByName("main") {
    java.srcDir("build/generated/src/main/kotlin")
    java.srcDir("src/main/kotlin")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

//openApiGenerate {
//    generatorName.set("kotlin-spring")
//    inputSpec.set("$rootDir/specs/divinv_api.yaml")
//    outputDir.set("$buildDir/generated")
//    packageName.set("de.wz.divinv.generated")
//    apiPackage.set("de.wz.divinv.generated.api")
//    invokerPackage.set("de.wz.divinv.generated.invoker")
//    modelPackage.set("de.wz.divinv.generated.model")
//    configOptions.set(
//        mapOf(
//            "dateLibrary" to "java8",
//            "useBeanValidation" to "false",
//            "gradleBuildFile" to "false",
//            "interfaceOnly" to "true",
//            "serializableModel" to "true"
//        )
//    )
//}