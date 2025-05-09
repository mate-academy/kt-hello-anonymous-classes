package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()

        val englishGreeting = object : HelloWorldGreeting {
            override fun greet() = "Hello world"
            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet() = "Salut tout le monde"
            override fun greetSomeone(someone: String) = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet() = "Hola, mundo"
            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        val greetingObject = listOf(englishGreeting, frenchGreeting, spanishGreeting)

        greetings.addAll(greetingObject.map { it.greet() })

        for (name in names) {
            greetings.addAll(greetingObject.map { it.greetSomeone(name) })
        }

        return greetings
    }
}
