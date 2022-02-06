plugins {
    kotlin("jvm") version "1.6.0"
    `maven-publish`
}

group = "com.andreikingsley"
version = "0.1.2-dev-1.8-feature-0.3"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.andreikingsley"
            artifactId = "ggdsl"
            version = "0.1.2-dev-1.8-feature-0.3"

            from(components["java"])
        }
    }
}
