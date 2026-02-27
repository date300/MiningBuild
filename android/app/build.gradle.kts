plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.mine.matrix" // <-- main package namespace
    compileSdk = 33                // অথবা flutter.compileSdkVersion ব্যবহার করতে পারো
    ndkVersion = "25.1.8937393"   // যদি প্রয়োজন হয়, Flutter SDK থেকে নিতে পারো

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.mine.matrix"  // <-- Play Store/App ID
        minSdk = 21                         // minimum supported SDK
        targetSdk = 33                      // target SDK
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // Signing config: release build-এ নিজের key ব্যবহার করতে হবে
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
