package lec11_접근제어를_다루는_방법

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}