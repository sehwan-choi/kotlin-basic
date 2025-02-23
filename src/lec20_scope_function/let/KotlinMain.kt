package lec20_scope_function.let

import lec02_null을_다루는_방법.length

fun main() {
    letPrint()
    letPrint2("abcde")
    letPrint2(null)
    letPrint3(listOf("one", "two", "three", "four"))
    letPrint3(listOf("three", "four"))
}

// let 은 하나 이상의 함수를 call chain 결과로 호출 할 때
fun letPrint() {
    val list = listOf("Apple", "Banana", "Pear", "Grape")

    list.map { it -> it.length }
        .filter { it > 4 }
        .sortedBy { it }
        .let { it -> println(it) }
}

// non-null 값에 대해서만 code block 을 실행시킬때
fun letPrint2(str: String?) {
    val strLength = str?.let {
        println(it.uppercase())
        it.length
    }
    println(strLength)
}

// 일회성으로 제한된 영역에 지역 변수를 만들 때
fun letPrint3(list: List<String>) {
    val item = list.first()
        .let {
            if (it.length >= 5) it else "!$it"
        }.uppercase()
    println(item)
}