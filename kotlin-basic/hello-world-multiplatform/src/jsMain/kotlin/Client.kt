// Return a String representation of the dynamic JS object instead of [object Object] in the message.
// Imagine how you would do it in Javascript and try to use the "same" code here.
// Start the application with ./gradlew hello-world-multiplatform:jsRun

fun main() {
    println(getGreetingMessage())
}

actual fun getPlatformSpecificMessagePart(): String {
    // Create a Javascript object {runtime: "nodeJS", poweredByKotlin: true}
    val javaScriptObject: dynamic = object{}
    javaScriptObject["runtime"] = "nodeJs"
    javaScriptObject["poweredByKotlin"] = true

    return javaScriptObject
}
