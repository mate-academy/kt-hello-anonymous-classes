package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greeting = mutableListOf<String>();

        val englishGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String): String = "Hello ${someone}"
        }
        val frenchGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut ${someone}"
        }
        val spanishGreeting: HelloWorldGreeting = object : HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, ${someone}"
        }

        var greets = listOf(englishGreeting.greet(), frenchGreeting.greet(), spanishGreeting.greet());
        greeting.addAll(greets)
        for (name in names) {
            greets = listOf(
                englishGreeting.greetSomeone(name),
                frenchGreeting.greetSomeone(name),
                spanishGreeting.greetSomeone(name)
            );
            greeting.addAll(greets)
        }
        return greeting
    }
}
