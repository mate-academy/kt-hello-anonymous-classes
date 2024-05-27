package mate.academy

import HelloWorldAnonymousClasses
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloWorldAnonymousClassesTest {

    private val helloWorld = HelloWorldAnonymousClasses()

    @Test
    fun sayHello_SingleName_ListWithGenericAndPersonalizedGreetings() {
        // given
        val names = listOf("John")

        // when
        val result = helloWorld.sayHello(names)

        // then
        assertEquals(
            listOf(
                "Hello world", "Salut tout le monde", "Hola, mundo",
                "Hello John", "Salut John", "Hola, John"
            ), result
        )
    }

    @Test
    fun sayHello_MultipleNames_ListWithGenericAndAllPersonalizedGreetings() {
        // given
        val names = listOf("John", "Jane")

        // when
        val result = helloWorld.sayHello(names)

        // then
        assertEquals(
            listOf(
                "Hello world", "Salut tout le monde", "Hola, mundo",
                "Hello John", "Salut John", "Hola, John",
                "Hello Jane", "Salut Jane", "Hola, Jane"
            ), result
        )
    }

    @Test
    fun sayHello_EmptyList_ListWithOnlyGenericGreetings() {
        // given
        val names = emptyList<String>()

        // when
        val result = helloWorld.sayHello(names)

        // then
        assertEquals(listOf("Hello world", "Salut tout le monde", "Hola, mundo"), result)
    }

    @Test
    fun sayHello_NamesWithSpecialCharacters_CorrectlyHandlesSpecialCharacters() {
        // given
        val names = listOf("José", "Renée")

        // when
        val result = helloWorld.sayHello(names)

        // then
        assertEquals(
            listOf(
                "Hello world", "Salut tout le monde", "Hola, mundo",
                "Hello José", "Salut José", "Hola, José",
                "Hello Renée", "Salut Renée", "Hola, Renée"
            ), result
        )
    }

    @Test
    fun sayHello_NamesThatAreNumbersOrSymbols_HandlesNumbersAndSymbolsCorrectly() {
        // given
        val names = listOf("123", "$$$")

        // when
        val result = helloWorld.sayHello(names)

        // then
        assertEquals(
            listOf(
                "Hello world", "Salut tout le monde", "Hola, mundo",
                "Hello 123", "Salut 123", "Hola, 123",
                "Hello $$$", "Salut $$$", "Hola, $$$"
            ), result
        )
    }

    @Test
    fun sayHello_NamesWithWhiteSpaces_TrimAndProcessCorrectly() {
        // given
        val names = listOf(" John ", " Jane ")

        // when
        val result = helloWorld.sayHello(names)

        // then
        assertEquals(
            listOf(
                "Hello world", "Salut tout le monde", "Hola, mundo",
                "Hello  John ", "Salut  John ", "Hola,  John ",
                "Hello  Jane ", "Salut  Jane ", "Hola,  Jane "
            ), result
        )
    }
}
