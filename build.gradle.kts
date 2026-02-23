plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.2.1"
}

group = "com.github.gruvbox-themes"
version = "0.0.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.3")
        bundledPlugin("com.intellij.java")
        pluginVerifier()
        zipSigner()
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

intellijPlatform {
    pluginVerification {
        ides {
            recommended()
        }
    }
}

tasks {
    patchPluginXml {
        sinceBuild.set("243")
        untilBuild.set("263.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
