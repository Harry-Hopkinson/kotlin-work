// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Radius of circle required as command line parameter");
        exitProcess(1);
    }

    val radius = args[0].toDouble();
    val area = circleArea(radius);
    val perimeter = circlePerimeter(radius);
    println("A circle with radius ${radius} has an area of ${area} and a perimeter of ${perimeter}.");
}
