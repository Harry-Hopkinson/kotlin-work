// Task 7.6: other operations
fun main() {
    val words = listOf("Apple", "Orange", "Apple", "Kiwi");

    println(words.size);
    println(words.isEmpty());
    println(words.lastIndexOf("Apple"));
    println(words.indexOf("Banana"));

    val numbers = listOf(9, 3, 6, 2, 8, 5, 1);
    val chunks = numbers.chunked(3); // splits up the list into 3 "chunks"
    println(chunks); // [[9, 3, 6], [2, 8, 5], [1]]
}
