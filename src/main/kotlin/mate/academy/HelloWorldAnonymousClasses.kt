package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()

        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"

            override fun greetSomeone(someone: String): String = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"

            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"

            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        greetings.add(englishGreeting.greet())
        greetings.add(frenchGreeting.greet())
        greetings.add(spanishGreeting.greet())

        names.forEach {
            greetings.add(englishGreeting.greetSomeone(it))
            greetings.add(frenchGreeting.greetSomeone(it))
            greetings.add(spanishGreeting.greetSomeone(it))
        }

        return greetings
    }
}
