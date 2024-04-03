package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        val result = mutableListOf<String>()

        fun addInitialGreetingsAndMessages() {
            result.add(greetings.greet())
            result.add("Salut tout le monde")
            result.add("Hola, mundo")
        }

        if (names.isNotEmpty()) {
            addInitialGreetingsAndMessages()

            for (name in names) {
                result.add(greetings.greetSomeone(name))
                result.add("Salut $name")
                result.add("Hola, $name")
            }
        } else {
            addInitialGreetingsAndMessages()
        }

        return result
    }

}
