package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {

        val englishGreeter = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String): String = "Hello $someone"
        }

        val frenchGreeter = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        val spanishGreeter = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        val greeters = listOf(englishGreeter, frenchGreeter, spanishGreeter)

        val greetings = mutableListOf<String>()
        greeters.forEach { greeter ->
            greetings.add(greeter.greet())
        }
        names.forEach { name ->
            greeters.forEach { greeter ->
                greetings.add(greeter.greetSomeone(name))
            }
        }
        return greetings
    }
}
