object prac1 {
  // Define the initial inventory arrays
  var names: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(50, 30, 20)

  def displayInventory() = {
    println("Inventory:")
    for (i <- 0 until names.length) {//
      println(s"${names(i)}: ${itemQuantities(i)}")//could use length - 
    } //use ${ ... } to display variables
    println()
  }

  def restockItem(itemName: String, quantity: Int) = {
    val index = names.indexOf(itemName) //if no match 0
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity $itemName(s). New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item '$itemName' not found in inventory.")
    }
    println()
  }

  def sellItem(itemName: String, quantity: Int) = {
    val index = names.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity $itemName(s). Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough quantity of $itemName to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item '$itemName' not found in inventory.")
    }
    println()
  }

  def main(args: Array[String]) = {
    displayInventory()
    restockItem("Apple", 10)
    sellItem("Banana", 5)
    sellItem("Orange", 25)  // Not enough quantity
    sellItem("Grapes", 5)  // Item not found
    displayInventory()
  }
}
