package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String): String = "Hello $someone"
        }

        val frenchGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        val spanishGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        val generalGreetings = mutableListOf<String>()

        generalGreetings.add(englishGreeting.greet())
        generalGreetings.add(frenchGreeting.greet())
        generalGreetings.add(spanishGreeting.greet())

        for (name in names) {
            generalGreetings.add(englishGreeting.greetSomeone(name))
            generalGreetings.add(frenchGreeting.greetSomeone(name))
            generalGreetings.add(spanishGreeting.greetSomeone(name))
        }

        return generalGreetings
    }
}
