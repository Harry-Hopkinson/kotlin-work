import kotlin.io.path.Path
import kotlin.io.path.forEachLine

// Task 7.3.2: building lists
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5);
    println(numbers);

    numbers.add(10); // add item to the end of the list
    println(numbers);

    numbers.add(4, 12); // add an item of value 12 to the 4th index
    println(numbers);

    val numbersToAdd = listOf(4, 2, 6, 9);
    numbers.addAll(numbersToAdd); // add all items of another list to the main list
    println(numbers);

    numbers.remove(2); // remove first occurance of 2
    numbers.removeAll(listOf(2)) // remove all occurances of specified items
    println(numbers);

    numbers.removeAt(5); // remove element from 5th position (5)
    println(numbers);

    numbers.clear(); // clears the list
    println(numbers);

    val intFilePath = Path("int_data.txt");
    val floatFilePath = Path("float_data.txt");

    // add int data from text file to an array
    val intData = mutableListOf<Int>();
    intFilePath.forEachLine {
        intData.add(it.toInt());
    }
    println(intData);

    // add float data from text file to an array
    val floatData = mutableListOf<Float>();
    floatFilePath.forEachLine {
        floatData.add(it.toFloat());
    }
    println(floatData);

    // alternatively, you could do this using buildList(), like so
    val fileData = buildList {
        floatFilePath.forEachLine {
            add(it.toFloat());
        }
    }
    println(fileData);
}