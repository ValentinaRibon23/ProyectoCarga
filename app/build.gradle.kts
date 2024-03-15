plugins {
    id("com.android.application")
    id("com.google.gms.google-services") /*  LLAMADA A GOOGLE SERVICES   */
}

android {
    namespace = "com.upc.cargadirecta"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.upc.cargadirecta"
        minSdk = 21
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


    implementation("com.google.firebase:firebase-auth:22.3.1")   /*  FIREBASE  http://localhost:60951/  */
    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))  /*  FIREBASE  http://localhost:60951/  */
    // Add the dependency for the Firebase Authentication library
    // When using the BoM, you don't specify versions in Firebase library dependencies
    implementation("com.google.firebase:firebase-auth")   /*  FIREBASE  http://localhost:60951/  */
    implementation("com.google.firebase:firebase-database")  /*  FIREBASE  http://localhost:60951/  */

    implementation ("com.github.d-max:spots-dialog:1.1@aar") /*Pantalla de espera par cargar usuario*/
    implementation ("com.google.android.gms:play-services-maps:18.2.0") /*DEPENDENCIA PAR GOOGLE MAPS*/
    implementation ("com.google.android.gms:play-services-location:16.0.0") /*DEPENDENCIA PAR GOOGLE MAPS UBICAION ACTUAL GPS*/
    implementation ("com.firebase:geofire-android:2.2.0")/*Guardar la posicion de conducto en Firebase*/

    implementation ("com.google.android.libraries.places:places:3.3.0")
    implementation ("com.google.maps.android:android-maps-utils:2.3.0")
    implementation ("com.squareup.retrofit2:retrofit:2.4.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.4.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.4.0")
    //implementation ("com.airbnb.android:lottie:2.8.0")
    implementation ("com.airbnb.android:lottie:3.4.2")
    implementation ("com.github.d-max:spots-dialog:1.1@aar")
    implementation ("com.google.firebase:firebase-messaging:20.1.0")



    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}