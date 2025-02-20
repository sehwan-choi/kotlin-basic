package lec12_object_키워드를_다루는_방법

fun main() {
    Person.newBaby("hi")

    print(Singleton.a)

    // 익명 클래스 사용
    moveSomething(object : Moveable {
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("날다")
        }

    })
}

// 익명 클래스 사용
interface Moveable {
    fun move()
    fun fly()
}

private fun moveSomething(moveable: Moveable) {
    moveable.move()
    moveable.fly()
}

class Person (
    name:String,
    age:Int,
) {

    // static 변수, 함수 만드는 경우 companion object 로 만든다.
    companion object Factory : Log{
         const val MIN_AGE:Int = 1

        @JvmStatic
        fun newBaby(name: String) : Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Log!")
        }
    }

    private var name:String = name
    private var age:Int = age

}

interface Log {
    fun log()
}

// 싱글톤 클래스를 만들때 object 를 사용한다.
object Singleton {
    var a: Int = 0
}