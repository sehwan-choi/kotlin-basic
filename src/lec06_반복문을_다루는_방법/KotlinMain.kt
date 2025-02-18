package lec06_반복문을_다루는_방법

fun main() {

    val numbers = listOf(1L,2L,3L)

    for (number in numbers) {
        println(numbers)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }


}