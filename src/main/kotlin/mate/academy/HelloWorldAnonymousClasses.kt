package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = listOf(
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

        val results = greetings.map { it.greet() }.toMutableList()

        names.forEach { name ->
            greetings.forEach { greeting ->
                results.add(greeting.greetSomeone(name))
            }
        }

        return results
    }
}
