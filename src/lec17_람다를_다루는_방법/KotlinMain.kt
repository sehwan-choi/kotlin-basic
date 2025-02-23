package lec17_람다를_다루는_방법

import java.util.function.Predicate

fun main() {
    var fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    println(isApple(fruits[0]))
    println(isApple.invoke(fruits[0]))

    println("filerFruits")
    println(filerFruits(fruits, isApple))
    println(filerFruits(fruits, isApple2))
    println(filerFruits(fruits) { it.name == "사과" })
    println(filerFruits(fruits) { fruit -> fruit.name == "사과" })

    println("filerFruits2")
    println(filerFruits2(fruits, isApple))
    println(filerFruits2(fruits, isApple2))
    println(filerFruits2(fruits) { it.name == "사과" })
    println(filerFruits2(fruits) { fruit -> fruit.name == "사과" })

    println("filter")
    println(filter(fruits, isApple))
    println(filter(fruits, isApple2))
    println(filter(fruits) { it.name == "사과" })
    println(filter(fruits) { fruit -> fruit.name == "사과" })
}

private fun filerFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}

private fun filerFruits2(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}

private fun <T> filter(fruits: List<T>, filter: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (t:T in fruits) {
        if (filter(t)) {
            result.add(t)
        }
    }
    return result;
}