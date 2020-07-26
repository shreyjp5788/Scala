package basics

object lambda_expressions {
  def main(args:Array[String]): Unit={

    /*  so it wants to know what the input type is */
    //val square = x => x * x

    /*
     *  so to make the above expression happy on the missing type
     *  most of the time scala will be able to figure out the type so you will rarely have to put a type annotation in your
     *  lambda expressions
     */
    val square = (x:Double) => x * x

    /*  you can call this like you call any other function/method */
    println(square(3))

    /*
     *  another way of writing the above expression
     *
     *  so we can define that square takes a double and goes to double.
     *
     *  square has type double double then the lambda expression doesn't need the type annotation
     *
     *  so scala will be able to figure out the rest of the information for you.
     */
    val square1: Double => Double = x => x*x

    /*
     *  there is one more way of writing the lambda expression
     *
     *  if each argument only appears once you can replace the argument with "_" underscore instead.
     *
     *  the below expression is the short hand type
     */
    val twice: Double => Double = _ * 2 // <-- x is replaced with underscore

    /*  comparing two variables using the "_" underscore  */
    val lt: (Double, Double) => Boolean = _ < _ // <-- two different values are replaced by underscore
  }
}
