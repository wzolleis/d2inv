package build

object Versions {
    const val kotestVersion = "4.3.2"
    const val postgresVersion = "42.2.18"
}

object Libs {
    const val kotestRunnerJunit5 = "io.kotest:kotest-runner-junit5:${Versions.kotestVersion}"
    const val kotestAssertionsCore = "io.kotest:kotest-assertions-core:${Versions.kotestVersion}"
    const val kotestExtensionsSpring = "io.kotest:kotest-extensions-spring:${Versions.kotestVersion}"
    const val postgresDriver = "org.postgresql:postgresql:${Versions.postgresVersion}"
}




