package variableAndFunction

fun main() {
    var price = 5000

    var book = Book("um", 10000).apply {
        name = "[[][]] " + name
        discount()
    }

    book.run {
        println("${name}, ${price}")
    }

    book.let {
        println("${it.name}, ${it.price}")
    }
}

data class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}