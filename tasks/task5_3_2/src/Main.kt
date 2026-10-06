// Task 5.3.2: main program

fun main(args: Array<String>) {
    if (args.size != 1) {
        rollDice(); // run with no command line arguments so use default values
    } else {
        val numOfDice = args[0].substringBefore("d");
        val numOfSides = args[0].substringAfter("d");
        rollDice(numOfSides.toInt(), numOfDice.toInt());
    }
}
