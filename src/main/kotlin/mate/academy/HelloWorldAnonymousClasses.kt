package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
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

        val greetings = mutableListOf(
            englishGreeting.greet(),
            frenchGreeting.greet(),
            spanishGreeting.greet()

        for (name in names) {
            greetings.add(englishGreeting.greetSomeone(name))
            greetings.add(frenchGreeting.greetSomeone(name))
            greetings.add(spanishGreeting.greetSomeone(name))
        }

        return greetings
    }
}

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf("Alice", "Bob")))

    println(helloWorld.sayHello(listOf()))
}
