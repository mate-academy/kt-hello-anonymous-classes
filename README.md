# Implement Anonymous Classes for Greetings

In this task, you're given a base class named `HelloWorldAnonymousClasses` containing an interface `HelloWorldGreeting` with two methods: `greet()` and `greetSomeone(someone: String)`. 
Your objective is to implement the `sayHello(names: List<String>): List<String>` method using anonymous classes to provide greetings in English, French, and Spanish.

- Start by creating three anonymous classes within the `sayHello` method, each implementing the `HelloWorldGreeting` interface. 
- Each class should provide its own implementation of the `greet()` and `greetSomeone(someone: String)` methods:
  - An `EnglishGreeting` that greets "world" or a specific person in English.
  - A `FrenchGreeting` that greets "tout le monde" or a specific person in French.
  - A `SpanishGreeting` that greets "mundo" or a specific person in Spanish.

- Each greeting class should have a `greet()` method that returns a general greeting to the world, and a `greetSomeone(someone: String)` method that returns a personalized greeting to the specified person.

- In the `sayHello` method, create a list of these greeting objects and use it to compile a list of general greetings from each language (e.g. "Hello world").

- Then, for each name in the `names` parameter, generate personalized greetings in all three languages and append them to the list of general greetings.

- The `sayHello` function should return a list of strings containing both the initial general greetings (e.g. "Hello world") and all the personalized greetings.

Example of how your implementation should work:

```kotlin
fun main() {
  val helloWorld = HelloWorldAnonymousClasses()
  println(helloWorld.sayHello(listOf("Alice", "Bob")))
  // Output: [Hello world, Salut tout le monde, Hola, mundo, Hello Alice, Salut Alice, Hola, Alice, Hello Bob, Salut Bob, Hola, Bob]
}
```

In case the list of users is empty:
```kotlin
fun main() {
  val helloWorld = HelloWorldAnonymousClasses()
  println(helloWorld.sayHello(listOf()))
  // Output: [Hello world, Salut tout le monde, Hola, mundo]
}
```
