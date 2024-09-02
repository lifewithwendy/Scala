class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  var numerator: Int = n / gcdValue
  var denominator: Int = d / gcdValue

  def this(n: Int) = this(n, 1)

  if (denominator < 0) {
    numerator = -numerator
    denominator = -denominator
  }

  // Method to get the negated rational number
  def neg: Rational = new Rational(-numerator, denominator)

  // Override toString to display the rational number
  override def toString: String =
    if (denominator == 1) s"$numerator" else s"$numerator/$denominator"

  // Helper method to calculate GCD
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def sub(value : Rational): Rational = {
    if(this.denominator == value.denominator) {
      new Rational(this.numerator - value.numerator, this.denominator)
    } else {
      new Rational(this.numerator * value.denominator - value.numerator * this.denominator, this.denominator * value.denominator)
    }
  }
  def add(value : Rational): Rational = {
    new Rational(this.numerator * value.denominator + value.numerator * this.denominator, this.denominator * value.denominator)
  }
}

// Companion object to include the main method
object RationalApp {
  def main(args: Array[String]): Unit = {
    println("Enter a rational number to negate (format: numerator/denominator): ")
    val input = scala.io.StdIn.readLine().split("/")

    val rational = new Rational(input(0).toInt ,input(1).toInt)
    println(s"Negation of $rational is: ${rational.neg}")

    println("To find x-y-z enter the x,y,z, (format: numerator/denominator): ")
    print("Enter x: ")
    var inX = scala.io.StdIn.readLine().split("/") 
    val x = new Rational(inX(0).toInt ,inX(1).toInt)

    print("Enter y: ")
    var inY = scala.io.StdIn.readLine().split("/") 
    val y = new Rational(inY(0).toInt ,inY(1).toInt)

    print("Enter z: ")
    var inZ = scala.io.StdIn.readLine().split("/") 
    val z = new Rational(inZ(0).toInt ,inZ(1).toInt)

    val result = x.sub(y).sub(z)
    println(s"x-y-z is: $result")
  }
}
