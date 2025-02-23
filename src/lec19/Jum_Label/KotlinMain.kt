package lec19.Jum_Label

fun main() {

    val listOf = listOf(1, 2, 3)
    listOf.map { number -> number * number }
        .forEach { number -> println(number) }

    // foreach 에서 break 를 사용하는 경우
    run {
        listOf.map { number -> number * number }
            .forEach { number ->
            if (number == 2) return@run;
            println(number) }
    }

    // foreach 에서 continue 를 사용하는 경우
    listOf.map { number -> number * number }
        .forEach { number ->
            if (number == 2) return@forEach;
            println(number) }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            println("$i $j")
        }
    }
}