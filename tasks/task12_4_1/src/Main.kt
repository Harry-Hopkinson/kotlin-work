// Task 12.4.1: main program
fun main() {
    val circle = Circle(Point(0.0, 0.0), 15.0);

    if (circle contains Point(13.0, 0.0)) println("Point is within circle");
    else println("Point is not within circle");
}
