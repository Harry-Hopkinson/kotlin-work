// Task 5.1.2: main program

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("The number of sides on the dice has not been specified. Defaulting to 6 sides.");
        rollDie();
    } else {
        rollDie(args[0].toInt());
    }
}
