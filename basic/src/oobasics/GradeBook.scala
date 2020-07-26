package oobasics

/*
 *  this will allow us to run as an application and the reason for that is objects are singleton that exist on their own
 */
object GradeBook {
  def main(args:Array[String]):Unit = {
    val students = List(new Student("Jane", "Doe"), new Student("John", "Doe"))
    for(s <- students) {
      printStudent(s)
    }

    /*
     *  since the Immutable class contains the variables that are defined as val, so that no one can change the values
     *  of the variable once defined.
     */
    val immstudents = List(new ImmutableStudent(firstName = "Jane", lastName = "Doe"), new ImmutableStudent(firstName = "John", lastName = "Doe"))
    for (p <- immstudents){
//      p.firstName = "Shreyas" // <-- it shows error reassignment to val
//      p.lastName = "Potdar" // <-- it shows error reassignment to val
    }

  }

  def printStudent(s:Student): Unit = {
    println(s.firstName + " " + s.lastName)
    println("Grade = " + s.average)
  }
}
