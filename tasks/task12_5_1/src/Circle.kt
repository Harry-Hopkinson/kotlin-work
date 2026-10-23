// Task 12.5.1: computed properties
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    val area get() = PI * radius * radius
    val perimeter get() = 2.0 * PI * radius
}