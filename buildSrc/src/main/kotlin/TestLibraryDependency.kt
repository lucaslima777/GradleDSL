private object TestLibraryVersion {
    const val JUNIT = "4.13"
    const val JUNIT_EXT = "1.1.1"
    const val ESPRESSO_CORE = "3.2.0"
}

object TestLibraryDependency {
    const val JUNIT = "junit:junit:${TestLibraryVersion.JUNIT}"
    const val JUNIT_EXT = "androidx.test.ext:junit:${TestLibraryVersion.JUNIT_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${TestLibraryVersion.ESPRESSO_CORE}"
}
