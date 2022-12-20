package `class-and-interface`

class Task {
    var state: State = State.WAITING

    fun printState() = state.print()

    enum class State {
        WAITING, PROCESSING, DONE;
        fun print() = println("${this}...")
    }
}

enum class Color(R: Int, G: Int, B:Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);
}

fun main() {
    //val myColor: Color = Color(1, 2, 3)

    val colorArray: Array<Color> = Color.values()
    colorArray.forEach {
        println(it)
    }
}