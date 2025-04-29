package mate.academy

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf("123", "$$$")))
}

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()
        greetings.add(englishGreeting.greet())
        greetings.add(frenchGreeting.greet())
        greetings.add(spanishGreeting.greet())
        for (name in names) {
            greetings.add(englishGreeting.greetSomeone(name))
            greetings.add(frenchGreeting.greetSomeone(name))
            greetings.add(spanishGreeting.greetSomeone(name))
        }
        return greetings
    }

    private val englishGreeting = object : HelloWorldGreeting {
        override fun greet() = "Hello world"
        override fun greetSomeone(someone: String): String {
            return "Hello $someone"
        }
    }

    private val frenchGreeting = object : HelloWorldGreeting {
        override fun greet() = "Salut tout le monde"
        override fun greetSomeone(someone: String): String {
            return "Salut $someone"
        }
    }

    private val spanishGreeting = object : HelloWorldGreeting {
        override fun greet() = "Hola, mundo"
        override fun greetSomeone(someone: String): String {
            return "Hola, $someone"
        }
    }
}
