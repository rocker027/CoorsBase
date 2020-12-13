object Libs {

    object Gradle {
        const val Lib = "com.android.tools.build:gradle:${Versions.Gradle.Ver}"
    }

    object Kotlin {
        const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.Ver}"
        const val GradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.Ver}"
    }

    object Junit {
        const val Junit = "junit:junit:${Versions.AndroidX.Junit}"
    }

    object AndroidX {
        const val Core ="androidx.core:core-ktx:${Versions.AndroidX.Core}"
        const val AppCompat ="androidx.appcompat:appcompat:${Versions.AndroidX.AppCompat}"
        const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.ConstraintLayout}"
        const val Junit = "androidx.test.ext:junit:${Versions.AndroidX.Junit}"
        const val Espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidX.Espresso}"
    }

    object Google {
        const val Material = "com.google.android.material:material:${Versions.Google.Material}"
    }
}