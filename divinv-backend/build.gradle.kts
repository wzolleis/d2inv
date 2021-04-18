import build.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.asciidoctor.convert") version "2.4.0"
    id("org.openapi.generator") version "5.0.1"
    kotlin("jvm")
    kotlin("plugin.spring") version "1.4.31"
    kotlin("plugin.allopen") version "1.4.30"
    kotlin("plugin.serialization") version "1.4.30"
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
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("javax.xml.bind:jaxb-api:2.3.1")
//    implementation("org.openapitools:openapi-generator-gradle-plugin:5.0.0")
    implementation(Libs.moshi) // json library
    implementation(Libs.moshiKotlin)
    implementation(Libs.moshiAdapters)
    implementation(Libs.okHttp) // http client / server
    implementation(Libs.liquibaseCore)
    implementation(Libs.kotlinxSerialization)
    implementation(project(":divinv-frontend"))

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("org.postgresql:postgresql")
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

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

openApiGenerate {
    generatorName.set("kotlin")
    inputSpec.set("$rootDir/specs/divinv_api.yaml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("de.wz.divinv.generated.api")
    invokerPackage.set("de.wz.divinv.generated.invoker")
    modelPackage.set("de.wz.divinv.generated.model")
    configOptions.set(mapOf("dateLibrary" to "java8"))
}