package basics

object if_while {
  def main(args:Array[String]): Unit = {
    var i = 0

//    while(i < 10){
//      println(i)
//      i += 1
//    }

    /*
     *  this the normal way of writing the if condition in other languages
     */
    var age = 16
//    if (age < 18){
//      println("No admittance.")
//    }else{
//      println("Come on in.")
//    }


    /*
     *  Scala way of writing the if condition.
     *
     *  in scala event he if is expression
     *
     *  so here the response is the value.
     *
     *  so in scala use this as much as you can as it gives you the value.
     */
//    val response = if (age < 18){
//      "No admittance."
//    }else{
//      "Come on in."
//    }
//    println(response)

    /*
     *  so there is another way of writing the same code like this
     */
    println(if (age < 18) "No admittance" else "Come on in")

  }
}
