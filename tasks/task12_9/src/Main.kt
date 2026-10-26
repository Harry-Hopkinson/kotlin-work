// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person.create("James", LocalDate(2006, 9, 3));
    println(person.name);
    println(person.birth);
}
