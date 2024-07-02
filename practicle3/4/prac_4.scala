// Write a function in Scala that takes a list of integers as input and returns the sum of all the
// even numbers in the list.


object prac_4 {
    def sumOfEvenNumbers(numbers: List[Int]): Int = {
        numbers.filter(_ % 2 == 0).sum
        // s => s % 2 == 0  and find the sum of all even numbers
    }
    def main(args: Array[String]) = {
        val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val sum = sumOfEvenNumbers(numbers)
        println(s"The sum of even numbers is: $sum")
    }
}