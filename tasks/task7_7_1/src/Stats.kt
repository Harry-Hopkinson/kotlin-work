// Task 7.7.1: statistics functions
fun calculate_mean(values: List<Float>) : Float {
    return values.sum() / values.size;
}

fun calculate_median(values: List<Float>) : Float {
    if (values.size % 2 != 0) return values[(values.size) / 2];
    else return (values[values.size / 2 - 1] + values[values.size / 2]) / 2;
}
