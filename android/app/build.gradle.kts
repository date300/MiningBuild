 plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.mine.matrix" // main package namespace
    compileSdk = 36                // আপডেট করা হলো 36, নতুন লাইব্রেরি compatible করার জন্য
    ndkVersion = "25.1.8937393"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.mine.matrix"  // Play Store/App ID
        minSdk = 21                         // minimum supported SDK
        targetSdk = 36                      // target SDK আপডেট করা হলো
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false      // code shrink off
            isShrinkResources = false    // resource shrink off
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
