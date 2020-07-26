package oobasics

/*
 *  classed need to instantiated.
 *
 *  Scala being a functional language often prefers things to be immutable
 *  you can give the default values to the class
 *
 *  variables defined after the class name in () are not members of the class
 *  their values can be used for setting things up
 *  you cannot access them from outside, we won't be able to get hold of them
 *  we have to make them either vals or vars
 *  we can also put the declarations inside, but if i want to be able to access first name and last name i probably
 *  want them to be val
 *
 *  Unlike many other languages, the primary constructor is in the class signature that is mentioned after the class
 *  name in ()
 *  Constructors can have optional parameters by providing a default value like:
 *  class Pointer(var x: Int = 0, var y: Int = 0)
 *
 *  in mutable class _quizzes, _assignments, _tests can't be vals because the list is immutable
 *  so if we define them as var anyone can access them and change the list, to make the changes to any data member we
 *  should have certain methods in class.
 *  this is where accessibility modifiers come into picture
 *
 *  in addition if you have methods or other stuff that's implementation details that the outside code doesn't need to
 *  know about you should probably make that private too
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
class Student (
                val firstName: String,
                val lastName: String,
                private var _quizzes: List[Int] = Nil,
                private var _assignments: List[Int] = Nil,
                private var _tests: List[Int] = Nil
              ){

  private def validGrade(grade: Int): Boolean = grade >= -20 && grade <=120

  def addQuiz(grade: Int) : Boolean ={
    if(validGrade(grade)){
      _quizzes ::=grade  // this is similar to -= or +=, here it will be quizzes = quizzes :: grade
      true
    }else false
  }

  def addAssignments(grade: Int) : Boolean ={
    if(validGrade(grade)){
      _assignments ::=grade  // this is similar to -= or +=, here it will be quizzes = quizzes :: grade
      true
    }else false
  }

  def addTest(grade: Int) : Boolean ={
    if(validGrade(grade)){
      _tests ::=grade  // this is similar to -= or +=, here it will be quizzes = quizzes :: grade
      true
    }else false
  }

  def quizAverage: Double = {
    if (_quizzes.isEmpty)
      0.0
    else if (_quizzes.length == 1)
      _quizzes.head
    else
      (_quizzes.sum - _quizzes.min).toDouble/(_quizzes.length - 1)
  }

  def assignmentaverage:Double = {
    if(_assignments.isEmpty)
      0.0
    else
      _assignments.sum.toDouble/_assignments.length
  }

  def testAverage: Double = {
    if (_tests.isEmpty) 0.0
    else _tests.sum.toDouble/_tests.length
  }

  def average: Double = quizAverage * 0.1 + assignmentaverage * 0.5 + testAverage * 0.4

  /*
   * if you want to assign the private member data to public member data you can either mention the type or you can just skip it.
   */
  def quizzes: List[Int] = _quizzes
  def quizzes1 = _quizzes


}
