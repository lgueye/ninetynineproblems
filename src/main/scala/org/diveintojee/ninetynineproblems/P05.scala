package org.diveintojee.ninetynineproblems

object P05 extends App {

  def reverse[A] (list: List[A]): List[A] =
    reverseR(list, Nil)

  private def reverseR[A] (list: List[A], acc: List[A]): List[A] =
    list match {
      case Nil => acc
      case head :: tail => reverseR(tail, head +: acc)
    }

}
