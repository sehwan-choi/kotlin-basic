package lec20_scope_function

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person = Person("최세환", 100)
    println("letPrint")
    letPrint(person)
    letPrint(null)

    println("runPrint")
    runPrint(person)
    runPrint(null)

    println("alsoPrint")
    println(alsoPrint(person))
    println(alsoPrint(null))

    println("applyPrint")
    println(applyPrint(person))
    println(applyPrint(null))

    println("withPrint")
    println(withPrint(person))
}

fun letPrint(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun runPrint(person: Person?) {
    person?.run {
        println(this.name)
        println(age)
    }
}

fun alsoPrint(person: Person?): Person? {
    return person?.also {
        println(it.name)
        println(it.age)
    }
}

fun applyPrint(person: Person?): Person? {
    return person?.apply {
        println(this.name)
        println(age)
    }
}

fun withPrint(person: Person) {
    with(person) {
        println(this.name)
        println(age)
    }
}