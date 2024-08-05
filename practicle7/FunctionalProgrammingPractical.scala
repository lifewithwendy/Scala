object FunctionalProgrammingPractical {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to math.sqrt(n).toInt).exists(i => n % i == 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => isPrime(n))
  }

  def main(args: Array[String]): Unit = {
    val input1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(s"Even numbers: ${filterEvenNumbers(input1)}") // Output: List(2, 4, 6, 8, 10)

    val input2 = List(1, 2, 3, 4, 5)
    println(s"Squares: ${calculateSquare(input2)}") // Output: List(1, 4, 9, 16, 25)

    val input3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(s"Prime numbers: ${filterPrime(input3)}") // Output: List(2, 3, 5, 7)
  }
}
