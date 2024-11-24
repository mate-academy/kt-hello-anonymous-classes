package mate.academy

private const val SPANISH_GREETING = "Hola, mundo"
private const val ENGLISH_GREETING = "Hello world"
private const val FRENCH_GREETING = "Salut tout le monde"
private const val ENGLISH_HI = "Hello"
private const val FRENCH_HI = "Salut"
private const val SPANISH_HI = "Hola,"

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val listOfGreeting : MutableList<String> = mutableListOf()

        val englishImplementation = object : HelloWorldGreeting {
            override fun greet(): String = ENGLISH_GREETING
            override fun greetSomeone(someone: String): String = "$ENGLISH_HI $someone"
        }

        val frenchImplementation = object : HelloWorldGreeting {
            override fun greet(): String = FRENCH_GREETING
            override fun greetSomeone(someone: String): String = "$FRENCH_HI $someone"
        }

        val spanishImplementation = object : HelloWorldGreeting {
            override fun greet(): String = SPANISH_GREETING
            override fun greetSomeone(someone: String): String = "$SPANISH_HI $someone"
        }

        listOfGreeting.add(englishImplementation.greet())
        listOfGreeting.add(frenchImplementation.greet())
        listOfGreeting.add(spanishImplementation.greet())

        for (name in names) {
            listOfGreeting.add(englishImplementation.greetSomeone(name))
            listOfGreeting.add(frenchImplementation.greetSomeone(name))
            listOfGreeting.add(spanishImplementation.greetSomeone(name))
        }

        return listOfGreeting
    }
}
