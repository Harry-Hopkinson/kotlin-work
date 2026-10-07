// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(inputString: String, redactedText: String, redactedChar: Char = 'X'): String {
    if (redactedText.isEmpty()) return inputString
    return inputString.replace(redactedText, redactedChar.toString().repeat(redactedText.length));
}
