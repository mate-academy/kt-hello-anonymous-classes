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

        val greetingList: ArrayList<HelloWorldGreeting> =
            arrayListOf(englishGreeting,frenchGreeting,spanishGreeting)
        val result = mutableListOf<String>()

        greetingList.forEach { greeting -> result.add(greeting.greet()) }

        names.forEach { name -> greetingList.forEach { greeting ->
            result.add(greeting.greetSomeone(name)) } }
        return result
    }
}
