//import org.jetbrains.kotlin.gradle.dsl.JvmTarget
//
//plugins {
//    kotlin("multiplatform") version "1.8.22"
//    application
//}
//
//group = "de.iteratec"
//version = "1.0-SNAPSHOT"
//
//repositories {
//    mavenCentral()
//}
//
//kotlin {
//    jvmToolchain(11)
//
//    jvm {
//        compilations.all {
//            compilerOptions.configure {
//                jvmTarget.set(JvmTarget.JVM_11)
//            }
//        }
//        withJava()
//    }
//
//    js(IR) {
//        binaries.executable()
//        nodejs()
//    }
//
//    val hostOs = System.getProperty("os.name")
//    val isMingwX64 = hostOs.startsWith("Windows")
//    val nativeTarget = when {
//        hostOs == "Mac OS X" -> macosX64("native")
//        hostOs == "Linux" -> linuxX64("native")
//        isMingwX64 -> mingwX64("native")
//        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
//    }
//
//    nativeTarget.apply {
//        binaries {
//            executable {
//                entryPoint = "main"
//            }
//        }
//    }
//    sourceSets {
//        val commonMain by getting
//        val jvmMain by getting
//        val jsMain by getting
//        val nativeMain by getting
//    }
//}
//
//application {
//    mainClass.set("MainKt")
//}
