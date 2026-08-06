package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetingEn = object : HelloWorldGreeting {
            override fun greet(): String {
               return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }
        val greetingFr = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }
        val greetingSp = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }
        val mutableListOf = mutableListOf<String>()
        mutableListOf.add(greetingEn.greet())
        mutableListOf.add(greetingFr.greet())
        mutableListOf.add(greetingSp.greet())
        for (name in names) {
            mutableListOf.add(greetingEn.greetSomeone(name))
            mutableListOf.add(greetingFr.greetSomeone(name))
            mutableListOf.add(greetingSp.greetSomeone(name))
        }
        return mutableListOf
    }
}
