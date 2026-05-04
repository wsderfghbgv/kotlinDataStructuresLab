plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "adso"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

application {
    mainClass.set("MainKt")
}
