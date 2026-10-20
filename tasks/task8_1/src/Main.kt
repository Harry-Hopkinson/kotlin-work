// Task 8.1: defining/using a lambda expression

fun main() {
    val numbers = intArrayOf(9, 3, 6, 2, 8, 5);
    val firstEven = numbers.first { it % 2 == 0 };

    val words = listOf("Hello", "Goodbye", "Ciao", "", "Hi", "");
    val lastNonBlank = words.last { it.isNotBlank() };

    println("First Even: ${firstEven}");
    println("Last Non Blank: ${lastNonBlank}");

    val numList = listOf(1, 4, 7, 2, 9, 3, 8);
    val squares = numList.filter { it % 2 != 0 }.map { it * it };
    println(squares);
}
