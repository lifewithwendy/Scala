object NameFormattChanger {
  // Method to convert a string to uppercase
  def toUpper(input: String): String = input.toUpperCase

  // Method to convert a string to lowercase
  def toLower(input: String): String = input.toLowerCase

  def formatName(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]) = {
    // Test cases
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Applying different formats to the names
    println(formatName("Benny")(toUpper)) // BENNY
    println(formatName("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2))) // NIroshan
    println(formatName("Saman")(toLower)) // saman
    println(formatName("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1) + name.substring(name.length - 1).toUpperCase)) // KumarA
  }
}
