package basics

/*
 *  Apply Method
 *
 *  it is broadly used through the language what makes it be object oriented language or functional language.
 *
 *  as a general rule in scala when you have an object wether it is a singleton object or an instance object followed by
 *  parentheses that gets expanded to a call to the apply method
 *
 *  if you want an object that works as a function of you wish to have a class whose instances will work as a functions
 *  you can define the apply method
 */
object apply_method {
  def main(args: Array[String]): Unit = {
    /*
     *  try the below commands in repl or scala terminal
     */
    Array(1,2,3,4)  // if you look at it we didn't call the apply method, but turns out that we did

    Array.apply(1,2,3,4)  // this is the short for array dot apply


    /*
     *  parentheses signify that we want to call the apply method and in order to invoke it like a function we have to
     *  call the apply method
     */
    val f = () => math.random()

    f()

    f.apply()

    f.apply  // <-- doesn't matter if you don't provide the parentheses

    f // <-- but if you don't give the parentheses then you will get the function itself
  }
}
