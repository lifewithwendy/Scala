case class Book(title: String, author: String, isbn: String)
//declared a class
object LibraryManagement {
  // Initial set of books
  var library: Set[Book] = Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "0987654321"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455")
  )

  // add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
    println(s"Added book: ${book.title}")
  }

  // remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Removed book: ${book.title}")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }

  // check if a book is already in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // display the current library collection
  def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is empty.")
    } else {
      println("Current library collection:")
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  // search for a book by its title
  def searchBookByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title: $title")
    }
  }

  // display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.isEmpty) {
      println(s"No books found by author: $author")
    } else {
      println(s"Books by author $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    displayLibrary()

    addBook(Book("Brave New World", "Aldous Huxley", "3344556677"))
    removeBook("1234567890")
    println(s"Is '1984' in library? ${isBookInLibrary("1234567890")}")

    searchBookByTitle("To Kill a Mockingbird")
    displayBooksByAuthor("Harper Lee")
  }
}
