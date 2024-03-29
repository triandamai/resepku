@file:Suppress("UnstableApiUsage")



pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
        maven(url = "https://jitpack.io")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
        maven(url = "https://jitpack.io")

    }
    versionCatalogs {
        create("libs") {
            from(files("core-ui/libs.versions.toml"))
        }
    }
}

rootProject.name = "Resepku"
include(":app")
include(":core-data")
include(":core-ui")
include(":core-annotation")
include(":core-component")
include(":feature-authentication")
include(":feature-dashboard")
include(":feature-recipe")

project(":core-ui").projectDir = File("core-ui/ui")
project(":core-annotation").projectDir = File("core-ui/annotation")
