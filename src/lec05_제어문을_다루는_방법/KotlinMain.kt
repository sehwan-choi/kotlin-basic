package lec05_제어문을_다루는_방법

fun main() {

}

fun validateScoreIsNotRange(score: Int) {
    // 아래 if 문과 동일
    // if (score < 0 && score > 100)
    if (score !in 0..100) {
        throw IllegalArgumentException("score 는 0부터 100사이여야 합니다.")
    }
    // 추가 로직
}

fun validateScore(score: Int) {
    // 아래 if 문과 동일
    // if (0 <= score && score <= 100)
    if (score in 0..100) {
        println("score 는 ${score} 입니다.")
    }

    // 추가 로직
}

// 코틀린에서는 switch 대신 when 을 사용한다.
fun whenTest1(score: Int): String {
    return when(score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun whenTest2(score: Int): String {
    return when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun whenTest3(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// when 에서 여러개 조건을 검사할 수 있다.
fun whenTest4(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

// when 에 주어진 값이 없을수도 있따
fun whenTest5(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 ==0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("주어진 숫자는 홀수 입니다.")
    }
}