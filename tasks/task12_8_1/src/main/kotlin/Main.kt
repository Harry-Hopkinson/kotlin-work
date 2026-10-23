// Task 12.8.1: demo program for Day enum class
fun main() {
    print("Enter a day of the week: ");
    val day_input = readln().capitalize();

    val day = Day.valueOf(day_input);
    println("Day entered: ${day}");
}