// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(isValidTriangle(sideA, sideB, sideC)) {
            "Invalid triangle: the side lengths cannot form a triangle."
        }
    }

    val perimeter get(): Double = sideA + sideB + sideC;
    val semiPerimeter get(): Double = 0.5 * (sideA + sideB + sideC);
    val area get() : Double = triangleArea(sideA, sideB, sideC);

    override fun toString() = "Triangle(${sideA}, ${sideB}, ${sideC})"
}

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(sideA: Double, sideB: Double, sideC: Double): Boolean {
    return when {
        sideA >= sideB + sideC -> false
        sideB >= sideA + sideC -> false
        sideC >= sideA + sideB -> false
        else -> true
    }
}

fun triangleArea(sideA: Double, sideB: Double, sideC: Double): Double {
    val s: Double = 0.5 * (sideA + sideB + sideC);
    val area: Double = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    return area;
};
