// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(10.0, 15.0);

    println(p.x);
    println(p.y);

    println("-----------------");

    val cP = ConcisePoint(15.0, 10.0);
    println(cP.x);
    println(cP.y);

    println("-----------------");

    val mathPoint = MathPoint(30.0, 15.0);
    val dist = mathPoint.distanceTo(p);
    println(dist);
}
