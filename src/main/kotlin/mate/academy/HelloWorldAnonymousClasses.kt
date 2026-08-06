package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()

        val english = object: HelloWorldGreeting {
            override fun greet() = "Hello world"

            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val french = object: HelloWorldGreeting {
            override fun greet() = "Salut tout le monde"

            override fun greetSomeone(someone: String) = "Salut $someone"
        }

        val spanish = object: HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        greetings.add(english.greet())
        greetings.add(french.greet())
        greetings.add(spanish.greet())

        for (name in names) {
            greetings.add(english.greetSomeone(name))
            greetings.add(french.greetSomeone(name))
            greetings.add(spanish.greetSomeone(name))
        }

        return greetings
    }
}
