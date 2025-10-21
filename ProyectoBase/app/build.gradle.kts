plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)


}

android {
    namespace = "com.example.proyectobase"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.proyectobase"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
}

dependencies {
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:2.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:2.0.0")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    // Convertidor JSON <-> data classes usando Moshi dentro de Retrofit (MoshiConverterFactory)
    implementation("com.squareup.retrofit2:converter-moshi:2.11.0")
    // Interceptor de OkHttp para loguear requests/responses (útil en debug)
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    // Coroutines Soporte de coroutines en Android (Dispatcher.Main, launch en UI, etc.)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
    // Extensiones KTX de Lifecycle: lifecycleScope, repeatOnLifecycle y helpers para coroutines
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")
    // Adaptadores de Moshi para Kotlin (null-safety, data classes, KotlinJsonAdapterFactory)
    implementation("com.squareup.moshi:moshi-kotlin:1.15.1")

}