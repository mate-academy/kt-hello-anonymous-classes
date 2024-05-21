package mate.academy

const val ENGLISH_GENERAL_GREETING = "Hello world"
const val FRENCH_GENERAL_GREETING = "Salut tout le monde"
const val SPANISH_GENERAL_GREETING = "Hola, mundo"
const val HELLO = "Hello"
const val SALUT = "Salut"
const val HOLA = "Hola,"

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return ENGLISH_GENERAL_GREETING
            }

            override fun greetSomeone(someone: String): String {
                return "$HELLO $someone"
            }

        }
        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return FRENCH_GENERAL_GREETING
            }

            override fun greetSomeone(someone: String): String {
                return "$SALUT $someone"
            }
        }
        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return SPANISH_GENERAL_GREETING
            }

            override fun greetSomeone(someone: String): String {
                return "$HOLA $someone"
            }
        }
        val generalGreetings = mutableListOf(englishGreeting, frenchGreeting, spanishGreeting)
            .map { it.greet() }.toMutableList()
        for (name in names) {
            generalGreetings.add(englishGreeting.greetSomeone(name))
            generalGreetings.add(frenchGreeting.greetSomeone(name))
            generalGreetings.add(spanishGreeting.greetSomeone(name))
        }
        return generalGreetings
    }
}
