package lec03_Type_다루는_방법

/**
 * Kotlin 의 특이한 타입
 * Any : Java의 Object 와 같은 최상위 오브젝트
 * Unit : Java의 void 와 동일
 * Nothing : 함수가 정상적으로 끝나지 않은 사실을 표현
 *  - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
 *    fun fail(message: String): Nothing {
 *      throw IllegalArgumentException(message)
 *    }
 */
// Tag: is, !is, as, as?
fun main() {

    val number1 = 3

    // 아래처럼 코틀린에서는 암시적 형변환 불가 to변환 타입의 함수를 호출해야함
    // val number2: Long = number1
    val number2: Long = number1.toLong()

    objIsPerson(Person("최세환", 10))
    objIsPerson2(Person("최세환", 10))
    nullPerson(Person("최세환", 10))
    nullPerson(null)

    val str = """
        ABC
    """.trimIndent()

    println(str)
}

// Lec03Main.objIsPerson
fun objIsPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)

        // 아래와 같이도 사용 가능 obj는 Person 타입으로 간주된다.
        // println(obj.age)
    }
}

// Lec03Main.objIsPerson
fun objIsPerson2(obj: Any) {
    if (obj is Person) {
        // 아래와 같이도 사용 가능 obj는 Person 타입으로 간주된다.
         println(obj.age)
    }
}

// Lec03Main.objIsNotPerson
fun objIsNotPerson(obj: Any) {
    if (obj !is Person) {
        // 추가 로직
    }
}

// 파라미터가 null 인경우
// as? 를 사용하면 null 인경우 person 은 null 이되고
// null이 아니면 person 은 obj 를 Person 으로 형변환해서 값이 들어가진다.
fun nullPerson(obj :Any?) {
    val person = obj as? Person
    println(person?.age)
}