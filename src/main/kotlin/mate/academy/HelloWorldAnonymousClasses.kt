package mate.academy

import java.util.*

private const val SPANISH_GREETING = "Hola, mundo"

private const val ENGLISH_GREETING = "Hello world"

private const val FRENCH_GREETING = "Salut tout le monde"

private const val ENGLISH_HI = "Hello"

private const val FRENCH_HI = "Salut"

private const val SPANISH_HI = "Hola"

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val listOfGreetings: MutableList<String> = mutableListOf()

        val englishImplementation = object : HelloWorldGreeting {
            override fun greet(): String = ENGLISH_GREETING

            override fun greetSomeone(someone: String): String = String.format(Locale.ENGLISH, "%s %s", ENGLISH_HI, someone)
        }

        val frenchImplementation = object : HelloWorldGreeting {
            override fun greet(): String = FRENCH_GREETING

            override fun greetSomeone(someone: String): String = String.format(Locale.ENGLISH, "%s %s", FRENCH_HI, someone)
        }

        val spanishImplementation = object : HelloWorldGreeting {
            override fun greet(): String = SPANISH_GREETING

            override fun greetSomeone(someone: String): String = String.format(Locale.ENGLISH, "%s, %s", SPANISH_HI, someone)
        }

        listOfGreetings.addAll(listOf(englishImplementation.greet(),
            frenchImplementation.greet(), spanishImplementation.greet()))

        for (name in names) {
            listOfGreetings.addAll(listOf(englishImplementation.greetSomeone(name),
                frenchImplementation.greetSomeone(name), spanishImplementation.greetSomeone(name)))
        }

        return listOfGreetings
    }
}
