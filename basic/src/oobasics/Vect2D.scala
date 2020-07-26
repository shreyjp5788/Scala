package oobasics
/*
 *  Immutable Class
 */
class Vect2D(val x: Double, val y: Double) {
/*
  *  you can also have the names that are made completely of operator symbols
  *
  *  + - * / % | & ^ ! < > = ? $ \ :
  *
  */
  def plus(v: Vect2D) = new Vect2D(x + v.x, y + v.y) // <-- original method name, it is returning the object that has been created
  def +(v: Vect2D) = new Vect2D(x + v.x, y + v.y) // <-- change to symbolic name, it is returning the object that has been created
  def minus(v: Vect2D) = new Vect2D(x - v.x, y - v.y) // <-- original method method name, it is returning the object that has been created
  def -(v: Vect2D) = new Vect2D(x - v.x, y - v.y) // change to symbolic method name, it is returning the object that has been created
}

object Vect2D{
  def main(args: Array[String]): Unit = {

    /*
    *  you can make the combination of above mentioned operators into names and it is a valid Scala name.
    */
    //def +*/ = 5  // <-- allowed to have names with the operator symbols
    //def abc_+&! = 10 // <-- symbolic naming


    val v1 = new Vect2D(1, 2)
    val v2 = new Vect2D(2, 2)

    /*
     *  but if you have a method that takes the argument can be used in an infix notation.
     *  here you don't want to say "plus" but you want a "+" sign, we are used to reading and indeed because of the
     *  symbolic names Scala allows us to change plus and minus to "+" / "-" sign
     *
     *  so on changing the method name to operator sign we can write the below expression in readable format
     */
    val v3 = v1.plus(v2)  // <-- original way of calling class method

    /*
     *  this is ok when you are working with the immutable class, for mutable this may not work if you are trying to use augmentation method
     */
    val v4 = v1 + v2 // <-- when the method name is the operator name, we can write the previous expression in this way

    println("X:" + v3.x + " Y:" + v3.y)
    println("X:" + v4.x + " Y:" + v4.y)
  }
}
