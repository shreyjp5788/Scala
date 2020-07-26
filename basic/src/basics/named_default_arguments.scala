package basics

/*
 *  Named and Default Argument
 */
object named_default_arguments {
  def main(args:Array[String]):Unit = {
    grade(List(23,234,46), List(34,36,12,546), List(89,234,456,23,55))  // <-- so we dont need to specify for which variable these arguments are

    // so don't have to specify in same sequence as the callable function, instead you can name the arguments for which argument what is the value
    grade(tests=List(89,234,456,23,55), quizzes=List(23,234,46), assignments=List(34,36,12,546))
  }

  /*
   *  here we are passing 3 arguments and return type is Double
   */
  def grade(quizzes:List[Int], assignments:List[Int], tests:List[Int]):Double = {
    ???
  }

  /*
   *  Default Value
   *
   *  so we have specified the default value in case we not passing any value fot tests
   */
  def grade1(quizzes:List[Int], assignments:List[Int], tests:List[Int]=Nil):Double={
    ???
  }
}
