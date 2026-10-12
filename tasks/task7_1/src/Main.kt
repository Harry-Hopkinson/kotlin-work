// Task 7.1: pairs and triples
fun main() {
    val person = Pair("Harry", 20);
    println("Person: Name -> ${person.first}, Age -> ${person.second}");

    val (name, age) = person;
    println("Name is $name, age is $age");

    // val person = Pair("Harry", 20); is the same as
    // val person = Pair<String, Int>("Harry", 20);

    val person2 = Triple("Sarah", 37, 1.75f);
    println("Person: Name -> ${person2.first}, Age -> ${person2.second}, Float -> ${person2.third}");
}