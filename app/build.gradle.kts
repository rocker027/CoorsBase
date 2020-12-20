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

dependencies {
    implementation(Libs.Kotlin.StdLib)
    implementation(Libs.Kotlin.Coroutines)
    implementation(Libs.AndroidX.Core)
    implementation(Libs.AndroidX.AppCompat)
    implementation(Libs.AndroidX.ConstraintLayout)
    implementation(Libs.AndroidX.Fragment)
    implementation(Libs.AndroidX.LifeCycleCommon)
    implementation(Libs.AndroidX.LifeCycle)
    implementation(Libs.AndroidX.LiveData)
    implementation(Libs.AndroidX.NavigationRuntimeKtx)
    implementation(Libs.AndroidX.NavigationFragmentKtx)
    implementation(Libs.AndroidX.NavigationUiKtx)
    implementation(Libs.AndroidX.LifecycleReactivestreamsKtx)
    implementation(Libs.AndroidX.ViewModelKtx)
    implementation(Libs.AndroidX.Room)

    implementation(Libs.Google.Material)

    implementation(Libs.Squareup.Retrofit)
    implementation(Libs.Squareup.MoshiConverter)
    implementation(Libs.Squareup.Moshi)
    implementation(Libs.Squareup.OkHttp)

    implementation(Libs.FlowBinding.FlowBindingAndroid)
    implementation(Libs.FlowBinding.Activity)
    implementation(Libs.FlowBinding.Appcompat)
    implementation(Libs.FlowBinding.Core)
    implementation(Libs.FlowBinding.DrawerLayout)
    implementation(Libs.FlowBinding.LifeCycle)
    implementation(Libs.FlowBinding.Navigation)
    implementation(Libs.FlowBinding.Preference)
    implementation(Libs.FlowBinding.Recyclerview)
    implementation(Libs.FlowBinding.SwipeRefreshLayout)
    implementation(Libs.FlowBinding.ViewPager2)
    implementation(Libs.FlowBinding.Material)

    implementation(Libs.Other.Coli)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    testImplementation(Libs.Junit.Junit)
    testImplementation(Libs.Other.MockKUnit)
    androidTestImplementation(Libs.Other.MockKAndroid)
    androidTestImplementation(Libs.AndroidX.Espresso)
}