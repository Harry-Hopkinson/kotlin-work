// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: This program requires 3 marks as command line arguments.");
        exitProcess(1);
    }

    println("MODULE GRADE");
    val averageMark = ((args[0].toFloat() + args[1].toFloat() + args[2].toFloat()) / 3.0f).roundToInt();
    println("Average of three marks: ${averageMark}");

    val grade = when (averageMark) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    };
    println("Grade: ${grade}");
}