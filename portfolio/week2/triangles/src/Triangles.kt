// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double, Double, Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    return when {
        triangle.first >= triangle.second + triangle.third -> false
        triangle.second >= triangle.first + triangle.third -> false
        triangle.third >= triangle.first + triangle.second -> false
        else -> true
    }
}

fun triangleArea(triangle: Triangle): Double {
    val s: Double = 0.5 * (triangle.first + triangle.second + triangle.third);
    val area: Double = sqrt(s * (s - triangle.first) * (s - triangle.second) * (s - triangle.third));
    return area;
};
