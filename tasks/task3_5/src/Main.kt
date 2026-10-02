// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    var filePath = Path("test.txt");
    filePath.writeText("Hello World...\n");
    filePath.appendText("Hello Everyone...");

    var fileContents = filePath.readText();
    println(fileContents);
}
