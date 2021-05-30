import build.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    kotlin("jvm") version "1.4.30" apply false
}

allprojects {
    group = "de.wz.divinv"
    version = "0.0.1-SNAPSHOT"
    repositories {
        mavenCentral()
        jcenter()
    }
}

subprojects {
    tasks.withType<KotlinCompile>().configureEach {
        println("Configuring $name in project ${project.name}...")
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            useIR = true
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

}
