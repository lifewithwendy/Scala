import scala.io.StdIn.readLine

object InventoryManagementSystem {

  // Function to get the product list from user input
  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    while (input != "done") {
      input = readLine("Enter a product name (type 'done' to finish): ")
      if (input != "done") {
        products = products :+ input //appending the input to the list
      }
    }
    products
  }

  // Function to print the product list with their positions
  def printProductList(products: List[String]): Unit = {
  for (i <- 0 until products.length) {
    println(s"${i + 1}. ${products(i)}")
  }
}


  // Function to get the total number of products
  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]) = {
    val productList = getProductList()
    println("\nProduct List:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}
