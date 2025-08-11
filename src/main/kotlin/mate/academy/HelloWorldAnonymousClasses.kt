package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greeting = listOf(
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
        val result = greeting.map { it.greet() }.toMutableList()
        names.forEach { result.addAll(addResult(greeting, it)) }
        return result
    }

    private fun addResult(greeting: List<HelloWorldGreeting>, name: String): List<String> {
        return greeting.map { it.greetSomeone(name) }.toList()
    }
}
