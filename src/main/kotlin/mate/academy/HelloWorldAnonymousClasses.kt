package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val result = mutableListOf<String>()

        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        val greetings = listOf(englishGreeting, frenchGreeting, spanishGreeting)

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
