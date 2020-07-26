package basics

object associtivity_unary {
  def main(args: Array[String]): Unit = {

    /*
     *  associtivity is whether things bind left to right or right to left.
     */

    2-3-4 // <-- here the operators happen from left to right. so this is a left associative.

    (2.-(3)).-(4) // converting the left associative into method calls.

    /*
     * you can also make things right associative and any operator that ends in a colon is a right associative
     *
     * :: is not method on int, it's method on the list
     * Nil is list here
     */

    1::2::3::Nil
    (1 :: (2 :: (3 :: Nil)))  // turns out this expression here is actually binding from right to left.
    Nil.::(3).::(2).::(1) // the above expression can also be written as this


    /*
     *  there are some notations that are not infix and to make them infix we need to use unary
     *  unary can only be applied on tilda (~), - and !
     *
     *  the unary_- method will be called and and it will negate the values of x and y
     */
    //val v4 = -v1  // so considering object v1 has x and y value as 1 and 2.
  }
}

/*
 *  this might be the the method that may have been in some class to negate the values of the object
 */
//def unary_-() = new <classname>(-x, -y)
