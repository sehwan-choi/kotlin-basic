package lec11_접근제어를_다루는_방법

fun main() {

}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {

    var price = _price
        private set
}