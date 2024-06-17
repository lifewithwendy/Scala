object Prac1 {
  def area(radius: Double): Double = {
    math.Pi * radius * radius
  }

  def c2f(temp: Double): Double = {
    temp * 1.8000 + 32.00
  }

  def vol(r: Double): Double ={
    4/3 * Math.PI * r * r * r
  }

  def timeTaken(speed: Int, distance: Double): Double = {
    distance / speed
  }

  def discount(cost : Double, discount : Int) : Double = {
    val c:Double = cost*(1 - discount/100.0)
    println("Discount price\t\t : " + c)
    c
  }
   def shippingCost(n : Int) : Double = {
    if (n < 50){
      println("Shipping cost\t\t : " + n*3)
      n*3
    }else{
      var sc: Double = (3.0*n + 0.75*(n-50))
      println("Shipping cost\t\t : " + sc)
      sc
    } 
   }
   def wholeSale(price: Double, qty: Int, disc: Int) = {
     var totalPrice: Double = shippingCost(qty) + discount(price, disc)*qty;
     println("Total price\t\t : " + totalPrice)
     totalPrice
   }

  def main(args: Array[String]): Unit = {
    println(area(5.0))
    println(c2f(5.0))
    println(vol(5.0))
    println(2*timeTaken(8, 2) + timeTaken(7, 3) + " hours" )
    wholeSale(24.95, 60, 40)
  }
}
