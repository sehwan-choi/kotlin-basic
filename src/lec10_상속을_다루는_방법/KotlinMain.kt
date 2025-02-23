package lec10_상속을_다루는_방법

fun main() {
    val derived = Derived(500, 1000)

}

open class Base(
    open val number: Int = 100
) {
    init {
        println("base class")
        println(number)
    }
}

class Derived(
    override val number: Int,
    private val test: Int,
) : Base(number) {
    init {
        println("Derived class")
        println("${number} ${test}")
    }
}