// Task 12.1: Point class
import kotlin.math.hypot
import kotlin.math.pow
import kotlin.math.sqrt

class Point(x: Double, y: Double) {
    var x = x
    var y = y
}

// the class above can be written in a more concise way
class ConcisePoint(var x: Double, var y: Double)


class MathPoint(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(point: Point) = sqrt(((point.x - x).pow(2)) - (point.y - y).pow(2))
}
