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
        val res = mutableListOf(
            englishGreeting.greet(), frenchGreeting.greet(), spanishGreeting.greet())
        for (name in names) {
            res.add(englishGreeting.greetSomeone(name))
            res.add(frenchGreeting.greetSomeone(name))
            res.add(spanishGreeting.greetSomeone(name))
        }
        return res
    }
}
