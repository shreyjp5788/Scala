package basics

/*
 *  import statements can also be scoped inside the curly braces
 *
 *
 */
import scala.io.StdIn._   // _ is the wildcard replacement in scala instead of asterik(in java) to include all methods

/*
 *  Libraries and Standard Input
 *
 */

object libraries_standard_input {
  def main(args:Array[String]): Unit = {
    println("What is your name?")
    val name = readLine()
    println("How old are you?")
    val age = readLine()
  }
}
