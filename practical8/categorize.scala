import scala.annotation.switch
object categorize {

    def divBy3(no: Int): Boolean = {if(no % 3 == 0) true else false}

    def divBy5(no: Int):Boolean = {if(no % 5 == 0) true else false}

    def main(args : Array[String]) = {
        if(args.length != 1){
            println("Enter exactly 1 parameter")
        }else{
            val number = args(0).toInt
            var msg = (divBy3(number), divBy5(number)) match {
                case (true, true) =>  "Multiple of Both Three and Five"
                case (true, false) =>  "Multiple of Five"
                case (false, true) =>  "Multiple of Three"
                case (false, false) =>  "Not a Multiple of Three or Five"
            }
            print(msg)
        }
    }
}