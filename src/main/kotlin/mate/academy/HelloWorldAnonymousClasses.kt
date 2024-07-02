package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    private val greetingsList: List<HelloWorldGreeting> = listOf(
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

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()

        greetingsList.forEach { greetings.add(it.greet()) }
        for (name in names) {
            greetingsList.forEach { greetings.add(it.greetSomeone(name)) }
        }

        return greetings
    }
}
