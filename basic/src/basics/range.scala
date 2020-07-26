package basics

/*
 *  Range (Sequence type)
 *
 *  below command can be typed in scala command prompt
 */
object range {
  def main(args:Array[String]): Unit = {

    /*
     *  you can create range using to or until keyword
     *
     *  res<No> variable is created by REPL(Read - Evaluate - Print - Loop)
     */
    1 to 10   // <-- this will return the range with a variable res<No>, you can make use of this variable to iterate through range and fetch values

    1.to(10)  // <-- this will return the range with a variable res<No>, you can make use of this variable to iterate through range and fetch values

    1 until 10  // <-- this will return the range with a variable res<No>, you can make use of this variable to iterate through range and fetch values

    /*  you can also create range on the characters */
    'a' to 'g'  // <-- this will return the range with a variable res<No>, you can make use of this variable to iterate through range and fetch values

    /*
     *  in case you don't want all the values ranging from 1 to 10 then you can mention the skip value using keyword "by"
     *
     *  for example : this will give all the odd numbers as we are skipping by 2
     */
    1 to 10 by 2

    /*
     *  similarly you can do it with characters
     *
     *  this will skip the every second character in the range.
     */
    'a' to 'g' by 2

    /*
     *  when it comes to double you need to mention the skip value using "by" keyword
     */
    //1.0 to 10.0 by 1.0

    //1.0 to 100.0 by 0.1

    /*
     *  you can also have reverse range
     */
    10 to 1   // <-- created an empty range
  }
}
