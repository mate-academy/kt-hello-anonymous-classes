package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val resultList: MutableList<String> = mutableListOf()
        val englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        val frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        resultList.add(englishGreeting.greet())
        resultList.add(frenchGreeting.greet())
        resultList.add(spanishGreeting.greet())

        for (name in names) {
            resultList.add(englishGreeting.greetSomeone(name))
            resultList.add(frenchGreeting.greetSomeone(name))
            resultList.add(spanishGreeting.greetSomeone(name))
        }
        return resultList.toList()
    }
}
