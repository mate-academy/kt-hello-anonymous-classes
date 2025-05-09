package mate.academy

const val ENGLISH_GREETING = "Hello world"
const val FRENCH_GREETING = "Salut tout le monde"
const val SPANISH_GREETING = "Hola, mundo"
const val ENGLISH_GREETING_FOR_SOMEONE = "Hello %s"
const val FRENCH_GREETING_FOR_SOMEONE = "Salut %s"
const val SPANISH_GREETING_FOR_SOMEONE = "Hola, %s"


class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetingsList = mutableListOf<String>()

        val greetings = listOf(
            object: HelloWorldGreeting {
                override fun greet(): String {
                    return ENGLISH_GREETING
                }

                override fun greetSomeone(someone: String): String {
                    return ENGLISH_GREETING_FOR_SOMEONE.format(someone)
                }
            },
            object: HelloWorldGreeting {
                override fun greet(): String {
                    return FRENCH_GREETING
                }

                override fun greetSomeone(someone: String): String {
                    return FRENCH_GREETING_FOR_SOMEONE.format(someone)
                }
            },
            object: HelloWorldGreeting {
                override fun greet(): String {
                    return SPANISH_GREETING
                }

                override fun greetSomeone(someone: String): String {
                    return SPANISH_GREETING_FOR_SOMEONE.format(someone)
                }
            }
        )

        greetings.forEach {
            greetingsList.add(it.greet())
        }

        for (name in names) {
            greetings.forEach {
                greetingsList.add(it.greetSomeone(name))
            }
        }

        return greetingsList
    }

}
