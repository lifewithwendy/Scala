// Define the case class for Product
case class Product(id: String, name: String, quantity: Int, price: Double)

// Define the Inventory class 
class Inventory {
  private var store = Array[Product]()

  def addProduct(product: Product): Unit = {
    store = store :+ product
  }
  //getter
  def getProductList: Array[Product] = {
    store
  }

  def printProductList(): Unit = {
    for (i <- store.indices) {
      println(s"${i + 1}. ${store(i)}")
    }
  }

  def getTotalProducts: Int = {
    store.length// return total number of products
  }

  def getProductById(id: String): Option[Product] = {
    store.find(_.id == id)// Return the product with the given ID
  }

  def updateProductQuantity(id: String, quantity: Int): Unit = {
    getProductById(id) match {
      case Some(product) =>//check in inventory
        val updatedProduct = product.copy(quantity = quantity) // create a updated verion on a consisting class
        store = store.map(p => if (p.id == id) updatedProduct else p)//update inventory
      case None => println(s"Product with ID $id not found")
    }
  }

  //retrieve all product names
  def getAllProductNames: Array[String] = {
    store.map(_.name)
  }

  //calculate total value of all products
  def getTotalValue: Double = {
    store.map(p => p.price * p.quantity).sum  //returns a array with prices and .sum on the array
  }

  // check if the inventory is empty
  def isEmpty: Boolean = {
    store.isEmpty
  }

  // Function to merge two inventories
  def mergeInventories(otherInventory: Inventory): Unit = {
    val mergedStore = (store ++ otherInventory.getProductList) //added array
      .groupBy(_.id)// grouo by id
      .map {
        case (id, products) =>
          val highestPriceProduct = products.maxBy(_.price)//chose product with highets price
          val totalQuantity = products.map(_.quantity).sum // returns a list of quantities and .sum on the list
          highestPriceProduct.copy(quantity = totalQuantity) // create new product using instance
      }
      .toArray

    store = mergedStore
  }

  //check if a product with a specific ID exists and print its details
  def checkAndPrintProductById(id: String): Unit = {
    getProductById(id) match {
      case Some(product) => println(s"Product details: $product")
      case None => println(s"Product with ID $id does not exist")
    }
  }
}

// Object to run example code
object Main extends App {
  val inventory1 = new Inventory()
  val inventory2 = new Inventory()

  // Adding products to inventory1
  inventory1.addProduct(Product("101", "Laptop", 10, 1500.00))
  inventory1.addProduct(Product("102", "Smartphone", 20, 800.00))

  // Adding products to inventory2
  inventory2.addProduct(Product("102", "Smartphone", 5, 900.00))
  inventory2.addProduct(Product("103", "Tablet", 15, 600.00))

  // Retrieve all product names from inventory1
  println("Product Names in Inventory1:")
  inventory1.getAllProductNames.foreach(println)

  // Calculate the total value of all products in inventory1
  println(s"Total value of products in Inventory1: ${inventory1.getTotalValue}")

  // Check if inventory1 is empty
  println(s"Is Inventory1 empty? ${inventory1.isEmpty}")

  // Merge inventory1 and inventory2
  inventory1.mergeInventories(inventory2)
  println("Merged Inventory1:")
  inventory1.printProductList()

  // Check if product ID 102 exists in inventory1 and print its details
  println("Checking for Product ID 102:")
  inventory1.checkAndPrintProductById("102")
}
