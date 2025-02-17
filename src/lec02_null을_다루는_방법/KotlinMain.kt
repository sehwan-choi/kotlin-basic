package lec02_null을_다루는_방법

// Tag: safe call, 엘비스 연산자, ?. , ?: , !!.
fun main() {
    var str: String? = "abc"

    // str이 null 일수 있기 때문에 호출 불가능
//    str.length

    // 변수명? : (safe call ex, str?. )
    // str이 null이 아니면 length 를 실행 시키고
    // null 이라면 null을 반환
    println(str?.length)    //  3 출력

    str = null
    println(str?.length)    //  null 출력

    // ?: (엘비스 연산자)
    // str 이 null이 아니고
    // str.length 가 null 이라면 기본값으로 -1을 출력하게 한다
    println(str?.length ?: -1)    //  -1 출력

    println(length(str))

    str = "ABC"

    println(length(str))

    startsWith(null)
}

// Lec02Main.length
fun length(str: String?): Int {
    str ?: return 0 //  str 이 null 이면 바로 0 리턴 (early return)
    return str.length
}

// Lec02Main.startsWithA1
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}

// Lec02Main.startsWithA2
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

// Lec02Main.startsWithA3
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// 파라미터로 nullable 값이 들어올수 있지만
// !!. 를 사용해서 파라미터가 절때 null이 될수 없음을 컴파일러에게 전달
// 만일 파라미터가 null 이라면 런타임 시점에 NPE 이 발생한다
fun startsWith(str: String?) : Boolean {
    return str!!.startsWith("A")
}