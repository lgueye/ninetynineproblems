package org.diveintojee.ninetynineproblems

object P09 extends App {

  def pack[A] (list: List[A]): List[List[A]] =
    list.reverse.foldLeft(List[List[A]]()) {
      case (head :: tail, x) if (x == head.head) => (x :: head) :: tail
      case (acc, x)                              => List(x) :: acc
    }



}
