// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.size != 1) {
        println("Error: This program requires a file as a command line input.");
        exitProcess(1);
    }

    val data = readData(args[0]);
    val variance = calculate_variance(data);
    println("File: ${args[0]}");
    println("Data: ${data}");
    println("Variance: ${variance}");
}
