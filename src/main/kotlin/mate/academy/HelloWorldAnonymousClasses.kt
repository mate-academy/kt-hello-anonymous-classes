package mate.academy

class HelloWorldAnonymousClasses {
    companion object Greetings {
        const val HELLO_WORLD = "Hello world"
        const val HELLO_SOMEONE = "Hello"
        const val SALUT_TOUT_LE_MONDE = "Salut tout le monde"
        const val SALUT_SOMEONE = "Salut"
        const val HOLA_MUNDO = "Hola, mundo"
        const val HOLA_SOMEONE = "Hola,"
    }

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val greetingList = listOf(
            object : HelloWorldGreeting {
                override fun greet() = HELLO_WORLD
                override fun greetSomeone(someone: String) = "$HELLO_SOMEONE $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = SALUT_TOUT_LE_MONDE
                override fun greetSomeone(someone: String) = "$SALUT_SOMEONE $someone"
            },
            object : HelloWorldGreeting {
                override fun greet() = HOLA_MUNDO
                override fun greetSomeone(someone: String) = "$HOLA_SOMEONE $someone"
            })
        val result = mutableListOf<String>()
        greetingList.forEach { result.add(it.greet()) }
        if (names.isNotEmpty()) {
            names.forEach { name -> greetingList.forEach { result.add(it.greetSomeone(name)) } }
        }
        return result
    }
}
