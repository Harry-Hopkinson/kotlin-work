// Task 2.5

// This variable is private so is local only to this file
private const val VERSION = "v1.0";

// This variable is visible to code in other files that are part of the same package
const val SPEED_OF_LIGHT = 2.99792e8

fun main() {
    println("VERSION: " + VERSION);
    println("Speed of Light: " + SPEED_OF_LIGHT);
}