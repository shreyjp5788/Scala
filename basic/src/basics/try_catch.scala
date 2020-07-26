package basics

object try_catch {
  def main(args:Array[String]): Unit = {
    val str = "123a"

    val num = try{
      str.toInt
    } catch { //  <--syntax braces with the case inside of it creates what are called partial functions in scala
      case ex: NumberFormatException => "Not a valid integer"  // <-- this is only to catch the number format exception
    }

    println(num)
  }
}
