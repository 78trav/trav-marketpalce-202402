plugins {
    kotlin("jvm")
}

group = "ru.otus.otuskotlin.marketpalce"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit"))
}

kotlin {
    jvmToolchain(17)
}
