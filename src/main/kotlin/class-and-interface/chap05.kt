package `class-and-interface`

object SingletonClass {
    val sampleString by lazy { "sample string" }
}

fun main() {
    if(SingletonClass.sampleString == SingletonClass.sampleString) println(true)
    if(SingletonClass.sampleString === SingletonClass.sampleString) println(true)
}