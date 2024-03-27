package mate.academy

import java.util.Objects

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val EnglishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
              return "Hello $someone"
            }
        }

        val FrenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }

        val SpanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        val list: MutableList<String> = mutableListOf()
//        val forReturn: MutableList<object> = mutableListOf()
        list.add(EnglishGreeting.greet())
        list.add(FrenchGreeting.greet())
        list.add(SpanishGreeting.greet())
        for (name in names) {
            list.add(EnglishGreeting.greetSomeone(name))
            list.add(FrenchGreeting.greetSomeone(name))
            list.add(SpanishGreeting.greetSomeone(name))
        }
        return list.toList()
    }
}
