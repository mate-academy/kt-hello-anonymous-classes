package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    companion object {
        const val GREET_WORLD_EN = "Hello world"
        const val GREET_WORLD_FR = "Salut tout le monde"
        const val GREET_WORLD_ES = "Hola, mundo"
        const val GREET_PERSON_EN = "Hello"
        const val GREET_PERSON_FR = "Salut"
        const val GREET_PERSON_ES = "Hola"
    }

    fun sayHello(names: List<String>): List<String> {
        val greetingsList = mutableListOf<String>()

        val greetings = listOf(
            object : HelloWorldGreeting {
                override fun greet() = GREET_WORLD_EN
                override fun greetSomeone(someone: String) = "$GREET_PERSON_EN $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = GREET_WORLD_FR
                override fun greetSomeone(someone: String) = "$GREET_PERSON_FR $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = GREET_WORLD_ES
                override fun greetSomeone(someone: String) = "$GREET_PERSON_ES, $someone"
            }
        )

        greetings.forEach { greeting ->
            greetingsList.add(greeting.greet())
        }

        if (names.isNotEmpty()) {
            names.forEach { name ->
                greetings.forEach { greeting ->
                    greetingsList.add(greeting.greetSomeone(name))
                }
            }
        }

        return greetingsList
    }
}

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf("Alice", "Bob")))
    println(helloWorld.sayHello(listOf()))
}
