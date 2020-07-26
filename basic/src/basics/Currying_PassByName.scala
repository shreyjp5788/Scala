package basics

/*
 *  Currying and Pass by Name value
 */
object Currying_PassByName {
  def main(args:Array[String]): Unit={
    /*
     *  so when we are using the currying method we will use _ as it tells that there is one more argument and we have not specified it.
     *
     *  so when we write add(3)_ the plus3 becomes a function that take an argument and returns us the value.
     *
     *  it can be used more for the type inference
     */
    val plus3 = add1(3)_
    val eight = plus3(5)

    println(eight)
    println(threetuple(math.random()))  // <-- so here you will get the same values as the math.random is evaluated first and then pass
    println(threetuplefun(()=>math.random())) // <-- we are passing the function to the method which will return different value in the tuples as the math.random will be called 3 times as the return type is (Double, Double, Double)
    println(threetuple_passbyname(math.random)) // <-- so here we are just passing the name of the method instead of passing the function
  }

  /*
   *  this the normal way of writing the function
   */
  def add(x:Int, y:Int):Int = x+y

  /*
   *  this is how you write the currying
   *
   *  so we are passing one of the argument and it gives us back a function that is waiting for the second argument
   */
  def add1(x:Int) (y:Int):Int = x+y

  /*
   *  so when we pass math.random value it will be same across the tuple returned
   */
  def threetuple(a:Double):(Double, Double, Double)={
    (a,a,a)
  }

  /*
   *  so we are passing a function that gives us a random double value
   *
   *  this time the double value returned will be different in tuple
   */
  def threetuplefun(a:() => Double):(Double, Double, Double) = {
    (a(), a(), a())
  }

  /*
   *  this is a pass by name argument
   *
   *  instead of evaluating the code and then passing the value in it
   *  it takes the code(it takes the name of the func) and wraps it up in what's called func and passes that code in, so that every time that a is used
   *  a get evaluated
   */
  def threetuple_passbyname(a: => Double):(Double, Double, Double) = {
    (a,a,a)
  }
}
