// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.useLines
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Input file path as command line argument");
        exitProcess(1);
    }

    var filePath = Path(args[0]);
    var longestLength: Int = 0;
    var longestLineNumber: Int = 0;

    var temp: Int;
    filePath.useLines { lines ->
        lines.forEachIndexed { index, line ->
            val temp = line.length;
            if (temp > longestLength) {
                longestLength = temp;
                longestLineNumber = index + 1;
            }
        }
    }

    println("Line ${longestLineNumber} is the longest (length = ${longestLength})");
}
