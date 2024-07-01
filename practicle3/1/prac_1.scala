// Write a function in Scala that takes a string as input and returns the reverse of the string
// using a recursive approach.

object prac_1{
    def reverseString(input: String): String = {
        if (input.isEmpty) {
            ""
        }else {
            reverseString(input.tail) + input.head
        }
    }

    def main(args: Array[String]): Unit = {
        println("Enter word")
        val originalString = scala.io.StdIn.readLine()
        val reversedString = reverseString(originalString)
        println(s"Original: $originalString, Reversed: $reversedString")
    }
}