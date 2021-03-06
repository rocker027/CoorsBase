object Libs {

    object Gradle {
        const val Lib = "com.android.tools.build:gradle:${Versions.Gradle.Ver}"
    }

    object Kotlin {
        const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.Ver}"
        const val GradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.Ver}"
        const val Coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.Coroutines}"
        const val CoroutinesTest =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Kotlin.CoroutinesTest}"
    }

    object Junit {
        const val Junit = "junit:junit:${Versions.Junit.Ver}"
    }

    object AndroidX {
        const val Core = "androidx.core:core-ktx:${Versions.AndroidX.Core}"
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.AppCompat}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.ConstraintLayout}"
        const val Junit = "androidx.test.ext:junit:${Versions.AndroidX.Junit}"
        const val Espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidX.Espresso}"
        const val Fragment = "androidx.fragment:fragment-ktx:${Versions.AndroidX.Fragment}"
        const val LifeCycleCommon =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.AndroidX.LifeCycle}"
        const val LifeCycle =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.LifeCycle}"
        const val LiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.LiveData}"
        const val NavigationRuntimeKtx =
            "androidx.navigation:navigation-fragment-ktx:${Versions.AndroidX.Navigation}"
        const val NavigationFragmentKtx =
            "androidx.navigation:navigation-runtime-ktx:${Versions.AndroidX.Navigation}"
        const val NavigationUiKtx =
            "androidx.navigation:navigation-ui-ktx:${Versions.AndroidX.Navigation}"
        const val LifecycleReactivestreamsKtx =
            "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.AndroidX.LifeCycle}"
        const val ViewModelKtx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.ViewModel}"
        const val Room = "androidx.room:room-ktx:${Versions.AndroidX.Room}"
        const val SavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.AndroidX.LifeCycle}"
    }

    object Squareup {
        const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.Squareup.Retrofit}"
        const val MoshiConverter =
            "com.squareup.retrofit2:converter-moshi:${Versions.Squareup.Retrofit}"
        const val Moshi = "com.squareup.moshi:moshi:${Versions.Squareup.Moshi}"
        const val OkHttp = "com.squareup.okhttp3:okhttp:${Versions.Squareup.OkHttp}"
    }

    object Google {
        const val Material = "com.google.android.material:material:${Versions.Google.Material}"
    }

//    object FlowBinding {
//        // Platform Bindings
//        const val FlowBindingAndroid = "io.github.reactivecircus.flowbinding:flowbinding-android:${Versions.Other.FlowBinding}"
//        // AndroidX Bindings
//        const val Activity = "io.github.reactivecircus.flowbinding:flowbinding-activity:${Versions.Other.FlowBinding}"
//        const val Appcompat = "io.github.reactivecircus.flowbinding:flowbinding-appcompat:${Versions.Other.FlowBinding}"
//        const val Core = "io.github.reactivecircus.flowbinding:flowbinding-core:${Versions.Other.FlowBinding}"
//        const val DrawerLayout = "io.github.reactivecircus.flowbinding:flowbinding-drawerlayout:${Versions.Other.FlowBinding}"
//        const val LifeCycle = "io.github.reactivecircus.flowbinding:flowbinding-lifecycle:${Versions.Other.FlowBinding}"
//        const val Navigation = "io.github.reactivecircus.flowbinding:flowbinding-navigation:${Versions.Other.FlowBinding}"
//        const val Preference = "io.github.reactivecircus.flowbinding:flowbinding-preference:${Versions.Other.FlowBinding}"
//        const val Recyclerview = "io.github.reactivecircus.flowbinding:flowbinding-recyclerview:${Versions.Other.FlowBinding}"
//        const val SwipeRefreshLayout = "io.github.reactivecircus.flowbinding:flowbinding-swiperefreshlayout:${Versions.Other.FlowBinding}"
//        const val ViewPager2 = "io.github.reactivecircus.flowbinding:flowbinding-viewpager2:${Versions.Other.FlowBinding}"
//
//        // Material Components Bindings
//        const val Material = "io.github.reactivecircus.flowbinding:flowbinding-material:${Versions.Other.FlowBinding}"
//    }

    object Corbind {
        const val Platform = "ru.ldralighieri.corbind:corbind:${Versions.Other.Corbind}"
        const val AppCompat = "ru.ldralighieri.corbind:corbind-appcompat:${Versions.Other.Corbind}"
        const val Core = "ru.ldralighieri.corbind:corbind-core:${Versions.Other.Corbind}"
        const val DrawerLayout = "ru.ldralighieri.corbind:corbind-drawerlayout:${Versions.Other.Corbind}"
        const val Leanback = "ru.ldralighieri.corbind:corbind-leanback:${Versions.Other.Corbind}"
        const val Navigation = "ru.ldralighieri.corbind:corbind-navigation:${Versions.Other.Corbind}"
        const val Recyclerview = "ru.ldralighieri.corbind:corbind-recyclerview:${Versions.Other.Corbind}"
        const val SlidingPaneLayout = "ru.ldralighieri.corbind:corbind-slidingpanelayout:${Versions.Other.Corbind}"
        const val SwipeRefreshLayout = "ru.ldralighieri.corbind:corbind-swiperefreshlayout:${Versions.Other.Corbind}"
        const val ViewPager2 = "ru.ldralighieri.corbind:corbind-viewpager2:${Versions.Other.Corbind}"
        const val Material = "ru.ldralighieri.corbind:corbind-material:${Versions.Other.Corbind}"
    }

    object Koin {
        const val Core = "org.koin:koin-core:${Versions.Koin.Ver}"
        const val CoreExt = "org.koin:koin-core-ext:${Versions.Koin.Ver}"
        const val Test = "org.koin:koin-test:${Versions.Koin.Ver}"
        const val Scope = "org.koin:koin-androidx-scope:${Versions.Koin.Ver}"
        const val ViewModel = "org.koin:koin-androidx-viewmodel:${Versions.Koin.Ver}"
        const val Fragment = "org.koin:koin-androidx-fragment:${Versions.Koin.Ver}"
        const val WorkManager = "org.koin:koin-androidx-workmanager:${Versions.Koin.Ver}"
        const val Compose = "org.koin:koin-androidx-compose:${Versions.Koin.Ver}"
        const val Ext = "org.koin:koin-androidx-ext:${Versions.Koin.Ver}"
    }

    object Other {
        const val Coli = "io.coil-kt:coil:${Versions.Other.Coli}"
        const val MockKUnit = "io.mockk:mockk:${Versions.Other.MockK}"
        const val MockKAndroid = "io.mockk:mockk-android:${Versions.Other.MockK}"
        const val Timber = "com.jakewharton.timber:timber:${Versions.Other.Timber}"
        const val TransformationLayout = "com.github.skydoves:transformationlayout:${Versions.Other.TransformationLayout}"
    }
}