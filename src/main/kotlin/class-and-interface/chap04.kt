package `class-and-interface`

sealed abstract class PersonState

object Running : PersonState()
object Walking : PersonState()
object Idle : PersonState()
object RunningFast : PersonState()

fun getStateMessage(personState: PersonState): String {
    return when(personState) {
        is Running -> "running"
        is Walking -> "walking"
        is Idle -> "idling"
        is RunningFast -> "running fast"
    }
}

fun main() {

}