package de.iteratec.kotlin.playground.solutions

import org.junit.Test

class MutabilityAndExpressionsTasks {

    /**
     * Task 1
     * Uncomment the line and fix the code, so it prints 'Lucy'.
     */
    @Test
    fun task1() {
        var catName = "Lisa"
        catName = "Lucy"
        println(catName)
    }

    /**
     * Task 2
     * Uncomment the line and fix the code, so it prints 'Lucy'
     */
    @Test
    fun task2() {
        var catName: Any = 7
        catName = "Lucy"
        println(catName)
    }

    /**
     * Task 3
     * Use the fact that "try" is an expression to directly assign the variable riskyComputationResult without
     * declaring it first.
     */
    @Test
    fun task3() {
        val riskyComputationResult: String = try {
            0 / 0
            "succeeded"
        } catch (e: Exception) {
            "failed"
        }

        println("riskyComputation " + riskyComputationResult)
    }
}
