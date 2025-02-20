package lec10_상속을_다루는_방법

fun main() {
    Derived(500)
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
) : Base(number) {
    init {
        println("Derived class")
        println(number)
    }
}