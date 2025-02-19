package lec09_클래스를_다루는_방법

// 부생성자 보다는 default parameter를 추천한다.
class KotlinPerson(
    // default parameter
    val name: String = "최세환",
    var age: Int = 30) {

    // 생성자가 호출되는 시점에 호출된다.
    init {
       if (age <= 0) {
           throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
       }
        println("init")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // custom getter
    val isAdult: Boolean
        get() = this.age >= 20

    val uppercaseName: String = this.name.uppercase()
}

class KotlinPerson2(
    name: String = "최세환",
    var age: Int = 30) {

    // 아래와 같이 back field 를 이용한것은 잘 사용하지 않는다
    // custom setter, getter 를 많이사용
    var name: String = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }
}