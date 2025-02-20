package lec10_상속을_다루는_방법

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount: Int =2

    override fun move() {
        TODO("Not yet implemented")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override val swimAbility: Int
        get() = 3

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }


}