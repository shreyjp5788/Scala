package basics

/*
 *  Update Method
 */
object update_method {
  def main(args: Array[String]): Unit = {

    /*
     *  write the below expression in repl or terminal window
     */
    val a = Array(1,2,3,4)

    a(1)  //<-- to get the value at index 1

    /*
     * what about assignment operator
     *
     *  in order to make this method work scala has another method called update method
     */
    a(1) = 99 // <-- it will mutate a i.e. it will change the value at index 1
    a.update(1, 99) // <-- it takes the index no and the new value to replaced with.



  }
}
