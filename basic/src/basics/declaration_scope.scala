package basics

object declaration_scope {
  def main(args:Array[String]): Unit = {
    val thing = {
      val thing2 = 42
      println("In the block")
      thing2    // <-- here we are returning the value which will be assigned to "thing"
    }
//    println(thing)
  }
}
