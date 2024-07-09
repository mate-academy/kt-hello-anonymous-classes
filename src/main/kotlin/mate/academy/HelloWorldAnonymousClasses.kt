package mate.academy

const val  ENGLISH_GREETING = "Hello world"
const val  FRENCH_GREETING = "Salut tout le monde"
const val  SPANISH_GREETING = "Hola, mundo"
const val ENGLISH_GREET_SOMEONE = "Hello"
const val FRENCH_GREET_SOMEONE = "Salut"
const val SPANISH_GREET_SOMEONE = "Hola,"


class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object: HelloWorldGreeting {
            override fun greet(): String = ENGLISH_GREETING

            override fun greetSomeone(someone: String): String = "$ENGLISH_GREET_SOMEONE $someone"
        }

        val frenchGreeting = object: HelloWorldGreeting {
            override fun greet(): String = FRENCH_GREETING

            override fun greetSomeone(someone: String): String = "$FRENCH_GREET_SOMEONE $someone"
        }

        val spanishGreeting = object: HelloWorldGreeting {
            override fun greet(): String = SPANISH_GREETING

            override fun greetSomeone(someone: String): String = "$SPANISH_GREET_SOMEONE $someone"
        }
        val greetings = mutableListOf(englishGreeting.greet(),
                                      frenchGreeting.greet(),
                                      spanishGreeting.greet())
        if (names.isNotEmpty()) {
            for (name in names) {
                greetings.add(englishGreeting.greetSomeone(name))
                greetings.add(frenchGreeting.greetSomeone(name))
                greetings.add(spanishGreeting.greetSomeone(name))
            }
        }
        return greetings
    }
}

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf("Alice", "Bob")))
    println(helloWorld.sayHello(listOf()))
}
