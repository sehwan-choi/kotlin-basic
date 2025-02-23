package lec15_배열과_컬렉션을_다루는_방법

fun main() {

    // 배열
    val arr = arrayOf(100,200)

    for (i in arr.indices) {
        println("${i} = ${arr[i]}")
    }

    for ((idx, value) in arr.withIndex()) {
        println("${idx} = ${value}")
    }

    // 불변 리스트
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    printNumbers(emptyList())

    val array = listOf(100, 200)
    println(array[0])

    for (i in array) {
        println(i)
    }

    for (i in array.indices) {
        println("${i} = ${array[i]}")
    }

    for ((key,value) in array.withIndex()) {
        println("$key = $value")
    }

    // 가변 리스트
    val mutableList = mutableListOf(100, 200)
    mutableList.add(300)

    for ((key,value) in mutableList.withIndex()) {
        println("$key = $value")
    }

    // 불변 집합
    val set = setOf(100, 200)
    for (i in set) {
        println(i)
    }

    for (i in set.indices) {
        println("${i} = ${set.elementAt(i)}")
    }

    for ((key,value) in set.withIndex()) {
        println("$key = $value")
    }

    // 가변 집밥
    val mutableSet = mutableSetOf(100, 200)
    mutableSet.add(100)

    for (i in mutableSet) {
        println(i)
    }

    mutableSet.add(300)

    for ((key,value) in mutableSet.withIndex()) {
        println("$key = $value")
    }

    // 가변 맵
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key,value) in map) {
        println("$key = $value")
    }

    for (key in map.keys) {
        println("$key = ${map[key]}")
    }

    for ((key,value) in map) {
        println("$key = $value")
    }

    for (value in map.values) {
        println(value)
    }

    for ((key,value) in map.entries) {
        println("$key = $value")
    }

    // 불변 맵
    val mutableMapOf = mutableMapOf<Int, String>()
    mutableMapOf[1] = "one"
    mutableMapOf[2] = "two"

    for (key in mutableMapOf.keys) {
        println(mutableMapOf[key])
    }

    for ((key,value) in mutableMapOf) {
        println("$key = $value")
    }

    for ((key,value) in mutableMapOf.entries) {
        println("$key = $value")
    }

    // 컬렉션의 null 가능성
    // List<Int?> : 리스트에 null 이 들어갈 수 있지만, 리스트는 절대 null 이 아님
    val aa1: List<Int?> = listOf(null)

    var sum:Int = 0
    for (a in aa1) {
        a?.let { sum+=it }
    }
    println("aa1 sum = ${sum}")

    val aa2: List<Int?> = listOf(1,2,3,4)

    var sum2:Int = 0
    for (a in aa2) {
        a?.let { sum2+=it }
    }
    println("aa2 sum = ${sum2}")

    // List<Int>? : 리스트 목록에는 null 이 들어갈 수 없지만, 리스트는 null 일 수 있음
    val a1: List<Int>? = null
    a1?.let {
        var sum:Int = 0
        for (i in it) {
            sum += i;
        }
        println("a1 sum = ${sum}")
    }

    val a2: List<Int>? = listOf(1,2,3,4)
    a2?.let {
        var sum:Int = 0
        for (i in it) {
            sum += i;
        }
        println("a2 sum = ${sum}")
    }

    // List<Int?>? : 리스트에 null 이 들어갈 수도 있고, 리스트가 null 일 수도 있음

    val aaa1: List<Int?>? = null
    aaa1?.let {
        var sum: Int = 0
        it.forEach {value -> sum += value ?: 0}
        println("aaa1 sum = ${sum}")
    }

    val aaa2: List<Int?>? = listOf(1,2,3,4)
    aaa2?.let { it ->
        var sum: Int = 0
        it.forEach { it2 ->
            sum += it2 ?: 0
        }
        println("aaa2 sum = ${sum}")
    }
}

private fun printNumbers(numbers : List<Int>) {

}