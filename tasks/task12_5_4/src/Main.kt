// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val person_1 = Person("Harry", LocalDate(2006, 9, 3));
    val person_2 = Person("Stuart", LocalDate(1980, 3, 6));

    println("${person_1.name} is ${person_1.age} years old!");
    println("${person_2.name} is ${person_2.age} years old!");
}