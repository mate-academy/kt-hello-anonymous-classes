package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetingsList = mutableListOf<String>()

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

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }

        }

        greetingsList.add(englishGreeting.greet())
        greetingsList.add(frenchGreeting.greet())
        greetingsList.add(spanishGreeting.greet())

        for (name in names) {
            greetingsList.add(englishGreeting.greetSomeone(name))
            greetingsList.add(frenchGreeting.greetSomeone(name))
            greetingsList.add(spanishGreeting.greetSomeone(name))
        }

        return greetingsList
    }
}


fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf("Alice", "Bob")))
    println(helloWorld.sayHello(listOf()))
}
