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
    dependsOn("npm_run_build")
}

/**
* Definiert die Task, die den Build (npm build) ausführt
*/
tasks.named<com.moowork.gradle.node.npm.NpmTask>("npm_run_build") {
    // make sure the build task is executed only when appropriate files change
    inputs.files(fileTree("public"))
    inputs.files(fileTree("src"))

    // "node_modules" appeared not reliable for dependency change detection (the task was rerun without changes)
    // though "package.json" and "package-lock.json" should be enough anyway
    inputs.file("package.json")
    inputs.file("package-lock.json")

    outputs.dir("build")
}