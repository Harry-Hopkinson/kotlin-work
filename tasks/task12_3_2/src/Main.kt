// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Harry", LocalDate(2006, 9, 3));
    
    println(person.name);
    println(person.birth);
}