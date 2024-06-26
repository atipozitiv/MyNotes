plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.mynotes"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mynotes"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        exclude("META-INF/atomicfu.kotlin_module")
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        implementation("androidx.activity:activity-ktx:1.2.3")

        // Dependencies for working with Architecture components
        // You'll probably have to update the version numbers in build.gradle (Project)
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
        // Room components
        implementation("androidx.room:room-ktx:2.3.0")
        kapt("androidx.room:room-compiler:2.3.0")
        androidTestImplementation("androidx.room:room-testing:2.3.0")

        // Lifecycle components
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
        implementation("androidx.lifecycle:lifecycle-common-java8:2.3.1")

        // Kotlin components
        /*implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version")*/
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")

        // UI
        implementation("androidx.constraintlayout:constraintlayout:2.0.4")
        implementation("com.google.android.material:material:1.3.0")

        // Testing
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.arch.core:core-testing:2.1.0")
       /* androidTestImplementation("androidx.test.espresso:espresso-core:$rootProject.3.1.0", {
            exclude group: 'com.android.support', module: 'support-annotations'
        })*/
        androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    }