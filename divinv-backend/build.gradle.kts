import build.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.asciidoctor.convert") version "2.4.0"
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
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "8"
        useIR = true
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}


