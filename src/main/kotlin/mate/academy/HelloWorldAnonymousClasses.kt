package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {

        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }

        val greetingList = mutableListOf<String>()
        greetingList.add(englishGreeting.greet())
        greetingList.add(frenchGreeting.greet())
        greetingList.add(spanishGreeting.greet())

        for (name in names) {
            greetingList.add(englishGreeting.greetSomeone(name))
            greetingList.add(frenchGreeting.greetSomeone(name))
            greetingList.add(spanishGreeting.greetSomeone(name))
        }

        return greetingList
    }
}

