// Task 8.4.1: experimenting with sequences

fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8);
    val result = numbers;

    println(result.asSequence());
    println(result.filter { it % 2 != 0 } );
    println(result.map { it * it } );

    println(result.asSequence().filter { it % 2 != 0 }.map { it * it }.toList());
}
