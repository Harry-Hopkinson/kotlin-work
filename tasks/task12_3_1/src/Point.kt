// Task 12.3.1: class with secondary constructors

class Point(var x: Double, var y: Double) {
    // if no values are supplied in the constructor...
    // x and y will default to (0.0, 0.0)
    constructor(): this(0.0, 0.0);
}
