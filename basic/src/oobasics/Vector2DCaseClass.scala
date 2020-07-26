package oobasics

/*
 *  Case Class
 *
 *  just mention the word case in front of the normal class to make it case class
 *
 *  when we give the parameters for the constructor they are automatically vals
 *
 *  a number of methods are added to a class automatically
 *    hash code method
 *    equals to method
 *    toString method\
 *
 *  when you create a case class it automatically creates a companion object and puts some method in there including an
 *  apply method that can be used for constructing the  objects.
 *
 *  if you are intending to make the class that is immutable you might consider making it a case class, to get the
 *  additional features.
 *
 *  do it for something that is immutable if it is not immutable this is very bad idea and you shouldn't really do it.
 */
case class Vector2DCaseClass(x: Int, y: Int){ //<-- x, y are automatically vals here

  /*
   *  there is also a method called an apply for pattern matching
   *  it is somewhat similar to switch
   */
  def apply(index: Int): Unit = index match{
    case 0 =>
    case 1 =>
    case _ => // <-- in case no matching case found
  }

  def +(obj: Vector2DCaseClass): Vector2DCaseClass={
    Vector2DCaseClass(x + obj.x, y + obj.y)
  }
}

object Vector2DCaseClass{
  def main(args: Array[String]): Unit = {
    val v1 = Vector2DCaseClass(1, 2)
    val v2 = Vector2DCaseClass(2, 2)

    val v3 = v1 + v2

    /*
     *  so the copy method here allows to use the original value of x but it will change the value of y
     */
    v3.copy(y = 99)
  }
}
