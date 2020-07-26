package basics

/*
 *
 */
object match_expression {
  def main(args:Array[String]): Unit = {

//    val fizzbuzz = for(i <- 1 to 20) yield {
//      (i%3, i%5) match {  // <-- two expression will result into some values
//        case(0,0) => "fizzbuzz" // <--  result value of first and second expression matches
//        case(0, _) => "fizz"  // <--  result value of first expression result matches another doesn't
//        case (_, 0) => "buzz" // <--  result value of first expression doesn't match but another matches
//        case _ => i.toString() // <-- result of both the expression doesn't match any of the previous case so returning value of i
//      }
//    }
//    println(fizzbuzz)

    /*
     *  if you want to add condition to case that is also possible
     */
    val fizzbuzz = for(i <- 1 to 20) yield {
      (i%3, i%5) match {  // <-- two expression will result into some values
        case(0,0) if i < 5 => "fizzbuzz" // <--  result value of first and second expression matches but we are adding
                                        // condition that it will be true only if the value of i < 5
        case(0, _) => "fizz"  // <--  result value of first expression result matches another doesn't
        case (_, 0) => "buzz" // <--  result value of first expression doesn't match but another matches
        case _ => i.toString() // <-- result of both the expression doesn't match any of the previous case so returning value of i
      }
    }
    println(fizzbuzz)

  }
}
