package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = mutableListOf<String>()
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val spanishGreeting =  object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

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
}

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()

    println(helloWorld.sayHello(listOf("Alice", "Bob")))
}
