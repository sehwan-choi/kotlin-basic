package lec19.takeIf_takeUnless

fun main() {

    println("getNumberOrNull")
    println(getNumberOrNull(10))
    println(getNumberOrNull(0))

    println("takeIf")
    println(takeIf(10))
    println(takeIf(0))

    println("takeUnless")
    println(takeUnless(10))
    println(takeUnless(0))
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null 이 반환
// number 가 10인경우 10이 반환
// number 가 0 인경우 null 반환
fun takeIf(number: Int): Int? {
    return number.takeIf { it > 0 }
}

// 주어진 조건을 만족하지 않으면 그 값이, 만족하면 null 이 반환
// number 가 10인경우 null 반환
// number 가 0 인경우 0 반환
fun takeUnless(number: Int): Int? {
    return number.takeUnless { it > 0 }
}