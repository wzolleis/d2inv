package build

object Versions {
    const val kotestVersion = "4.3.2"
    const val postgresVersion = "42.2.18"
    const val mockkVersion = "1.10.5"
    const val mockkSpringVersion = "3.0.1"
    const val arrowVersion = "0.11.0"
    const val liquibaseVersion = "4.3.1"
    const val okHttpVersion = "4.9.0"
    const val gson = "2.8.5"
}

object Libs {
    const val kotestRunnerJunit5 = "io.kotest:kotest-runner-junit5:${Versions.kotestVersion}"
    const val kotestAssertionsCore = "io.kotest:kotest-assertions-core:${Versions.kotestVersion}"
    const val kotestExtensionsSpring = "io.kotest:kotest-extensions-spring:${Versions.kotestVersion}"
    const val postgresDriver = "org.postgresql:postgresql:${Versions.postgresVersion}"
    const val mockk = "io.mockk:mockk:${Versions.mockkVersion}"
    const val mockkSpring = "com.ninja-squad:springmockk:${Versions.mockkSpringVersion}"
    const val arrowCore = "io.arrow-kt:arrow-core:${Versions.arrowVersion}"
    const val arrowSyntax = "io.arrow-kt:arrow-syntax:${Versions.arrowVersion}"
    const val liquibaseCore = "org.liquibase:liquibase-core:${Versions.liquibaseVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
}




