package `class-and-interface`

abstract class RectangleAbstract() {
    val numVertex = 4
    abstract val width: Float
    abstract val height: Float

    fun getSize(): Float = width * height
    abstract fun getRectangleTypeName() : String
}

class Square(override val width: Float) : RectangleAbstract() {
    override val height: Float
        get() = width

    override fun getRectangleTypeName() : String {
        return "square"
    }
}


fun main() {
}
