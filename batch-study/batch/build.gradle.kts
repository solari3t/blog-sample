plugins {
    kotlin("kapt")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    id("java")
}

subprojects {
    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-batch")
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
        implementation("org.springframework.boot:spring-boot-starter-validation")

//        api(project(":batch:batch-core"))

        implementation("io.reactivex.rxjava2:rxkotlin:2.4.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
        implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
        implementation("io.projectreactor:reactor-core")

        implementation("org.jetbrains.exposed:exposed-core:${properties["exposed_version"]}")
        implementation("org.jetbrains.exposed:exposed-dao:${properties["exposed_version"]}")
        implementation("org.jetbrains.exposed:exposed-jdbc:${properties["exposed_version"]}")
        implementation("org.jetbrains.exposed:exposed-java-time:${properties["exposed_version"]}")

        runtimeOnly("mysql:mysql-connector-java")

        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("org.springframework.batch:spring-batch-test")
    }

    tasks.bootJar {
        enabled = true
    }
}