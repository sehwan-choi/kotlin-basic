package lec18_컬렉션을_함수형으로_다루는_방법.Fruit2

data class Fruit(
    val id: Long,
    val name: String,
    val price: Long,
)

fun main() {
    var fruits = listOf(
        Fruit(1, "사과", 1000),
        Fruit(2, "사과", 1200),
        Fruit(3, "사과", 1200),
        Fruit(4, "사과", 1500),
        Fruit(5, "바나나", 3000),
        Fruit(6, "바나나", 3200),
        Fruit(7, "바나나", 2500),
        Fruit(8, "수박", 10000)
    )

    println("fruits")
    println(allApples(fruits))
    println("allOthers")
    println(allOthers(fruits))
    println("noneApples")
    println(noneApples(fruits))
    println("noneOthers")
    println(noneOthers(fruits))
    println("any")
    println(any(fruits))
    println("count")
    println(fruits.count())
    println("sortedBy")
    println(sortedBy(fruits))
    println("sortedByDescending")
    println(sortedByDescending(fruits))
    println("distinctBy")
    println(distinctBy(fruits))
    println("distinctByName")
    println(distinctByName(fruits))
    println("first")
    println(fruits.first())
    println("fistOrNull")
    println(fruits.firstOrNull())
    println("last")
    println(fruits.last())
    println("lastOrNull")
    println(fruits.lastOrNull())
    println("list -> map(Name)")
    println(fruits.groupBy { fruit -> fruit.name })
    println("list -> map(id)")
    println(fruits.associateBy() { fruit -> fruit.id })
    println("list -> map(key, value)")
    println(fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.price }))
}

fun allApples(fruits: List<Fruit>): Boolean {
    return fruits.all { fruit -> fruit.name == "사과" }
}

fun allOthers(fruits: List<Fruit>): Boolean {
    return fruits.all { fruit -> fruit.name == "other" }
}

fun noneApples(fruits: List<Fruit>): Boolean {
    return fruits.none { fruit -> fruit.name == "사과"}
}

fun noneOthers(fruits: List<Fruit>): Boolean {
    return fruits.none { fruit -> fruit.name == "other"}
}

fun any(fruits: List<Fruit>): Boolean {
    return fruits.any { fruit -> fruit.price >= 10000}
}

fun sortedBy(fruits: List<Fruit>): List<Fruit> {
    return fruits.sortedBy { fruit -> fruit.price }
}

fun sortedByDescending(fruits: List<Fruit>): List<Fruit> {
    return fruits.sortedByDescending { fruit -> fruit.price }
}

fun distinctBy(fruits: List<Fruit>): List<Fruit> {
    return fruits.distinctBy { fruit -> fruit.name }
}

fun distinctByName(fruits: List<Fruit>): List<String> {
    return fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }
}