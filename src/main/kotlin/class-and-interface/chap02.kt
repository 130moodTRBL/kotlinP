package `class-and-interface`

data class GalaxyTab_(val modelName: String, val size: Int) {

}

fun main() {
    val tab1 = GalaxyTab_("s7", 1)
    val tab2 = tab1.copy(modelName = "s6")

    println(tab1)
    println(tab2)
}