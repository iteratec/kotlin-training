package de.iteratec.kotlin.basic

import org.junit.Test
import java.util.*
import kotlin.random.Random

class NullSafetyTasks {

    class ExampleClass(var optionalProperty: Optional<String>) {
        fun returnOptionalPropertyAsString(): String {
            return optionalProperty.orElse("")
        }
    }

    /**
     * ## Nullable values in classes
     * ExampleClass is using the Java system of null-safety, the Optional-wrapper. Replace it by a nullable String
     * and refactor its usages.
     * Why is the Kotlin way better than using an Optional?
     */
    @Test
    fun nullablePropertiesInClasses() {
        val instance = ExampleClass(Optional.empty())
        if (instance.optionalProperty.isEmpty()) {
            println("Poor instance of our class. Its optionalProperty is empty.")
        }
        instance.optionalProperty = Optional.of("something")
        if (instance.optionalProperty.isPresent && instance.optionalProperty.get().startsWith("s")) {
            println("Instance of our class has optionalProperty starting with s")
        }
    }

    /**
     * ## Elvis and safe-call operators
     * Rewrite the code using the safe call operator ?. and Elvis operator ?:
     */
    @Test
    fun taskElvisAndSafeCall() {
        val dogName: String? = if (Random.nextBoolean()) "Rocky" else null

        // Change this code:
        if (dogName != null) {
            println(dogName.first())
        } else {
            println("-")
        }
    }

    /**
     * ## Platform types
     *
     * Execute the code and observe a RuntimeException being thrown. Improve the situation by taking care that the compiler already
     * sees the problem. Adapt your code to solve the problem.
     */
    @Test
    fun platformTypes() {
        val scanner = Scanner(">> only Rocky is here <<")
        val lucy = scanner.findInLine("Lucy")
        val firstLetter = lucy.first()
        println(firstLetter)
    }

    /**
     * ## Getting rid of platform types
     * This example has the same problem as the exercise before. However, this time we own the Java code ourselves.
     * Change the Java class by using the @Nullable annotation in such a way that the code below does not compile
     * anymore and Kotlin forces you to handle the possibility of null.
     * Optional: What are the effects if you use the @NotNull annotation and let giveMeAString always return a proper string.
     */
    @Test
    fun gettingRidOfPlatformTypes() {
        val javaStringEmitter = StringEmitter()
        val suspiciousStringFromJavaCall = javaStringEmitter.giveMeAString()
        println(suspiciousStringFromJavaCall.first())
    }
}
