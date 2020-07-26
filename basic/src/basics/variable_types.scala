package basics

object variable_types {
  def main(args: Array[String]): Unit = {

    /*
     *  val keyword
     *
     *  you should use it vast majority of time.
     *
     *  val's cannot point to different object or different value once they are declared
     */

    // they use type inference here(so scala will try to figure out the type for you.)
    val name = "Shreyas"

    // you can also specify explicitly the type you want to store the information
    val name_1:String = "Shreyas"


    /*
     *  var keyword
     *
     *  you should not use var too much in your programming
     *
     *  var's can have different values or point to different object anytime after they have been declared.
     */

    // they also use type inference here(so scala will try to figure out the type for you)
      var age = 31

    // you can also specify explicitly the type you want to store the information
      var age_1:Int = 31


    /*
     *  tuple type
     *
     *  you can put values inside the () brackets and seperate them with commas.
     */
      val t = (1, 2.7, "hi there")

      // extracting the values from the tuple
      val (a, b, c) = t

      // other way of extracting the value from the tuple
      val a1 = t._1
      val b1 = t._2
      val c1 = t._3
  }
}
