package lec04_연산자를_다루는_방법

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    // 코틀린에서는 객체에 compareTo가 구현되어있다면
    // 비교연산자를 사용할때 compareTo를 호출해준다.
    // Comparable 을 implements 받지 않아도 compareTo 메서드만 있으면 된다.
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    // 코틀린에서는 동일성에 === 을 사용(객체 주소비교)
    // 동등성에 == 를 사용(객체 내부 값 비교, equals 를 호출해준다)
    val money3 = JavaMoney(2000L)
    val money4 = money3
    val money5 = JavaMoney(2000L)

    println(money3 === money4)  //  true  동일성 비교
    println(money3 === money5)  //  false 동일성 비교
    println(money3 == money5)   //  true  동등성 비고(equals 호출)

    // 코틀린에서는 연산자를 오버라이딩 할수 있다.
    // 아래 Money 클래스에서 operator 예약어를 통해서 가능하다
    val money6 = Money(2000L)
    val money7 = Money(3000L)

    println((money6 + money7).amount)
}

data class Money(
    val amount: Long
) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}