package lec16_다양한_함수를_다루는_방법

//확장 함수
fun main() {
    val str = "hi!"
    println(str.lastChar())

    val person = Person("홍", "길동", 10)
    println(person.nextYearAge())

    val train: Train = Train()
    println(train.isExpensive())

    val srt: Srt = Srt()
    println(srt.isExpensive())

    val train2:Train = Srt()
    println(train2.isExpensive())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 기존 Person 에 존재하는 메서드 명과 반환타입이 동일한 경우 멤버 함수가 호출된다.
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

open class Train(
    val name: String = "새마을",
    val price: Int = 5000
)

fun Train.isExpensive(): Boolean {
    println("Train 확장 함수")
    return this.price >= 10000
}

class Srt: Train("SRT", 40000)

fun Srt.isExpensive(): Boolean {
    println("Srt 확장 함수")
    return this.price >= 10000
}