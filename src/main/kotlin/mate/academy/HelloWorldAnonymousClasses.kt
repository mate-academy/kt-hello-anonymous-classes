package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = listOf(
            object : HelloWorldGreeting {
                override fun greet(): String {
                    return "Hello world"
                }

                override fun greetSomeone(someone: String): String {
                    return "Hello $someone"
                }
            },
            object : HelloWorldGreeting {
                override fun greet(): String {
                    return "Salut tout le monde"
                }

                override fun greetSomeone(someone: String): String {
                    return "Salut $someone"
                }
            },
            object : HelloWorldGreeting {
                override fun greet(): String {
                    return "Hola, mundo"
                }

                override fun greetSomeone(someone: String): String {
                    return "Hola, $someone"
                }
            }
        )

        val result = mutableListOf<String>()

        for (greeting in greetings) {
            result.add(greeting.greet())
        }

        for (name in names) {
            for (greeting in greetings) {
                result.add(greeting.greetSomeone(name))
            }
        }

        return result
    }
}
