package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()

        // Anonymous class for English greeting
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String): String = "Hello $someone"
        }

        // Anonymous class for French greeting
        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        // Anonymous class for Spanish greeting
        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        // Add general greetings to the list
        greetings.add(englishGreeting.greet())
        greetings.add(frenchGreeting.greet())
        greetings.add(spanishGreeting.greet())

        // Add personalized greetings for each name
        for (name in names) {
            greetings.add(englishGreeting.greetSomeone(name))
            greetings.add(frenchGreeting.greetSomeone(name))
            greetings.add(spanishGreeting.greetSomeone(name))
        }

        return greetings
    }
}
