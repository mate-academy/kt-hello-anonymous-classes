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
        val rezult = mutableListOf(
                EnglishGreeting.greet(),
                FrenchGreeting.greet(),
                SpanishGreeting.greet()
        )
        names.forEach {
                rezult.add(EnglishGreeting.greetSomeone(it))
                rezult.add(FrenchGreeting.greetSomeone(it))
                rezult.add(SpanishGreeting.greetSomeone(it))
        }
        return rezult
    }
}
