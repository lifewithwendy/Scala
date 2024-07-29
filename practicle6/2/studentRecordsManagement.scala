import scala.io.StdIn.readLine

// Function to calculate the grade based on percentage
def calculateGrade(percentage: Double): Char = {
  percentage match {
    case p if p >= 90 => 'A'
    case p if p >= 75 => 'B'
    case p if p >= 50 => 'C'
    case _            => 'D'
  }
}

// Function to validate user input
def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
  if (name.isEmpty) {
    (false, Some("Name cannot be empty"))
  } else if (marks < 0 || marks > totalMarks) {
    (false, Some("Marks must be between 0 and total possible marks"))
  } else if (totalMarks <= 0) {
    (false, Some("Total possible marks must be positive"))
  } else {
    (true, None)
  }
}

// Function to get student info from the user
def getStudentInfo: (String, Int, Int, Double, Char) = {
  // Read input from the user
  print("Enter student's name: ")
  val name = readLine().trim
  print("Enter marks obtained: ")
  val marks = readLine().toInt
  print("Enter total possible marks: ")
  val totalMarks = readLine().toInt
  
  // Validate input
  val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
  
  if (isValid) {
    // Calculate percentage and grade
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = calculateGrade(percentage)
    (name, marks, totalMarks, percentage, grade)
  } else {
    println(errorMessage.get)
    // Return a default tuple in case of invalid input (can be handled differently as needed)
    ("", 0, 0, 0.0, 'D')
  }
}

// Function to print student record
def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
  val (name, marks, totalMarks, percentage, grade) = record
  println(s"Student Name: $name")
  println(s"Marks Obtained: $marks")
  println(s"Total Possible Marks: $totalMarks")
  println(f"Percentage: $percentage%.2f%%")
  println(s"Grade: $grade")
}

// Function to get student info with retry
def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
  var record: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')
  var isValid = false
  
  while (!isValid) {
    // Get student info
    record = getStudentInfo
    // Validate input
    val (_, errorMessage) = validateInput(record._1, record._2, record._3)
    isValid = errorMessage.isEmpty
    if (!isValid) {
      println(errorMessage.get)
    }
  }
  record
}

// Main object to run the application
object StudentRecordsApp extends App {
  println("Welcome to the Student Records Application")

  // Get valid student info
  val studentRecord = getStudentInfoWithRetry
  
  // Print the student record
  printStudentRecord(studentRecord)
}
