package basics

/*
 *  Arrays and Lists
 *
 *  they are available under collection class.
 *
 *  Array is mutable whereas List is not.
 */

object arrays_lists {
  def main(args:Array[String]): Unit = {
    val arr_1 = Array(9, 4, 7, 2, 5)
    println("Before changing the value :" + arr_1(2))
    arr_1(2) = 8
    println("After changing the value :" + arr_1(2))

    val list_1 = List(9, 4, 7, 2, 5)
    println("Before changing the value :" + list_1(2))
    arr_1(2) = 8
    println("Before changing the value :" + list_1(2))
  }
}
