package basics

import scala.io.StdIn._
/*
 *  List
 *
 *  Recursion
 *
 *  Patterns
 */
object list_recursion_patterns {
  def main(args:Array[String]): Unit = {

    val lst = buildList()
    println(lst)

    println(concatStrings(lst))

    println(concatStringsPat(lst))
  }

  def buildList(): List[String] = {
    val input = readLine()

    /*
     *  it recurrs all the recursive functions need a base case, so base case here is Nil
     */
    if (input == "quit") Nil    // <-- Nil : we are returning the empty list.
    else input::buildList()     // <-- returning the input as list.
  }

  def concatStrings(words: List[String]):String = {
    if (words.isEmpty) ""
    else words.head + concatStrings(words.tail)
  }

  /*
   *  this is the alternative way of writing the above method using the pattern match
   */
  def concatStringsPat(words: List[String]):String = words match {
    case Nil => ""
    case h :: t => h + concatStringsPat(t)
  }
}
