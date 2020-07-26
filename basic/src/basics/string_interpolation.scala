package basics

/*
 *  String Interpolation
 *
 *  string interpolation is handy way to build strings and it's especially if you have multiple variables that you want
 *  to put inside of a single string and then you want to have other stuff in between them, string interpolation gives you more
 *  compact form there's generally easier to read and work with.
 */
object string_interpolation {
  def main(args:Array[String]): Unit={
    val name = "Shreyas"
    val age = 31

    val message = name + " is " + age + " years old."

    val message_1 = s"$name is $age years old."
  }

}
