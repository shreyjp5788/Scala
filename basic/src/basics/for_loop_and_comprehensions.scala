package basics

object for_loop_and_comprehensions {
  def main(args:Array[String]): Unit = {
    /*
     *  to and until are methods in integer
     */
    for(i <- 1 to 10) { // "<-" denotes "in" so you read it like "i in 1 to 10"
      println(i)
    }

    println("*" * 15)
    println()

    /*
     *  it will iterate till n-1 i.e last value - 1
     */
    for (i <- 0 until 10){
      println(i)
    }

    println("*" * 15)
    println()

    /*
     *  so we can have condition in the for loop
     *
     *  there is no need to put the parenthesis around the if condition
     */
    for(i <- 0 until 10; if i%3==0 || i%5==0 ){
      println(i)
    }

    println("*" * 15)
    println()

    /*
     *  we can add one more range in the same for loop
     *
     *  if you see the output the second range is like nesting iteration.
     */
    for(i <- 0 until 10; if i%3==0 || i%5==0; j <- 'a' to 'c'){
      println(i + " " + j)
    }

    println("*" * 15)
    println()

    /*
     *  so there is another style of writing the for loop
     *  so you can avoid the semicolon
     */
    for{
      i <- 0 until 10
      if i%3 == 0 || i%5 == 0
      sqr = i * i
      j <- 'a' to 'c'
    }{
      println(i + " " + j)
    }

    println("*" * 15)
    println()

    /*
     *  so the above for loop is doing something but not giving us back anything
     *
     *  as all other control structures could be used as expressions in order to
     *  use the for as an expression
     *
     *  this will give me the vector of tuple.
     */
    var tuple_1 = for{
      i <- 0 until 10
      if i%3 == 0 || i%5 == 0
      sqr = i * i
      j <- 'a' to 'c'
    } yield {
      i -> j  // this "->" is used to convert the data to tuple.
    }
    print(tuple_1)

  }
}
