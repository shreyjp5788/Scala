package oobasics

/*
 *  we have seen how we can hide the variables to the outside world by declaring them as private.MutableVect2D
 *  but in private also we have some control over things
 *  we can add brackets to private to define it precisely what it is private to (like private[]) any bounding scope
 *
 *  what is bounding scope?
 *  since the visibility is inside the package oobasics it could be seen by any one inside of the same package.MutableVect2D
 *
 *  the default access provider in scala is public if you don't mention
 *  in java if you don't provide anything then it is package private which is exactly like what is mentioned in the below line.
 *  class visibility (private[oobasics] var _x:Double, private[oobasics] var _y:Double)
 *
 *  when we make package private, but in actual it is public inside of this package, that means i can change the value
 *  of it from any object or class of this package
 *
 *  i can also mention this as the bounding scope.
 *  class visibility (private[this] var _x:Double, private[this] var _y:Double)
 */
//class visibility (private[oobasics] var _x:Double, private[oobasics] var _y:Double)
class visibility (private[this] var _x:Double, private[this] var _y:Double)
{

  /*
  *  you can also have the names that are made completely of operator symbols
  *
  *  + - * / % | & ^ ! < > = ? $ \ :
  *
  */
  def x = _x  // this is the method which returns the value of _x
  def y = _y  // this is the method which returns the value of _y

  /*
   *  so to understand the visibility
   *  this would have been possible if it was package private i.e. var defined as private[package_name] var _x or _y
   */
  def plus(mv:MutableVect2D): MutableVect2D={
    _x += mv._x
    _y += mv._y
    this
  }

  /*
   *  but here we have mentioned "this" as the argument to the private, which means that it is not only private to the class but also
   *  to the instance of the class
   *
   *  so only thing that can touch it is the instance that contains it other instances can't alter it.
   */
  def plus(mv:MutableVect2D): MutableVect2D={
    _x += mv.x  // mv is the another class instance which will not allow you to use _x directly
    _y += mv.y  // mv is the another class instance which will not allow you to use _y directly
    this
  }

}


object MutableVect2D {
  def main(args: Array[String]): Unit = {
    val v1 = new MutableVect2D(1, 2)
    val v2 = new MutableVect2D(2,2)
    val v3 = new MutableVect2D(1, 2)
    val v4 = new MutableVect2D(1, 2)

    v1.plus(v2)
    println("X:" + v1.x + " Y:" + v1.y)

    /*
     *  we can do this, but we are changing the value of v4 internally as we are using the augmentation way
     *
     *  but it may be confusing for someone how the value of v4 got changed just looking at the below expression
     */
    val v5 = v4 + v2
    println("X:" + v4.x + " Y:" + v4.y)

    /*
     *  the better way of writing the method name for the above problem would be to use += as the method name
     *
     *  as we are mutating it by using the values from object v3 and changing it values back with the new ones after adding
     *  one can understand that we are adding the values of two objects and storing the new values back to first object, that
     *  means the original values of first object will no more be available.
     */
    v3 += v2
    println("X:" + v3.x + " Y:" + v3.y)
  }
}
