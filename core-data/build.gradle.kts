/*
 * Copyright © 2023 Blue Habit.
 *
 * Unauthorized copying, publishing of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
@file:Suppress("UnstableApiUsage")
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.com.google.dagger.hilt.android)
    alias(libs.plugins.app.cash.sqldelight)
    alias(libs.plugins.io.gitlab.arthubosch.detekt)
    alias(libs.plugins.org.jetbrains.kotlin.serialization)
    alias(libs.plugins.com.android.library)
    id("kotlin-parcelize")
    alias(libs.plugins.org.jetbrains.kotlin.kapt)
}

android {
    namespace = "${libs.versions.namespacedata.get()}.data"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs = listOf(
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
        )
    }
}

dependencies {

    implementation(libs.core.ktx)
    coreLibraryDesugaring(libs.desugar.jdk.lib)

    api(libs.sqldelight.android.driver)
    with(libs.ktor){
        api(client.core)
        api(android.client)
        api(content.negotiation)
        api(json)
        api(gson)
        api(resource)
    }
    with(libs.hilt) {
        implementation(android)
        implementation(work)
        kapt(android.compiler)
        kapt(compiler)
    }
    with(libs.gms.play.service) {
        implementation(auth)
        implementation(base)
    }

    with(libs.kotlinx.coroutine) {
        implementation(android)
        implementation(core)
        implementation(play.services)
        testImplementation(test)
    }

    //test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    testImplementation(libs.robolectric)
}
kapt {
    correctErrorTypes = true
}
sqldelight {
    databases {
        create("Database") {
            packageName.set("${libs.versions.namespace.get()}.sqldelight")
        }
    }
}