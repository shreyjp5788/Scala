package basics

/*
 *  basic sequence method
 *
 *  try these commands on scala interpreter
 *
 *  these methods do not change the original array, rather it gives you the new array
 */
object basic_sequence_method {
  def main(args:Array[String]): Unit = {

    val a = Array(6, 9, 1, 5, 8, 2, 3, 4)

    /*  what we can do with and array variable  */
    a.drop(2)   // <-- removes the first two values from array.

    a.dropRight(2)    // <-- removes the last two values from the array.

    a.head    // <-- gives you the first value of the array.

    a.tail    // <-- gives you the array containing all the values except the first one.

    a.last    // <-- you can ask for the last element of the array

    a.size    // <-- gives you the size of the array.

    a.length  // <-- it is same as the size method

    a.splitAt(3)    // <-- splits the array into tuple of two arrays, it divides based on the input index value.

    a.take(3)   // <-- gives you the first three values from the array

    a.takeRight(3)    // <-- gives you the last three values from the array

    a.slice(2, 5)   // <-- gives the starting index and the ending index

    a.patch(3, Array(98, 99), 3)  // <-- it takes the starting index position, second argument is what you want to
                                  // replace it with,third argument is how many elements you want to replace with

    a.diff(Array(1,2,3,4))    // <-- it gives you the new collection excluding the values provided in the Array.

    Array(1,1,1,1,2,2,2,3,3,3,4,4,4).diff(Array(1,2,3,4))   // <-- excludes only the first instance of the matching value from diff

    Array(1,2,7,7,4,3,7,1,1).distinct   // <-- it gives you the distinct values

    a.intersect(List(4,5,6,7))    // <-- gives you the common values matching between the array and the list.

    a.union(Array(11,12,13,14))   // <-- it adds the values from the second array into the first array, it can contain the duplicate values.

    a.sum   // <-- it gives you the sum of all values from the collection

    a.product   // <-- it gives you the product of all the values from that collection

    a.sorted    // <-- sorts the collection

    a.mkString  // <-- converts it into string

    a.mkString(",")   // <-- converts it into string separated with comma

    a.mkString("[",", ","]")    // <-- makes the string

    a.zip('a' to 'd')   // <-- will give you the array of tuples and the tuple will contain one value from array a and one character value.
    a.zip('a' to 'z')   // now if any one of the values are shorter than it will stop right away, even though the either of collection has no of values greater than the other

    a.zipWithIndex    // <-- creates an array of tuples where tuples contain the index of the value.
  }
}
