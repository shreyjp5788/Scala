package basics

/*
 *  all applications in Scala are declared as objects, so when you are writing applications you can put one of three
 *  things at the top level either an object, class or trait.
 *
 *  these object declaration creates a singleton objects.
 *
 *  the keyword for declaring the methods in Scala is "def"
 *
 *  the main method is the entry point of a scala program.The Java Virtual Machine requires a main method named, main that takes
 *  one argument an array of strings.
 */
object HelloWorld {
  def main(args: Array[String]): Unit = { // <-- the Unit keyword denotes that there is no return value for this function or method
    println("HelloWorld")
  }
}
