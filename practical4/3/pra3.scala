object NameFormatter {
  // Method to convert a string to uppercase
  def toUpper(input: String): String = input.toUpperCase

  // Method to convert a string to lowercase
  def toLower(input: String): String = input.toLowerCase

  // Method to format names with a given formatting function
  //takes two imputs a string and function which takes a string and returns a string
  //so basically takes a string and a function and calls the function
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    // Test cases
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Applying different formats to the names
    println(formatNames("Benny")(toUpper)) // BENNY
    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2))) // NIroshan
    println(formatNames("Saman")(toLower)) // saman
    println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1) + name.substring(name.length - 1).toUpperCase)) // KumarA
  }
}
