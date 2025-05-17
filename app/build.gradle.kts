plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.repricadisney"
    compileSdk = 35

    buildFeatures{
        viewBinding= true
    }

    defaultConfig {
        applicationId = "com.example.repricadisney"
        minSdk = 33
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // RecyclerView (Listeler için)
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // CardView (Yuvarlak köşeli kartlar için)
    implementation("androidx.cardview:cardview:1.0.0")

    // Glide veya Picasso (Görsel yükleme için)
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // ViewPager2 (Kaydırılabilir hero section için alternatif)
    implementation("androidx.viewpager2:viewpager2:1.1.0")
}