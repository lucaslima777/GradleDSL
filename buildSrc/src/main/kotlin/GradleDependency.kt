object GradlePluginVersion {
    const val ANDROID_GRADLE = CoreVersion.ANDROID
    const val KOTLIN = CoreVersion.KOTLIN
}

object GradlePluginId {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
}

object GradlePlugins {
    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${GradlePluginVersion.ANDROID_GRADLE}"
    const val KOTLIN_GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:${GradlePluginVersion.KOTLIN}"
}
