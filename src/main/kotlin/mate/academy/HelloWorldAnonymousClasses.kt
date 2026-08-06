package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    object EnglishGreeting : HelloWorldGreeting {
        override fun greet(): String = "Hello world"

        override fun greetSomeone(someone: String): String = "Hello $someone"
    }

    object FrenchGreeting : HelloWorldGreeting {
        override fun greet(): String = "Salut tout le monde"

        override fun greetSomeone(someone: String): String = "Salut $someone"
    }

    object SpanishGreeting : HelloWorldGreeting {
        override fun greet(): String = "Hola, mundo"

        override fun greetSomeone(someone: String): String = "Hola, $someone"
    }

    fun sayHello(names: List<String>): List<String> {
        val languages = listOf(EnglishGreeting, FrenchGreeting, SpanishGreeting)
        return languages.map { it.greet() } +
                names.flatMap { name -> languages.map { it.greetSomeone(name) } }
    }

}
