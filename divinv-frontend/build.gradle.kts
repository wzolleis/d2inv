import build.*

plugins {
    id("com.github.node-gradle.node") version "2.2.4"
    kotlin("jvm")
}


group = "de.wz.divinv"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

tasks.assemble {
    dependsOn("npm_build")
}