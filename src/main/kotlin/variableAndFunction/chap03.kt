package variableAndFunction

data class Person(
    var name: String = "",
    var age: Int = 0,
    var temperature: Float = 36.5f
) {
    fun isSick(): Boolean = temperature > 37.5f
}

fun a(str: String) {
    println("${str}에서 호출한 a")
}

fun b(function: (String)->Unit) {
    function("basdfasfasdf")
}

fun main() {
    b(::a)

    val c = { str: String-> println("${str} 함수") }
    b(c)
}