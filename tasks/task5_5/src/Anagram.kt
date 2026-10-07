// Task 5.5.5: anagramOf() function
infix fun String.anagramOf(inputString: String): Boolean {
    if (this.length != inputString.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = inputString.lowercase().toList().sorted()
    return firstChars == secondChars
}
