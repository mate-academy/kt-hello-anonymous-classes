package mate.academy

const val ENGLISH_WORLD = "Hello world"
const val FRENCH_WORLD = "Salut tout le monde"
const val SPANISH_WORLD = "Hola, mundo"

const val ENGLISH_GREET = "Hello"
const val FRENCH_GREET = "Salut"
const val SPANISH_GREET = "Hola"

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()

        val greetingObjects = listOf(
            object : HelloWorldGreeting {
                override fun greet() = ENGLISH_WORLD
                override fun greetSomeone(someone: String) = "$ENGLISH_GREET $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = FRENCH_WORLD
                override fun greetSomeone(someone: String) = "$FRENCH_GREET $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = SPANISH_WORLD
                override fun greetSomeone(someone: String) = "$SPANISH_GREET, $someone"
            }
        )

        greetingObjects.forEach { greetings.add(it.greet()) }

        for (name in names) {
            greetingObjects.forEach { greetings.add(it.greetSomeone(name)) }
        }

        return greetings
    }
}

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()

    println(helloWorld.sayHello(listOf("Alice", "Bob")))
}
