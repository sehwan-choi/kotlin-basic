package lec09_클래스를_다루는_방법

fun main() {
    val person = KotlinPerson("최세환", 10)
    println(person.name)
    println(person.age)

    person.age = 30
    println(person.age)

    val javaPerson = JavaPerson("최세환", 20)
    println(javaPerson.name)
    println(javaPerson.age)
    javaPerson.age = 40
    println(javaPerson.age)

    val kotlinPerson = KotlinPerson("최세환")
    val kotlinPerson2 = KotlinPerson()

    // custom getter 호출
    println(kotlinPerson2.isAdult)

    // custom getter 호출
    val kotlinPerson11 = KotlinPerson("sehwan")
    println(kotlinPerson11.uppercaseName)

    // backing field 를 이용
    val kotlinPerson22 = KotlinPerson2("sehwan")
    println(kotlinPerson22.name)
}