package `class-and-interface`

interface ButtonClickListener {
    fun onButtonClicked()
}

class Button(private val buttonClickListener : ButtonClickListener) {
    fun buttonClickCallback() {
        buttonClickListener.onButtonClicked()
    }
}

class OKButtonClickListener : ButtonClickListener {
    override fun onButtonClicked() {
        println("OK")
    }
}

fun main() {
    Button(object : ButtonClickListener {
        override fun onButtonClicked() {
            println("OK")
        }
    })
}