object PatternMatching {
    def EvenOrOdd(num: Int) = {
        num match {
            case x if x <= 0 => "Negative/Zero"
            case x if x % 2 == 0 => "Even number is given"
            case x if x % 2 == 1 => "Odd number is given"
        }
    }
    def main(Args: Array[String]) = {
        print("Enter Number :")
        var no = scala.io.StdIn.readLine().toInt
        println(EvenOrOdd(no))
    }
}