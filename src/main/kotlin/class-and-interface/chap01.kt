package `class-and-interface`

import javax.print.attribute.standard.MediaSize.Other

class GalaxyTab(val modelName: String, val size: Int) {
    override fun equals(other: Any?): Boolean {
        return if(other is GalaxyTab)
            other.modelName == this.modelName && other.size == this.size
        else
            false
    }

    override fun hashCode(): Int {
        return modelName[1].toString().toInt()
    }

    override fun toString(): String {
        return "GalaxyTab : modelName = ${modelName}, size = ${size}"
    }
}

fun main() {
    val tab = GalaxyTab("s7", 1)
    println(tab.toString())
}