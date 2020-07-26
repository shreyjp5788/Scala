package basics

import java.io.PrintWriter
/*
 *  source is a class and an object that is used to read text data from something
 */
import scala.io.Source

/*
 *  Text Files
 */
object text_file {
  def main(args:Array[String]): Unit = {
    /*
     *  source is like a kin to our collection its like a sequence
     *  its not an array or list, its something called iterator
     *
     *  iterator is consumed as it is used
     *  iterator has map and filter method, but once you call the map and you have run all the way through it that
     *  original iterator is now gone, you have a new iterator that has the mapped values but you can't back through it
     *  obviously we could open the file again but that is inefficient
     *
     *  you don't have to load the entire file into the memory, so you only keep just enough for what you're doing right now
     *
     *  when you call the source it returns the bufferedsource which is iterator of characters
     */
    val source = Source.fromFile("D:\\Coding\\Scala\\basic\\src\\basics\\matrix.txt")
    val lines = source.getLines()
    val matrix = lines.map(line => line.split(" ").map(_.toDouble)).toArray
    source.close()

    /*
     * Scala uses Java File class/methods
     */
    val pw = new PrintWriter("rowSums.txt")
    matrix.foreach(row => pw.println(row.sum))
    pw.close()
  }
}
