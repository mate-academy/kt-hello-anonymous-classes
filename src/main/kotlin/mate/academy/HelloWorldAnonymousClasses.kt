package mate.academy

class HelloWorldAnonymousClasses {
    companion object {
        const val ENGLISH_GREET = "Hello world"
        const val FRENCH_GREET = "Salut tout le monde"
        const val SPANISH_GREET = "Hola, mundo"
        const val ENGLISH_GREET_SOMEONE = "Hello"
        const val FRENCH_GREET_SOMEONE = "Salut"
        const val SPANISH_GREET_SOMEONE = "Hola,"
    }

    private val listOfWorldGreetings: List<HelloWorldGreeting>

    private val engGreeting = object : HelloWorldGreeting {
        override fun greet(): String {
            return ENGLISH_GREET
        }

        override fun greetSomeone(someone: String): String {
            return "$ENGLISH_GREET_SOMEONE $someone"
        }
    }

    private val frGreeting = object : HelloWorldGreeting {
        override fun greet(): String {
            return FRENCH_GREET
        }

        override fun greetSomeone(someone: String): String {
            return "$FRENCH_GREET_SOMEONE $someone"
        }
    }

    private val spGreeting = object : HelloWorldGreeting {
        override fun greet(): String {
            return SPANISH_GREET
        }

        override fun greetSomeone(someone: String): String {
            return "$SPANISH_GREET_SOMEONE $someone"
        }
    }

    init {
        listOfWorldGreetings = listOf(
            engGreeting,
            frGreeting,
            spGreeting
        )
    }

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val result: MutableList<String> = ArrayList()
        listOfWorldGreetings.forEach { item -> result.add(item.greet()) }
        names.forEach { someone ->
            listOfWorldGreetings.forEach { greet ->
                result.add(greet.greetSomeone(someone))
            }
        }
        return result
    }
}
