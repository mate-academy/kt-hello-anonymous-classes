package mate.academy

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf()))
    println(helloWorld.sayHello(listOf("Alice", "Bob")))
}

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

        val greetingsList = listOf(englishGreeting, frenchGreeting, spanishGreeting)
        val result = mutableListOf<String>()
        for (value in greetingsList) {
            result.add(value.greet())
        }

        for (name in names) {
            result.add(englishGreeting.greetSomeone(name))
            result.add(frenchGreeting.greetSomeone(name))
            result.add(spanishGreeting.greetSomeone(name))
        }
        return result
    }
}
