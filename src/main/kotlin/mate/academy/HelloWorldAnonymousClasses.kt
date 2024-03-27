package mate.academy

import java.util.Objects

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
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

        val list: MutableList<String> = mutableListOf()
//        val forReturn: MutableList<object> = mutableListOf()
        list.add(englishGreeting.greet())
        list.add(frenchGreeting.greet())
        list.add(spanishGreeting.greet())
        for (name in names) {
            list.add(englishGreeting.greetSomeone(name))
            list.add(frenchGreeting.greetSomeone(name))
            list.add(spanishGreeting.greetSomeone(name))
        }
        return list
    }
}
