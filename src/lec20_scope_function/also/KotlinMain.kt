package lec20_scope_function.also
class Person(
    val name: String,
    var age: Int,
) {
    override fun toString(): String {
        return "Person(age=$age, name='$name')"
    }
}
fun main() {
    alsoPerson("최세환", 100)
}

//디버깅 / 로깅 용도로 사용
//언제 사용하면 좋을까?
//객체를 유지하면서 로깅, 디버깅을 추가할 때
fun alsoPerson(
    name: String,
    age: Int,
): Person {
    return Person(name, age).also {
        println("create Person ==> ${it}")
    }
}