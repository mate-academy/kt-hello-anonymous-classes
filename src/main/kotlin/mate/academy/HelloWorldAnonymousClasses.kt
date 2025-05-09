package mate.academy

private const val ENGLISH_HELLO = "Hello world"

private const val FRENCH_HELLO = "Salut tout le monde"

private const val SPANISH_HELLO = "Hola, mundo"

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return ENGLISH_HELLO
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }
        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return FRENCH_HELLO
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return SPANISH_HELLO
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        val greetings: List<HelloWorldGreeting> = listOf(
            englishGreeting,
            frenchGreeting,
            spanishGreeting
        )

        val result = mutableListOf<String>()
        for (greeting in greetings) {
            result.add(greeting.greet())
        }
        for (name in names) {
            for (greeting in greetings)
            result.add(greeting.greetSomeone(name))
        }
        return result
    }
}
