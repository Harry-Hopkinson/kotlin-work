// Task 8.5: example of using a higher-order function

fun main() {
    val string = "Hello, my name is Harry";
    val vowelCount = string.howMany { it.lowercase() in "aeiou" };

    println("The string '${string}' has ${vowelCount} vowels.");
}
