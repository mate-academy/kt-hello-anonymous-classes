package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val english = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }
            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }
        val french = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }
            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }
        val spanish = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }
            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }
        val mutableList = mutableListOf<String>()
        mutableList.add(english.greet())
        mutableList.add(french.greet())
        mutableList.add(spanish.greet())
        for (name in names) {
            mutableList.add(english.greetSomeone(name))
            mutableList.add(french.greetSomeone(name))
            mutableList.add(spanish.greetSomeone(name))
        }

        return mutableList
    }
}
