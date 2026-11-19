package mate.academy

class HelloWorldAnonymousClasses {
    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val englishGreeting = object : HelloWorldGreeting  {
            override fun greet() = "Hello world"

            override fun greetSomeone(someone: String) = "Hello $someone"
        }

        val frenchGreeting = object : HelloWorldGreeting  {
            override fun greet() = "Salut tout le monde"

            override fun greetSomeone(someone: String) = "Salut $someone"
        }

        val spanishGreeting = object : HelloWorldGreeting  {
            override fun greet() = "Hola, mundo"

            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        val resultList: MutableList<String> = arrayListOf(
            englishGreeting.greet(), frenchGreeting.greet(), spanishGreeting.greet()
        )
        for (it in names) {
            resultList.add(englishGreeting.greetSomeone(it))
            resultList.add(frenchGreeting.greetSomeone(it))
            resultList.add(spanishGreeting.greetSomeone(it))
        }
        return resultList
    }
}
