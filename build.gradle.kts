plugins {
    kotlin("jvm") version "2.1.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("org.openjfx:javafx-base:24.0.1:win")
    implementation("org.openjfx:javafx-controls:24.0.1:win")
    implementation("org.openjfx:javafx-graphics:24.0.1:win")
    implementation("org.openjfx:javafx-fxml:24.0.1:win")
    
    // Ajout des coroutines Kotlin pour une meilleure gestion des opérations asynchrones
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-javafx:1.7.3")
}

application {
    mainClass.set("org.example.SuiviSportifGUI")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}