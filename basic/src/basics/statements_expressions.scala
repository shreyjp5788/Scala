package basics

object statements_expressions {
  def main(args:Array[String]): Unit={
    val value = 42
    val age = 22

    /*
      * the plus sign is not actually built into the language, it's part of the library
      *  indeed it is a method defined on the Integer type
      *  so the value uses the dot notation to call a method plus and passes age to it.
     */
    value.+(age)

    /*  there is one more way of calling a method which takes only one argument.  */
    value + age // <-- where + sign is method name and age is the argument to it.

    value min age // <-- min is the method for the integer type and it takes one argument age.

    val name = "Shreyas"
    /*  in scala the below expressions returns true as it does the equality check  */
    name == "Shreyas"

    /*  you can do multiplication on strings to repeat the same string no of times  */
    println( (name + " ") * 5)
  }
}
