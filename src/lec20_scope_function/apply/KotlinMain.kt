package lec20_scope_function.apply
class Person(
    val name: String,
    var age: Int,
) {
    var hobby: String = ""
    override fun toString(): String {
        return "Person(age=$age, name='$name', hobby='$hobby')"
    }
}

fun main() {
    println(createPerson("최세환",10))
}

//변경 후 원본 객체(Person) 반환
//언제 사용하면 좋을까?
//객체를 설정(초기화)할 때 (Builder 패턴처럼 사용)
fun createPerson(
    name: String,
    age: Int,
): Person{
    return Person(name = name, age = age).apply {
        age + 10
        hobby = "NONE"
    }
}

