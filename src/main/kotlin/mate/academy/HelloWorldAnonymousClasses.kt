package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val genericGreetings = listOf("Hello world", "Salut tout le monde", "Hola, mundo")

        val englishGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        val frenchGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val spanishGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        val personalizedGreetings = names.flatMap { name ->
            listOf(
                englishGreeting.greetSomeone(name),
                frenchGreeting.greetSomeone(name),
                spanishGreeting.greetSomeone(name)
            )
        }

        return genericGreetings + personalizedGreetings
    }
}
