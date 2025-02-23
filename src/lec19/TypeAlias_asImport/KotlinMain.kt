package lec19.TypeAlias_asImport

import lec19.TypeAlias_asImport.A.printHelloWorld as printHelloWorldA
import lec19.TypeAlias_asImport.B.printHelloWorld as printHelloWorldB

data class Fruit(
    val name: String,
    val price: Long?,
)

fun main() {
    printHelloWorldA();
    printHelloWorldB();
}

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}

typealias FruitFilter = (Fruit) -> Boolean
fun filterFruitsByTypeAlias(fruits: List<Fruit>, filter: FruitFilter): List<Fruit> {
    return fruits.filter(filter)
}

data class UltraSuperGuardianTribe(val name: String)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>