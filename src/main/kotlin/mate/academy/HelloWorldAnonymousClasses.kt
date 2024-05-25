package mate.academy

const val ENGLISH_GREETING = "Hello"
const val FRENCH_GREETING = "Salut"
const val SPANISH_GREETING = "Hola,"
class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet() = "$ENGLISH_GREETING world"

            override fun greetSomeone(someone: String): String {
                return "$ENGLISH_GREETING $someone"
            }
        }
        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "$FRENCH_GREETING tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "$FRENCH_GREETING $someone"
            }
        }
        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "$SPANISH_GREETING mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "$SPANISH_GREETING $someone"
            }
        }
        val generalGreetings = mutableListOf(englishGreeting, frenchGreeting, spanishGreeting)
            .map { it.greet() }.toMutableList()
        names.forEach{ generalGreetings.add(englishGreeting.greetSomeone(it))
            generalGreetings.add(frenchGreeting.greetSomeone(it))
            generalGreetings.add(spanishGreeting.greetSomeone(it))}
        return generalGreetings
    }
}
