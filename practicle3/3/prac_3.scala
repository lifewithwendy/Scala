// You are given two integers, num1 and num2. Write a function in Scala to determine the
// arithmetic mean (average) of the two numbers, rounded to two decimal places. Return
// the result as a floating-point number
// import scala.compiletime.


object prac_3{
    def calculateArithmeticMean(num1: Double, num2: Double): Double = {
        val mean = (num1 + num2) / 2.0
        BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
        //declare BigDecimal object and set to the 2nd decimal 
    }
    def main(args: Array[String]) = {
        println(calculateArithmeticMean(7.12,8.185))
    }
}