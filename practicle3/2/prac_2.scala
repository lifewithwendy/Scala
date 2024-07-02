// Write a function in Scala that takes a list of strings as input and returns a new list
// containing only the strings that have a length greater than 5.

object prac_2 {
def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
    // (s => s.length > 5)  takes each item filter if they are less than 5 letters
}

def main(args: Array[String]): Unit = {
    val inputStrings = List("apple", "banana", "cherry", "date", "elderberry", "fig", "grape")
    val filteredStrings = filterStrings(inputStrings)
    println("Filtered strings: " + filteredStrings)
}
}