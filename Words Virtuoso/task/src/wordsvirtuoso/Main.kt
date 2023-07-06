package wordsvirtuoso

import java.io.File

fun main() {
    println("Input the words file:")
    val fileName = readln()
    val list = FileHandler.readFile(fileName)
    if (list.isEmpty()) {
        println("Error: The words file $fileName doesn't exist.")
    } else {
        val count = list.count { !it.wordIsCorrect() }
        println(if (count == 0) "All words are valid!" else "Warning: $count invalid words were found in the $fileName file.")
    }
}

fun String.wordIsCorrect(): Boolean {
    if (this.length != 5) return false.also { println("The input isn't a 5-letter string.") }
    if (!this.matches("[a-zA-Z]+".toRegex())) return false.also { println("The input has invalid characters.") }
    if (this.toSet().size != this.length) return false.also { println("The input has duplicate letters.") }
    return true.also { println("The input is a valid string.") }
}

class FileHandler {
    companion object {
        fun readFile(fileName: String): List<String> {
            val file = File(fileName)
            return if (file.exists()) {
                file.readLines()
            } else listOf()
        }
    }
}