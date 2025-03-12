package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val result = mutableSetOf<String>()

        result.add(EnglishGreeting.greet())
        result.add(FrenchGreeting.greet())
        result.add(SpanishGreeting.greet())
        for (i in names.indices) {
            result.add(EnglishGreeting.greetSomeone(names[i]))
            result.add(FrenchGreeting.greetSomeone(names[i]))
            result.add(SpanishGreeting.greetSomeone(names[i]))
        }
        return result.toList()
    }

    object EnglishGreeting : HelloWorldGreeting {
        override fun greet(): String {
            return "Hello world"
        }

        override fun greetSomeone(someone: String): String {
            return "Hello $someone"
        }
    }

    object FrenchGreeting : HelloWorldGreeting {
        override fun greet(): String {
            return "Salut tout le monde"
        }

        override fun greetSomeone(someone: String): String {
            return "Salut $someone"
        }
    }

    object SpanishGreeting : HelloWorldGreeting {
        override fun greet(): String {
            return "Hola, mundo"
        }

        override fun greetSomeone(someone: String): String {
            return "Hola, $someone"
        }
    }
}

