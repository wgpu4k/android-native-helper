rootProject.name = "android-native-helper-root"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
	repositories {
		gradlePluginPortal()
		google()
		mavenCentral()
		mavenLocal()
	}
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenLocal()
		mavenCentral()
	}
}

val hostOs = System.getProperty("os.name")

include("android-native-helper")
