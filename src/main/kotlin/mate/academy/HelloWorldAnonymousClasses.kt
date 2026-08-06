package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greeting = mutableListOf<String>()

        val english = object : HelloWorldGreeting {
            override fun greet(): String {return "Hello world"}
            override fun greetSomeone(someone: String): String {return "Hello $someone"}
        }

        val french = object : HelloWorldGreeting {
            override fun greet(): String {return "Salut tout le monde"}
            override fun greetSomeone(someone: String): String {return "Salut $someone"}
        }

        val spanish = object : HelloWorldGreeting {
            override fun greet(): String {return "Hola, mundo"}
            override fun greetSomeone(someone: String): String {return "Hola, $someone"}
        }

        greeting.add(english.greet())
        greeting.add(french.greet())
        greeting.add(spanish.greet())

        for (name in names) {
            greeting.add(english.greetSomeone(name))
            greeting.add(french.greetSomeone(name))
            greeting.add(spanish.greetSomeone(name))
        }

        return greeting
    }
}
