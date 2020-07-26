package oobasics

class Precedence (val x: Double, val y: Double) {
  /*
    *   you can also have the names that are made completely of operator symbols
    *
    *   + - * / % | & ^ ! < > = ? $ \ :
    *
    *
    */
  def plus(v: Vect2D) = new Vect2D(x + v.x, y + v.y) // <-- original method name, it is returning the object that has been created
  def +(v: Vect2D) = new Vect2D(x + v.x, y + v.y) // <-- change to symbolic name, it is returning the object that has been created
  def minus(v: Vect2D) = new Vect2D(x - v.x, y - v.y) // <-- original method method name, it is returning the object that has been created
  def -(v: Vect2D) = new Vect2D(x - v.x, y - v.y) // change to symbolic method name, it is returning the object that has been created
}

object Precedence{
  def main(args: Array[String]): Unit = {

    val v1 = new Vect2D(1, 2)
    val v2 = new Vect2D(2, 2)


    /*
     *  who will have the more precedence when we do something like this
     *  the multiplication will be evaluated first and then the addition, so what is the rule that is governing this?
     *  the rule that Scala uses is the first character of the method name when it's used in infix notation determines the precedence.
     *
     *  Precedence chart
     *    other special characters
     *    * / %
     *    + - more more accurately names of methods that are used in infix notation that begin with + or -
     *    :
     *    = !
     *    < >
     *    &
     *    |
     *    all letters
     */

    //val v4 = v1 + v2 * 3
    //println("X:" + v4.x + " Y:" + v4.y)
  }
}
