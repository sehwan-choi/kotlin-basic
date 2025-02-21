package lec13_중첩클래스를_다루는_방법

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
    private val livingRoom2: LivingRoom2
) {
    // 권장하는 중첩 클래스
    // 바깥 클래스의 프로퍼티를 가져올수 없다 static class
    class LivingRoom(
        private var area: Double,
    )

    // 권장하지 않는 중첩 클래스
    // 바깥클래스의 프로퍼티를 가져올수 있음
    inner class LivingRoom2 (
        private var area: Double,
    ) {
        val address: String
            get() = this@House.address
    }
}