package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String {
           return "Hello world!"
        }
        fun greetSomeone(someone: String): String{
            return "Hello $someone!"
        }
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

        val greetings = listOf(englishGreeting, frenchGreeting, spanishGreeting)
        val result = mutableListOf<String>()
        for (greeting in greetings) {
            result.add(greeting.greet())
        }

        for (name in names) {
            for (greeting in greetings) {
                result.add(greeting.greetSomeone(name))
            }
        }
        return result
    }
}
