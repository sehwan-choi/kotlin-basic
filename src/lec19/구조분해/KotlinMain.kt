package lec19.구조분해

data class Person(var name: String, var age: Int)

class Person2(var name: String, var age: Int) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}

fun main() {

    // data class의 경우
    val person = Person("최세환",100)
    val (name, age) = person
//    아래는 위와 같다
//    val name = person.component1()
//    val age = person.component2()
    println("이름 $name, 나이 $age")

    // data class가 아닌경우
    val person2 = Person2("최세환",100)
    val (name2, age2) = person2
    println("이름 $name2, 나이 $age2")
}