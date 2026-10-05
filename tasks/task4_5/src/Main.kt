// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val message = "Hello!"
    for (character in message) {
        println(character);
    }

    println("---------------");

    for (n in 1..10) {
        println(n);
    }

    println("---------------");

    if (args.size != 1) {
        println("This program requires an integer command line argument");
        exitProcess(1);
    }

    val num = args[0].toInt();
    for (n in 1..num step 2) {
        println(n)
    }
}
