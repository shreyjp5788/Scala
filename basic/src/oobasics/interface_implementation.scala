package oobasics

/*
 *  Separation of Interface and Implementation
 *
 *  the important aspects of object orientation is encapsulation the ability to take the data, our vals and mix them in
 *  with defs in a way that allows us to create objects that join both of them and so we have the methods that work on
 *  the data.
 *
 *  what does the separation of interface and implementation mean, well the interface is stuff that's public, this is
 *  the stuff that outside code comes to depend upon
 */

class interface_implementation {

  /*
   *  consider that i change the nature of this method, i.e. if i were to delete this method after i've been working
   *  on this program for a while, i would break lot of other code because lot of code would potentially be calling this
   *  method.
   *
   *  if i change anything related to this method i will potentially break the outside code.
   *
   *  so once you have your public interface that you are kind of bound to and it's not like you can never change it,
   *  but changing it becomes more challenging
   *
   *  we want to make certain that our inteface and the details of the implementation are as separate as possible, so that
   *  we can alter the implementation
   */
  def test():Unit = {

  }
}
