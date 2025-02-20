package lec10_상속을_다루는_방법

interface Swimable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("어푸 어푸")
    }
}