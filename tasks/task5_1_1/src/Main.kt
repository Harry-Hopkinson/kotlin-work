// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Two words required as command line arguments");
        exitProcess(1);
    }

    val result: Boolean = anagrams(args[0], args[1]);
    println("Is ${args[0]} and ${args[1]} an anagram? ${result}")
}
