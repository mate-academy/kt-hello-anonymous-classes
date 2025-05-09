package mate.academy

const val HELLO_DEFAULT = "Hello world"
const val ENG_GREET_SOMEONE = "Hello %s"
const val SALUT_DEFAULT = "Salut tout le monde"
const val FRE_GREET_SOMEONE = "Salut %s"
const val HOLA_DEFAULT = "Hola, mundo"
const val SPA_GREET_SOMEONE = "Hola, %s"

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetings = listOf(
            object : HelloWorldGreeting {
                override fun greet() = HELLO_DEFAULT
                override fun greetSomeone(someone: String): String = ENG_GREET_SOMEONE.format(someone)
            },
            object : HelloWorldGreeting {
                override fun greet() = SALUT_DEFAULT
                override fun greetSomeone(someone: String): String = FRE_GREET_SOMEONE.format(someone)
            },
            object : HelloWorldGreeting {
                override fun greet() = HOLA_DEFAULT
                override fun greetSomeone(someone: String): String = SPA_GREET_SOMEONE.format(someone)
            }
        )

        val greeting = mutableListOf<String>()

        for (greetingObj in greetings) {
            greeting.add(greetingObj.greet())
        }

        for (name in names) {
            for (greetingObj in greetings) {
                greeting.add(greetingObj.greetSomeone(name))
            }
        }
        return greeting
    }
}
