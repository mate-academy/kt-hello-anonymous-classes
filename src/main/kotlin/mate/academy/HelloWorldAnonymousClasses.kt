package mate.academy

class HelloWorldAnonymousClasses {
    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    object EnglishGreeting: HelloWorldGreeting  {
        override fun greet() = "Hello world"

        override fun greetSomeone(someone: String) = "Hello $someone"
    }

    object FrenchGreeting: HelloWorldGreeting  {
        override fun greet() = "Salut tout le monde"

        override fun greetSomeone(someone: String) = "Salut $someone"
    }

    object SpanishGreeting: HelloWorldGreeting  {
        override fun greet() = "Hola, mundo"

        override fun greetSomeone(someone: String) = "Hola, $someone"
    }

    fun sayHello(names: List<String>): List<String> {
        val resultList: MutableList<String> = arrayListOf(
            EnglishGreeting.greet(), FrenchGreeting.greet(), SpanishGreeting.greet()
        )
        for (it in names) {
            resultList.add(EnglishGreeting.greetSomeone(it))
            resultList.add(FrenchGreeting.greetSomeone(it))
            resultList.add(SpanishGreeting.greetSomeone(it))
        }
        return resultList
    }
}
