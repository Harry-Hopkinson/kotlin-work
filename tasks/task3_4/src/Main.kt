// Task 3.3: console input

fun main(args: Array<String>) {
    print("Enter your name: ")
    val name = readln()

    println("Hello $name!")
    println("Your name contains ${name.length} characters")
    println("Is it a short name (less than 5 chars)? ${name.length < 5}")
    println("Uppercase name is ${name.uppercase()}")


    val distance = 1080.325;
    println("Distance = %.2f km".format(distance))

    with(System.out) {
        val r = 211; val g = 252; val b = 3;
        val width = 25.25; val height = 15.75;
        printf("Rectangle colour = (%d,%d,%d)\n", r, g, b)
        printf("Perimeter = %.3f\n", 2.0 * (width + height))
        printf("Area = %.3f\n", width * height)
    }
}
