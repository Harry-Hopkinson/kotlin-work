import kotlinx.datetime.LocalDate

// Task 12.5.3: demo program for class with custom setter
fun main() {
    val person = Person("Harry", LocalDate(2006, 9, 3));
    person.name = "";
}