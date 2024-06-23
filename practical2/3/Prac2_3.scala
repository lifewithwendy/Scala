// Company XYZ & Co. pays all its employees Rs.250 per normal working hour
// and Rs. 85 per OT hour. A typical employee works 40 (normal) and 30(OT) hours
// per week has to pay 12% tax.
// Develop a functional program that determines the take home salary of an
// employee from the number of working hours and OT hours given.


object Prac2_3{
    val tax : Float = 0.12f;

    def payment(normalHours : Int, otHours : Int) :Double = {
        (normalHours * 250) + (otHours * 85);
    }
    def takeHome(noOfHours : Int, otHours : Int = 0) : Double = {
        payment(noOfHours,otHours) - (payment(noOfHours,otHours) * tax);
    }

    def main(args: Array[String]) : Unit = {
        println("Take home amount is : "+ takeHome(10,10)+" LKR")
    }
}