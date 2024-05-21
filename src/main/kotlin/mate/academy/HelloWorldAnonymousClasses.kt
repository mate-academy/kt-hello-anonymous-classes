package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val english = object : HelloWorldGreeting {
            override fun greet() = "Hello world"

            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val french = object : HelloWorldGreeting {
            override fun greet() = "Salut tout le monde"

            override fun greetSomeone(someone: String) = "Salut $someone"
        }

        val spanish = object : HelloWorldGreeting {
            override fun greet() = "Hola, mundo"

            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        val greetingObjects = listOf(english, french, spanish)
        return greetingObjects.map { it.greet() } +
                names.flatMap { name -> greetingObjects.map { it.greetSomeone(name) } }
    }
}
