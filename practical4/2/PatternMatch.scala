object PatternMatch1 {
    def patternMatcher(no:Int) ={
        no match {
            case 0 => println("Zero")
            case x if(x < 0) => println("Negative")
            case x if (x % 2 == 1) => println("odd")
            case _ => println("Even")
        }
    }
    def main(args: Array[String])  = {
        print("Enter a number: ")
        val input = scala.io.StdIn.readInt()
        patternMatcher(input)
    }
}