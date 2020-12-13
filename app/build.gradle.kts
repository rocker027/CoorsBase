import Versions.Android.compileSdkVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Versions.Android.compileSdkVersion)
    buildToolsVersion(Versions.Android.buildToolsVersion)
    defaultConfig {
        applicationId = "com.ttmj.coorsbase"
        minSdkVersion(Versions.Android.minSdk)
        targetSdkVersion(Versions.Android.targetSdkVersion)
        versionCode = Versions.Android.versionCode
        versionName = Versions.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }


    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}
//
dependencies {
    implementation(Libs.Kotlin.StdLib)
    implementation(Libs.AndroidX.Core)
    implementation(Libs.AndroidX.AppCompat)
    implementation(Libs.AndroidX.ConstraintLayout)
    implementation(Libs.Google.Material)
    testImplementation(Libs.Junit.Junit)
    androidTestImplementation(Libs.AndroidX.Junit)
    androidTestImplementation(Libs.AndroidX.Espresso)
}