package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet() = greetSomeone("world")
            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet() = greetSomeone("tout le monde")
            override fun greetSomeone(someone: String) = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet() = greetSomeone("mundo")
            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        val result = mutableListOf<String>()
        result.add(englishGreeting.greet())
        result.add(frenchGreeting.greet())
        result.add(spanishGreeting.greet())

        names.forEach { name ->
            result.add(englishGreeting.greetSomeone(name))
            result.add(frenchGreeting.greetSomeone(name))
            result.add(spanishGreeting.greetSomeone(name))
        }
        return result
    }
}
