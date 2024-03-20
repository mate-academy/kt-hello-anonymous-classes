package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
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
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }

        }

        val greets = listOf(
            englishGreeting.greet(), frenchGreeting.greet(),
            spanishGreeting.greet()
        )

        val nameGreets = names.flatMap { name ->
            listOf(
                englishGreeting.greetSomeone(name),
                frenchGreeting.greetSomeone(name), spanishGreeting.greetSomeone(name)
            )
        }

        return greets + nameGreets
    }
}
