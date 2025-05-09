package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> { // Anonymous class for English
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        // Anonymous class for French
        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        // Anonymous class for Spanish
        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        val result = mutableListOf<String>()
        result.add(englishGreeting.greet())
        result.add(frenchGreeting.greet())
        result.add(spanishGreeting.greet())
        for (i in names.indices) {
            result.add(englishGreeting.greetSomeone(names[i]))
            result.add(frenchGreeting.greetSomeone(names[i]))
            result.add(spanishGreeting.greetSomeone(names[i]))
        }
        return result.toList()
    }
}

