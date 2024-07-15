object FibonacciSequence {

  // function to calculate the nth Fibonacci number
  def fibonacci(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(n - 1) + fibonacci(n - 2)
    }
  }

  // print the first n Fibonacci numbers
  def printFibonacciSequence(n: Int): Unit = {
    for (i <- 0 until n) {
      print(s"${fibonacci(i)} ")
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine("Enter a number: ")
    println(s"First $n Fibonacci numbers:")
    printFibonacciSequence(n.toInt)
  }
}
