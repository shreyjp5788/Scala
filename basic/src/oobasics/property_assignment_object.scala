package oobasics

object property_assignment_object {
    def main(args: Array[String]): Unit = {
      val v1 = new Property_assignment_methods(1, 2)
      val v2 = new Property_assignment_methods(2,2)

      /*
       *  if you want to set the value of x, you call the method setX
       */
      v1.setX(10)

      /*
       *  the other nice way of writing it could be this, but to achieve this we need to have a def
       *  that has name like this def x_=(newX: Double):Unit = _x = newX
       *  this allows the programmer the full ability to change the value of private _x and _y
       */
      v1.x = 10 // since this is private in the class we cannot change the value.
        println("X:" + v1.x + " Y:" + v1.y)
    }
}
