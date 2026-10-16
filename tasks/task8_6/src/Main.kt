// Task 8.6: scope functions

fun main() {
    val r = 128;
    val g = 128;
    val b = 128;

    val width = 20.0f;
    val height = 30.0f;

    System.out.printf("Rectangle colour = (%d,%d,%d)\n", r, g, b)
    System.out.printf("Perimeter = %.3f\n", 2.0 * (width + height))
    System.out.printf("Area = %.3f\n", width * height)

    // the two examples below allow us to call printf without System.out
    with(System.out) {
        printf("Rectangle colour = (%d,%d,%d)\n", r, g, b)
        printf("Perimeter = %.3f\n", 2.0 * (width + height))
        printf("Area = %.3f\n", width * height)
    }

    System.out.run {
        printf("Rectangle colour = (%d,%d,%d)\n", r, g, b)
        printf("Perimeter = %.3f\n", 2.0 * (width + height))
        printf("Area = %.3f\n", width * height)
    }
}
