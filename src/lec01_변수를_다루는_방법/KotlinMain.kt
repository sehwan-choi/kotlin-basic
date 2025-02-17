package lec01_변수를_다루는_방법

fun main() {

    var number1: Long = 10L // 가변
    val number2: Long = 10L // 불변

    var number3: Long? = 10L // null 사용하는 경우 '타입?' 를 사용해야함
    number3 = null

    var person = Person("최세환")
}