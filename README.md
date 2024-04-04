
# Implementation of Anonymous Classes for Greetings

In this task, you're provided with a base class named `HelloWorldAnonymousClasses`. It contains an interface `HelloWorldGreeting` with two methods: `greet()` and `greetSomeone(someone: String)`. 

**Your goal:** implement the `sayHello(names: List<String>): List<String>` method using anonymous classes to provide greetings in **English, French,** and **Spanish**.

## Instructions

 1. Begin by creating three anonymous classes within the `sayHello` method, each implementing the `HelloWorldGreeting` interface.
    
 2. Each class should offer its own implementation of the `greet()` and `greetSomeone(someone: String)` methods:
    -   An `EnglishGreeting` that greets`world` or a specific person in English.
    -   A `FrenchGreeting` that greets `tout le monde` or a specific person in French.
    -   A `SpanishGreeting` that greets `mundo` or a specific person in Spanish.
      
 3. Each greeting class should include a `greet()` method that returns a general greeting to the world and a `greetSomeone(someone: String)` method that returns a personalized greeting to the specified person.
    
 4. In the `sayHello` method, create a list of these greeting objects and utilize it to compile a list of general greetings from each language (e.g.,`Hello world`).
    
 5. Then, for each name in the `names` parameter, generate personalized greetings in all three languages and append them to the list of general greetings.
    
 6. The `sayHello` function should return a list of strings containing both the initial general greetings (e.g., “Hello world”) and all the personalized greetings.
    

## Example of How Your Implementation Should Work

```kotlin
fun main() {
  val helloWorld = HelloWorldAnonymousClasses()
  println(helloWorld.sayHello(listOf("Alice", "Bob")))
  // Output: [Hello world, Salut tout le monde, Hola, mundo, Hello Alice, Salut Alice, Hola, Alice, Hello Bob, Salut Bob, Hola, Bob]
}
```

**In case the list of users is empty:**

```kotlin
fun main() {
  val helloWorld = HelloWorldAnonymousClasses()
  println(helloWorld.sayHello(listOf()))
  // Output: [Hello world, Salut tout le monde, Hola, mundo]
}
```
