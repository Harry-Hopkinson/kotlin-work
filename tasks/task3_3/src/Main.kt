// Task 3.3: console input

fun main(args: Array<String>) {
    print("Enter your name: ");
    val name = readln();

    print("Enter your age: ")
    val age = readln().toInt()

    println("Name -> ${name}");
    println("Age -> ${age}");
}
