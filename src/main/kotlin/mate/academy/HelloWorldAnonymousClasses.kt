package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        // Anonymous English greeting
        val english = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String): String = "Hello $someone"
        }

        // Anonymous French greeting
        val french = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        // Anonymous Spanish greeting
        val spanish = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        val result = mutableListOf<String>()
        // General greetings
        result.addAll(listOf(english.greet(), french.greet(), spanish.greet()))

        // Personalized greetings for each name
        for (name in names) {
            result.addAll(listOf(english.greetSomeone(name), french.greetSomeone(name), spanish.greetSomeone(name)))
        }

        return result
    }
}
