// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: This program requires a command line input of the file path");
        exitProcess(1);
    }

    val data = fetchData(args[0]);
    val avgTemp = averageTemp(data);
    println(data);
    println("Average temperature: $avgTemp")
}
