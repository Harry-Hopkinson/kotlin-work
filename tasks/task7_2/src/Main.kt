import kotlin.random.Random

// Task 7.2: array comparison
fun main() {
    val numberData = Array<Float>(100) { 0.0f };
    val greetings = Array<String>(5) { "Hello" };
    // Here, numbers is created as an array of 100 Float values, each equal to 0.0
    // And greetings is created as an array of 5 strings, all "Hello".

    val randomNumbers =
        Array<Float>(10) { Random.nextFloat() }; // You can use lambda expressions within the {}, for example Random.nextFloat()
    for (number in randomNumbers) {
        println(number);
    }

    val ages = arrayOf(9, 13, 26, 12);
    val names = arrayOf("Nine", "Three", "Six", "Two");
    // With this approach, there is no longer a need to specify element type or array size:
    // type inference is used to determine the former, and arguments are simply counted to determine the latter.

    val numbers = intArrayOf(9, 6, 3, 2);

    val cls = numbers::class;

    println(cls.qualifiedName);
    println(cls.java);

    // When you need an array of ‘primitives’ (numbers, characters or booleans), it is more efficient to use the dedicated classes
    // that Kotlin provides for these types, rather than the generic Array class.
    // In other words, you should use IntArray, FloatArray or CharArray rather than Array<Int>, Array<Float> or Array<Char>.
    // Similarly, if you are creating arrays of primitives from a known set of values, you should prefer functions like
    // intArrayOf(), floatArrayOf(), charArrayOf() to the general-purpose arrayOf() function.
}
