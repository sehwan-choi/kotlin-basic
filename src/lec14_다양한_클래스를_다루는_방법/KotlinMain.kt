package lec14_다양한_클래스를_다루는_방법

fun main() {
    val personDto = PersonDto(name = "A", age = 10)
    val personDto2 = PersonDto("A", 20)
    println(personDto == personDto2)
    println(personDto)
}

// class 앞에 data 를 붙여주면
// equals, hashCode, toString 을 만들어준다
data class PersonDto(
    val name: String,
    val age: Int,
)

enum class  Country(
    private val code: String,
) {

    KOREA("KO"),
    AMERICA("US"),
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("KOREA")
        Country.AMERICA -> println("AMERICA")
    }
}

sealed class HyundaiCar (
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar("아반떼", 2000L)
class Sonata : HyundaiCar("소나타", 3000L)
class Grandeur : HyundaiCar("그랜져", 4000L)

fun handleCar(car: HyundaiCar) {
    when(car) {
        is Avante -> println(car.name)
        is Sonata -> println(car.name)
        is Grandeur -> println(car.name)
    }
}