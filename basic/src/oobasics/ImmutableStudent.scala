package oobasics

/*
 *  Immutable concept
 *
 *  In immutable all the default argument of the class will be vals
 *
 *  No one can mess up the code in this class as everything is immutable
 *
 *  :: here means that we want to prepend one list to another for example
 *  val v1 = List(1, 2)
 *  val v2 = List(3, 4)
 *  val v3 = v1::v2 the result will be
 *  List(List(1, 2), 3, 4)
 *
 *  On similar lines there is something like :::
 *  its purpose is same but the result will different so if you do
 *  val v3 = v1:::v2 the result will be
 *  List(1, 2, 3, 4)
 */
class ImmutableStudent (
                         val firstName: String,
                         val lastName: String,
                         val quizzes: List[Int] = Nil,
                         val assignments: List[Int] = Nil,
                         val tests: List[Int] = Nil
                       ){

  private def validGrade(grade: Int): Boolean = grade >= -20 && grade <= 120
  /*
   *  here we are not allowed to change the immutable variable
   *  so to overcome this we have to create a new Immutable object or instance
   */
//  def addQuiz(grade: Int) : Unit ={
//    quizzes ::=grade  // this is similar to -= or +=, here it will be quizzes = quizzes :: grade
//  }
  def addQuiz(grade: Int): ImmutableStudent = {
    if (validGrade(grade))
      new ImmutableStudent(firstName, lastName, grade::quizzes, assignments, tests)
    else
      this  // <-- it is the current object representation
  }

  def addAssignments(grade: Int): ImmutableStudent = {
    if (validGrade(grade))
      new ImmutableStudent(firstName, lastName, quizzes, grade::assignments, tests)
    else
      this  // <-- it is the current object representation
  }

  def addTests(grade: Int): ImmutableStudent = {
    if (validGrade(grade))
      new ImmutableStudent(firstName, lastName, quizzes, assignments, grade::tests)
    else
      this  // <-- it is the current object representation
  }

  def quizAverage: Double = {
    if (quizzes.isEmpty)
      0.0
    else if (quizzes.length == 1)
      quizzes.head
    else
      (quizzes.sum - quizzes.min).toDouble/(quizzes.length - 1)
  }

  def assignmentaverage:Double = {
    if(assignments.isEmpty)
      0.0
    else
      assignments.sum.toDouble/assignments.length
  }

  def testAverage: Double = {
    if (tests.isEmpty) 0.0
    else tests.sum.toDouble/tests.length
  }

  def average: Double = quizAverage * 0.1 + assignmentaverage * 0.5 + testAverage * 0.4
}
