package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = listOf(
            object : HelloWorldGreeting {
                override fun greet(): String = "Hello world"
                override fun greetSomeone(someone: String): String = "Hello $someone"
            },
            object : HelloWorldGreeting {
                override fun greet(): String = "Salut tout le monde"
                override fun greetSomeone(someone: String): String = "Salut $someone"

            },
            object : HelloWorldGreeting {
                override fun greet(): String = "Hola, mundo"
                override fun greetSomeone(someone: String): String = "Hola, $someone"
            }
        )
        val generalGreeting = greetings.map {it.greet()}
        val personalGreeting = names.flatMap { name -> greetings.map {it.greetSomeone(name) } }
        return generalGreeting + personalGreeting
    }
}
