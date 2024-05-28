package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet() = "Hello world"

            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet() = "Salut tout le monde"

            override fun greetSomeone(someone: String) = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet() = "Hola, mundo"

            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        val greetingList = listOf(englishGreeting, frenchGreeting, spanishGreeting)

        val generalGreetings = greetingList.map { it.greet() }

        val personalGreetings = names
            .flatMap { name ->
                greetingList
                    .map { greeting -> greeting.greetSomeone(name) }
            }

        return generalGreetings.union(personalGreetings).toList()

    }
}
