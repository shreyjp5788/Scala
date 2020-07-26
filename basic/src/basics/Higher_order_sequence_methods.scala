package basics

/*
 *  one of the key functionality of functional programming language is the ability to pass around functions
 *  and you can treat functions just like any other values and you can pass them into other functions or methods
 *  and you can have them pass that
 *
 *  when function takes another function as an argument or returns one it's called higher order function
 *  in this we are gonna deal with higher order methods
 *
 *  the methods of collection that you don't just pass in values like the methods we just looked previously
 *  instead these are the methods that you pass them functions and those functions will kind of define what
 *  winds up happening higher order methods give you lot of power
 */
object Higher_order_sequence_methods {
  def main(args:Array[String]): Unit = {

    val a = Array(6, 9, 1, 5, 8, 2, 3, 4)

    a.foreach(println)    // <-- this is the shortest way of printing the array.

    /*
     *  Map and Filter
     *
     *  they really provide a lot of power because they do give you back a value
     *  so you can use map and filter to do interesting calculations and computations on collections without writing
     *  having to write a whole bunch of loops to do stuff for you
     */

    /*
     *  map runs through and applies a function to every element just like foreach except the function is supposed to give
     *  you back a result.
     *
     *  so whatever the result is that gets added to new collection.
     */
    a.map(_*2)    // <-- so you get new collection

    a.map(i => i*2)   // <-- make use of lambda

    /*
     *  Filter
     *
     *  filter also takes a function and is supposed to give us back a boolean
     */

    a.filter(i => i < 5)    // <-- we want the values from the array that are less than 5
    a.filter(_ < 5)   // <-- making use of _ as there is only single use of variable.

    a.filter(_ % 2 == 0)    // <-- get the even values


    /*
     *  so if you just want to know the count of the result, instead of getting the result back into variable.
     */

    a.count(_ % 2 == 0)


    /*
     *  if you want to know if the element exists in the collection or not
     */
    a.exists(_ < 5)

    /*
     *  forall gives you boolean and it tells you if some predicate is true for everything in the collection
     */
    a.forall(_ < 5)   // <-- this will result into false as all the values from the array are not smaller than 5

    val b = Array(1,2,3,4)
    b.forall(_ < 5)

    /*
     *  find method
     *
     *  if the code may or may not find a value the proper way of handling it is using option
     *
     *  there is a method which allows you to get the value of it, but you shouldn't just call the method
     *
     *  there is a reason why you shouldn't use that most because if you call it on none then you get an error.
     */
    a.find(_ % 4 == 0)
    // res45: Option[Int] = Some(8)   <-- this is the result of the find expression

    /*  there is another way of handling is using pattern */
//    res6 match{
//      case Some(i) => println(s"Found $i")
//      case None => println("Nothing Found")
//    }

    /*  you can also make use of getorElse() method
     *  you can specify the else value that you want to use or display.
     */
//    res6.getorElse(0)


    /*
     *  Partition
     */
    a.partition(_ < 5)    // <-- gives you two tuple of arrays where one tuple contains the values less than 5
                          // and other tuple contains the values greater than 5

    /*
     *  there are some complex methods like folds and reduce methods
     *
     *  they accumulate the values as they go
     */

    a.reduce(_ + _)   // <-- it takes a function of two arguments


    val c = Array("this", "is", "a", "test")
    c.minBy(_.length)
    c.min

  }
}
