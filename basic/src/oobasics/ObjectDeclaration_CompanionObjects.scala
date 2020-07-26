package oobasics

/*
 *  Object Declaration & Companion Objects
 *
 *  we have been using the object declaration for while now after all of our applications had to go inside of an object declaration
 *  because the classes don't exist until you call new on them and the objects which create a singleton objects just exist on their own
 *  and we have also referred to companion objects
 */
class ObjectDeclaration_CompanionObjects(private var _x:Int, private var _y:Int) {

  def get_x():Int = {
    _x
  }

  def get_y():Int = {
    _y
  }

  def +=(obj:ObjectDeclaration_CompanionObjects):ObjectDeclaration_CompanionObjects={
    this._x += obj._x
    this._y += obj._y
    this
  }

}

/*
 *  Companion objects have same name as the class name and are declared in the same file
 *  they are used for no of different things
 *    first:  you can do anything that would be associated with this class, but every instance of the class doesn't need
 *            a copy it would go inside of companion object if you had some kind of data that was being used it was
 *            associated with ObjectDeclaration_CompanionObjects
 *
 *    second: it has the ability to see the private members of its associated class and the class has the ability to se
 *            the private members of the companion object
 *
 *  the real benefit comes when we want to have multiple ways of constructing our object and we potentially want to
 *  limit the ability to pass in the class parameter values information directly
 */
object ObjectDeclaration_CompanionObjects{
  def main(args: Array[String]): Unit = {
    val obj1 = new ObjectDeclaration_CompanionObjects(1, 2)
    val obj2 = new ObjectDeclaration_CompanionObjects(2, 2)

    obj1 += obj2

    println("X: " + obj1._x + " Y: " + obj1._y)
    println("X: " + obj2._x + " Y: " + obj2._y)
  }
  /*
   *  so you can have your own apply method for the class, once you define the apply method for your class there is no
   *  need to write the new keyword for creating the object of the class or class instance
   */
  def apply(x:Int, y:Int) = new ObjectDeclaration_CompanionObjects(x, y)
}

/*
 *  try the below command in repl or terminal
 *
 *  we have seen the usage of the companion objects in the libraries before
 *  we actually saw the apply method which we said that was actually short for say list
 *
 *  so the apply method is located in the companion object to list
 */
// List(1,2,3,4) //<-- internally invoking the apply method

// List.apply(1,2,3,4)

