package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val result: MutableList<String> = mutableListOf()
        val greeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world, Salut tout le monde, Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {

                return "Hello $someone, Salut $someone, Hola, $someone"
            }
        }

        result.addAll(greeting.greet().split(", ", limit = 3))

        names.forEach { name ->
            result.addAll(greeting.greetSomeone(name).split(", ", limit = 3))
        }
        return result
    }
}

