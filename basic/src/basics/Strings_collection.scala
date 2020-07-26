package basics

/*
 *  Strings can also be considered as Collection
 *
 *
 */
object Strings_collection {
  def main(args:Array[String]): Unit ={
    /*
     *  it compares based on the ascii values.
     */
    "This is a test".filter(_<'l')

    /*
     *  filter method
     */
    "This is a test".filter(c => "aeiou".contains(c))

    /*
     *  Split method
     *
     *  this will split the string into array of string.
     */
    "This is a test".split(" ")
  }
}
