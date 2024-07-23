package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet() = "Hello world"
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

        val greeting = mutableListOf<String>()

        greeting.add(englishGreeting.greet())
        greeting.add(frenchGreeting.greet())
        greeting.add(spanishGreeting.greet())

        for (name in names) {
            greeting.add(englishGreeting.greetSomeone(name))
            greeting.add(frenchGreeting.greetSomeone(name))
            greeting.add(spanishGreeting.greetSomeone(name))
        }
        return greeting
    }
}
