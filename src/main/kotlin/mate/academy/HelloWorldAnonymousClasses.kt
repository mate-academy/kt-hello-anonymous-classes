package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = greetSomeone("world")
            override fun greetSomeone(someone: String): String = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String = greetSomeone("tout le monde")
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = greetSomeone("mundo")
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        val greetingsList = listOf(englishGreeting, frenchGreeting, spanishGreeting)

        fun getDefaultGreetings(): List<String> =
                greetingsList.map { it.greet() }

        fun getPersonalGreetingForName(name: String): List<String> =
                greetingsList.map { it.greetSomeone(name) }

        fun getPersonalGreetingForNamesList(): List<String> =
            names.flatMap { getPersonalGreetingForName(it) }

        return getDefaultGreetings() + getPersonalGreetingForNamesList()
    }
}
