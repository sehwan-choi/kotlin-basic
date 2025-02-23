package lec20_scope_function.run

data class Person(
    val name: String,
    var age: Int
)

fun main() {
    println(runPerson())
    println(runPerson2())
}

// 객체 초기화와 람다 내부에서 변환된 값 반환
fun runPerson(): Person {
    return Person("최세환", 10).run {
        val repo = PersonRepository()
        repo.save(this)
    }
}

fun runPerson2(): Int {
    return Person("최세환", 10).run {
        println(this)
        age + 10
    }
}

class PersonRepository() {
    fun save(person: Person): Person {
        println("Saving $person")
        return person
    }
}