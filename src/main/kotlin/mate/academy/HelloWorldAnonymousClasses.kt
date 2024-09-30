package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val listOfGreetings: MutableList<String> = mutableListOf()

        val englishImplementation = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        val frenchImplementation = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val spanishImplementation = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        listOfGreetings.add(englishImplementation.greet())
        listOfGreetings.add(frenchImplementation.greet())
        listOfGreetings.add(spanishImplementation.greet())

        for (name in names) {
            listOfGreetings.add(englishImplementation.greetSomeone(name))
            listOfGreetings.add(frenchImplementation.greetSomeone(name))
            listOfGreetings.add(spanishImplementation.greetSomeone(name))
        }

        return listOfGreetings
    }
}
