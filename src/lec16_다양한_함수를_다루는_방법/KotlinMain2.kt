package lec16_다양한_함수를_다루는_방법

// 중위 함수(infix 함수)
// inline 함수
// 지역함수
fun main() {
    println(3.add(4))
    println(3.add2(4))
    println(3 add2 4)
    println(3.add3(4))

    createPerson("hong","gildong")

    createPerson(null,"gildong")
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}

class PersonKt(
    private val firstName: String,
    private val lastName: String,
    private var age: Int
)

fun createPerson(firstName: String?, lastName: String?): PersonKt {
    fun validateName(name: String?, fieldName: String?) {
        name ?: throw IllegalArgumentException("${fieldName} 은 비어있을 수 없습니다. 현재 값 : ${name}")
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")
    println("firstName = ${firstName}, lastName = ${lastName}")
    return PersonKt(firstName = firstName ?: "empty", lastName = lastName ?: "empty", age =100)
}