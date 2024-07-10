import java.text.DateFormat
import java.util.*

plugins {
    `java-library`
    id("pl.allegro.tech.build.axion-release") version "1.14.3"
    id("io.freefair.lombok") version "6.5.0"
}

group = "ch.admin.bar"
version = scmVersion.version

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.admin.bar:enterutilities:v2.2.3")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType(Jar::class) {
    manifest {
        attributes["Manifest-Version"] = "1.0"
        attributes["Created-By"] = "Hartwig Thomas, Enter AG, Rüti ZH, Switzerland; Puzzle ITC GmbH, Switzerland"
        attributes["Specification-Title"] = "ZIP64"
        attributes["Specification-Vendor"] = "Swiss Federal Archives, Berne, Switzerland"
        attributes["Implementation-Title"] = "Zip64"
        attributes["Implementation-Version"] = archiveVersion
        attributes["Implementation-Vendor"] = "Swiss Federal Archives, Berne, Switzerland"
        attributes["Built-Date"] = DateFormat.getDateInstance().format(Date())

    }
}

