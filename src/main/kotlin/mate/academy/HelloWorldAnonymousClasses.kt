package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetingsObjects = listOf(
            object : HelloWorldGreeting {
                override fun greet(): String {
                    return LocalGreetings.ENGLISHWORLDHELLO.greeting
                }
                override fun greetSomeone(someone: String): String {
                    return "${HiLocal.ENGLISHHI.hi} $someone"
                }
            },
            object : HelloWorldGreeting {
                override fun greet(): String {
                    return LocalGreetings.FRENCHWORLDHELLO.greeting
                }
                override fun greetSomeone(someone: String): String {
                    return "${HiLocal.FRENCHHI.hi} $someone"
                }
            },
            object : HelloWorldGreeting {
                override fun greet(): String {
                    return LocalGreetings.SPANISHWORLDHELLO.greeting
                }
                override fun greetSomeone(someone: String): String {
                    return "${HiLocal.SPANISHHI.hi}, $someone"
                }
            }
        )

        val greetings = mutableListOf<String>()

        for (localGreeting in LocalGreetings.values())
        greetings.add(localGreeting.greeting)

        for (name in names) {
            for (greeting in greetingsObjects) {
                greetings.add(greeting.greetSomeone(name))
            }
        }

        return greetings
    }
}
