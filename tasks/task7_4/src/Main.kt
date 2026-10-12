// Task 7.4: sets and maps
fun main() {
    val fixedOptions = setOf("Save", "Load", "Quit");

    val fixedPrices = mapOf(
        "Apple" to 32,
        "Orange" to 55,
        "Kiwi" to 20
    )

    val names = mutableSetOf("Joe", "Sarah", "Nicole");
    print("Enter your name: ");
    val name = readln();

    when (names.add(name)) {
        true -> println("$name added");
        false -> println("I'm sorry, we already have a $name");
    }

    val prices = mutableMapOf(
        "Apple" to 32,
        "Orange" to 55,
        "Kiwi" to 20
    )

    println(prices["Apple"]);   // prints 32
    println(prices["Pear"]);    // prints `null`

    // Update/add elements to the prices map
    prices["Apple"] = 40;
    prices["Pear"] = 45;
    println(prices);
}