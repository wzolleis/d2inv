import build.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.asciidoctor.convert") version "1.5.8"
    kotlin("jvm") version "1.4.21"
    kotlin("plugin.spring") version "1.4.21"
    kotlin("plugin.allopen") version "1.3.61"
    kotlin("plugin.serialization") version "1.4.10"
    id("com.github.node-gradle.node") version "2.2.4"
}

group = "de.wz.divinv"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

val frontendDirectory = "../divinv-frontend"

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
    implementation("javax.xml.bind:jaxb-api:2.3.0")
    implementation(Libs.kotlinxSerialization)

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
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

node {
    nodeModulesDir = file("$frontendDirectory/node_modules")
    version  = "12.16.1"
    download = false
    distBaseUrl = "http://nodejs.org/dist"
    npmWorkDir = file("$frontendDirectory")
    workDir = file("$frontendDirectory/node")
}

/**
 * Definiert die Task, die den Build (npm build) ausführt
 */
//tasks.named<com.moowork.gradle.node.npm.NpmTask>("npm_run_build") {
//    // make sure the build task is executed only when appropriate files change
//    inputs.files(fileTree("${frontendDirectory}/public"))
//    inputs.files(fileTree("${frontendDirectory}/src"))
//
//    // "node_modules" appeared not reliable for dependency change detection (the task was rerun without changes)
//    // though "package.json" and "package-lock.json" should be enough anyway
//    inputs.file("${frontendDirectory}/package.json")
//    inputs.file("${frontendDirectory}/package-lock.json")
//    outputs.dir("${frontendDirectory}/build")
//}

/** NPM Build: Baut den Javascript-Client nach /build. */
//val buildNpmApp by tasks.registering(Jar::class) {
//    dependsOn("npm_run_build")
//}

/** Kopiert die vom NPM-Build erzeugten Resourcen ins richtige Unterverzeichnis, so dass sie komplett ins Jarfile aufgenommen werden.
 *  Beim Start des ServiceInventory-Servers aus IntelliJ heraus werden die Resourcen aus dem Copy-Task auch verwendet. */
val copyNpmBuildFiles by tasks.registering(Copy::class) {
//    dependsOn(buildNpmApp)
    from("$frontendDirectory/build")
    // Für die Webjar müssen unsere Client-Resourcen dann unter META-INF/resources liegen.
    // Das Verzeichnis /ui-static wird dann vom Server ausgeliefert.
    into("$buildDir/resources/main/META-INF/resources/ui-static/")
    exclude("kotlin", "resources", "tmp", "libs")
    include(
        "**/*.js", "**/*.png", "**/*.css", "**/*.html", "**/*.map", "**/*.txt",
        "**/*.woff", "**/*.woff2", "**/*.ttf", "**/*.eot", "**/*.svg", "**/*.json"
    )
}

tasks.named("assemble") {
//    dependsOn(buildNpmApp)
    dependsOn("copyNpmBuildFiles")
}