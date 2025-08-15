plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    // コード内のパッケージ名。Kotlinの package とそろえる
    namespace = "jp.city.beppu.hellocounter" // 例：**jp.city.beppu.hellocounter**

    // どのSDKでコンパイル（ビルド）するか
    compileSdk = 34

    defaultConfig {
        // アプリの一意ID（Playの公開後は変更不可）
        applicationId = "jp.city.beppu.hellocounter" // 例：**jp.city.beppu.hellocounter**

        // 対応する最小/目標Androidバージョン
        minSdk = 24
        targetSdk = 34

        // バージョン情報（任意に更新可）
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            // 難読化や最適化（今回は無効でOK）
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // 画面XMLのView参照を便利にする（今回は必須ではないがONでOK）
    buildFeatures {
        viewBinding = true
    }
    // ★ Java/Kotlin のターゲットを 17 に統一
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Androidの基本拡張（Kotlin向け便利機能）
    implementation("androidx.core:core-ktx:1.13.1")
    // 従来からある互換UI部品
    implementation("androidx.appcompat:appcompat:1.7.0")
    // MaterialデザインのUI部品
    implementation("com.google.android.material:material:1.12.0")
    // 今回はConstraintLayout未使用のため省略
}
