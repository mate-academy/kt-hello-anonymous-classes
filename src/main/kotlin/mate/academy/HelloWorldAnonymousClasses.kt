package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val result: MutableList<String> = mutableListOf()
        val greetings = listOf<HelloWorldGreeting>(
            object : HelloWorldGreeting {
                override fun greet() = "Hello world"
                override fun greetSomeone(someone: String) = "Hello $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = "Salut tout le monde"
                override fun greetSomeone(someone: String) = "Salut $someone"

            },
            object : HelloWorldGreeting {
                override fun greet() = "Hola, mundo"
                override fun greetSomeone(someone: String) = "Hola, $someone"

            }
        )

        greetings.forEach { greeting -> result.add(greeting.greet()) }

        names.forEach{name -> greetings.forEach{
            greeting -> result.add(greeting.greetSomeone(name))}
        }
        return result
    }
}
