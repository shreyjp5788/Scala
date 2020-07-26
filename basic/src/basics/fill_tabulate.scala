package basics

/*
 *  Fill and Tabulate
 *
 */

object fill_tabulate {
  def main(args:Array[String]): Unit = {

    /*
     *  with fill you can make the array and list very large.
     *
     *  it takes tqo arguments size and default value or input from user
     *
     *  use fill/tabulate over new keyword to create an Array
     */
    val arr_1 = Array.fill(100)(0)

    //val arr_2 = Array.fill(5)(io.StdIn.readLine())

    /*
     *  tabulates take function as an argument
     *
     *  use fill/tabulate over new keyword to create an Array
     */
    val arr_3 = Array.tabulate(10)(i => i*i)
    println(arr_3)

    /*
     *  arrays can also be declared using new keyword.(type this in scala window to see the how it is being created)
     *
     *  this will create an array of 20 integers with default value set as 0
     *  with Array this is not a problem as it is mutable, but with the list this is not a good option as it is
     *  unmutable.
     *
     *  don't use this method of making the Arrays or Lists larger because when you work with Strings it initializes
     *  the default value as null which may result into the null pointer exception.
     */
    new Array[Int](20)

    new Array[String](20)
  }
}
