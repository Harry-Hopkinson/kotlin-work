// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String, Double>

fun fetchData(filename: String): List<Record> {
    val data = mutableListOf<Record>()
    Path(filename).forEachLine { line ->
        val parts = line.split(",")
        val date = parts[0]
        val temp = parts[1].toDouble()
        data.add(Record(date, temp))
    }
    return data
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
