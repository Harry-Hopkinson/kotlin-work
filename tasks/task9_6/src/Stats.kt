// Task 9.6: calculate_variance() function
fun calculate_variance(dataset: List<Double>): Double {
    // if (dataset.size < 2) {
    //     throw IllegalArgumentException("not enough data")
    // }

    // instead of above - you can write as so...
    require(dataset.size >= 2);

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}
