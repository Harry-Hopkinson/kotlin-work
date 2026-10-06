// Task 5.3.2: rollDice() function

import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDice(sides: Int = 6, numOfDice: Int = 1) {
    if (sides !in setOf(4, 6, 8, 10, 12, 20)) {
        println("Error: cannot have a $sides-sided die");
        exitProcess(1);
    }

    var total: Int = 0;
    for (i in 1..numOfDice) {
        val result = Random.nextInt(1, sides + 1);
        total += result;
    }

    println("Running a ${sides} sided dice.");
    println("Number of dice rolls: ${numOfDice}");
    println("Total Score across dices: ${total}");
}
