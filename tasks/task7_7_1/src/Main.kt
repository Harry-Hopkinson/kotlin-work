// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: This program requires a command line input of the file path");
        exitProcess(1);
    }

    val data = read_data(args[0]);
    val mean = calculate_mean(data);
    val median = calculate_median(data);

    println("File Name: ${args[0]}");
    println("Data: ${data}");
    println("Mean: ${mean}");
    println("Median: ${median}");
}
