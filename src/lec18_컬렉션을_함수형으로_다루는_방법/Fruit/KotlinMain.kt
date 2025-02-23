package lec18_컬렉션을_함수형으로_다루는_방법.Fruit

data class Fruit(
    val name: String,
    val price: Long?,
)

fun main() {
    var fruits2 = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", null),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val apples: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}
    val apples2 = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    println("filter")
    println(filter(fruits2, apples))
    println(filter(fruits2, apples2))
    println(filter(fruits2) { fruits: Fruit -> fruits.name == "사과"})
    println("filter2")
    println(filter2(fruits2))
    println("filterIndexed")
    println(filterIndexed(fruits2))
    println("filterAndMap")
    println(filterAndMap(fruits2))
    println("filterAndMap2")
    println(filterAndMap2(fruits2) { fruit -> fruit.name == "바나나" })
    println("genericFilter")
    println(genericFilter(fruits2) { fruit -> fruit.name == "바나나" })
    println("genericFilterAndMap")
    println(genericFilterAndMap(fruits2, {fruit -> fruit.name == "바나나"}, {fruit -> fruit.price}))
    println(genericFilterAndMap(fruits2, {fruit -> fruit.name == "바나나"}) {fruit -> fruit.price})
    println("filterAndMapIndexed")
    println(filterAndMapIndexed(fruits2))
    println("filterAndMapIndexedAndNotNull")
    println(filterAndMapIndexedAndNotNull(fruits2))
    println("filterAndMapNotNull")
    println(filterAndMapNotNull(fruits2))
}

fun <T> genericFilter(list: List<T>, filter: (T) -> Boolean) : List<T> {
    return list.filter(filter)
}

fun <T,R> genericFilterAndMap(list: List<T>, filter: (T) -> Boolean, map: (T) -> R) : List<R> {
    return list.filter(filter).map(map)
}

fun filter(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}

fun filter2(fruits: List<Fruit>): List<Fruit> {
    return fruits.filter { fruit -> fruit.name == "사과" }
}

fun filterIndexed(fruits: List<Fruit>): List<Fruit> {
    return fruits.filterIndexed { index, fruit: Fruit ->
        if (fruit.name == "사과") {
            println("index: $index")
        }
        fruit.name == "사과"
    }
}

fun filterAndMap(fruits: List<Fruit>): List<Long> {
    return fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price ?: 0}
}

fun filterAndMap2(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Long> {
    return fruits.filter(filter).map { fruit -> fruit.price ?: 0 }
}

fun filterAndMapIndexed(fruits: List<Fruit>): List<Long> {
    return fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println("${idx} = ${fruit.name} : ${fruit.price}")
            fruit.price ?: 0
        }
}

fun filterAndMapIndexedAndNotNull(fruits: List<Fruit>): List<Long> {
    return fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println("${idx} = ${fruit.name} : ${fruit.price}")
            fruit.price }
        .mapNotNull { price -> price }
}

fun filterAndMapNotNull(fruits: List<Fruit>): List<Long> {
    return fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.price }
}