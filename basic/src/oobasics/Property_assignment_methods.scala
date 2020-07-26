package oobasics

class Property_assignment_methods (private var _x:Double, private var _y:Double){


  def setX(newX: Double): Unit = _x = newX
  def setY(newY: Double): Unit = _y = newY

  /*
   *  so to set the value of _x and _y we can also have a method other than setX and set Y
   *
   *  with this method we can write the v1.x = 10 instead of v1.setX(10)
   */
  def x_=(newX: Double): Unit = _x = newX
  def y_=(newY: Double): Unit = _y = newY

  //  def plus(mv:Property_assignment_methods): Property_assignment_methods={
//    _x += mv.x
//    _y += mv.y
//    this
//  }
//
//  def +=(mv:Property_assignment_methods): Property_assignment_methods={
//    _x += mv.x
//    _y += mv.y
//    this
//  }
//
//  def +(mv:Property_assignment_methods): Property_assignment_methods={
//    _x += mv.x
//    _y += mv.y
//    this
//  }
//
//  def minus(mv:Property_assignment_methods): Property_assignment_methods={
//    _x -= mv.x
//    _y -= mv.y
//    this
//  }
//
//  def -=(mv:Property_assignment_methods): Property_assignment_methods={
//    _x -= mv.x
//    _y -= mv.y
//    this
//  }
//
//  def -(mv:Property_assignment_methods): Property_assignment_methods={
//    _x -= mv.x
//    _y -= mv.y
//    this
//  }


}



