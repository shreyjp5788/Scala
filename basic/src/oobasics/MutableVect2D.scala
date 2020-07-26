package oobasics

class MutableVect2D (private var _x:Double, private var _y:Double){
  /*
  *  you can also have the names that are made completely of operator symbols
  *
  *  + - * / % | & ^ ! < > = ? $ \ :
  *
  */
  def x = _x  // this is the method which returns the value of _x
  def y = _y  // this is the method which returns the value of _y

  /*
   *
   */
  def plus(mv:MutableVect2D): MutableVect2D={
    _x += mv.x
    _y += mv.y
    this
  }

  def +=(mv:MutableVect2D): MutableVect2D={
    _x += mv.x
    _y += mv.y
    this
  }

  def +(mv:MutableVect2D): MutableVect2D={
    _x += mv.x
    _y += mv.y
    this
  }

  def minus(mv:MutableVect2D): MutableVect2D={
    _x -= mv.x
    _y -= mv.y
    this
  }

  def -=(mv:MutableVect2D): MutableVect2D={
    _x -= mv.x
    _y -= mv.y
    this
  }

  def -(mv:MutableVect2D): MutableVect2D={
    _x -= mv.x
    _y -= mv.y
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