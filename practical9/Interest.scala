object Interest {
    def interest(deposit: Double) = {
        deposit match {
            case x if x <= 20000000 => x * 0.065
            case x if x <= 2000000 => x * 0.035
            case x if x <= 200000 => x * 0.04
            case x if x <= 20000 => x * 0.02
        }
    }
    def main(Args: Array[String]) = {
        print("Enter deposit amount :")
        var deposit = scala.io.StdIn.readLine().toDouble
        println("Interest on deposit amount is : " + interest(deposit) + "Rupees")
    }
}