// Task 7.3.1: list element access
fun main() {
    val numberList = List<Float>(100) { 0.0f };
    val greetings = List<String>(5) { "Hello" };

    val names = listOf("Nine", "Three", "Six", "Two");
    val numbers = listOf(9, 3, 6, 2, 8, 5);
    
    println(numbers);
    println(numbers[0]);
    // println(numbers[10]); will give error as index 10 out of bounds for list of length 6
    println(numbers.slice(2..4));
    println(numbers.first());
    println(numbers.last());

    // To add a new value, remove values or replace values. You have to specify the list as mutable.
    val mutableGreetings = MutableList<String>(5) { "Hello "};
    mutableGreetings[0] = "Hi";
    println(mutableGreetings);

    val mutableNumbers = mutableListOf(9, 3, 6, 2);
    mutableNumbers[0] = 1;
    println(mutableNumbers);

    val emptyData = mutableListOf<Double>(); // this is the easiest way of creating an empty list

    // Notice the use of val in the examples above.
    // Remember that val merely prevents reassignment of different list objects to these variables;
    // it doesn’t prevent changes to the content of the lists.
}