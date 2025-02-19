package lec08_함수를_다루는_방법

fun main() {
    repeat("hi")
    repeat("hello world", useNewLine = false)

    printAll("1","2","3")
    printAll(*arrayOf("A","B","C"))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        }
        else {
            println(str)
        }
    }
}

fun printAll(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}