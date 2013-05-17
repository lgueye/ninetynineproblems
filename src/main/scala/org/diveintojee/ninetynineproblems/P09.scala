package org.diveintojee.ninetynineproblems

object P09 extends App {

  def pack (list: List[Any]): List[List[Any]] =
    list.reverse.foldLeft(List[List[Any]]()) {
      case (head :: tail, x) if (x == head.head) => (x :: head) :: tail
      case (acc, x)                              => List(x) :: acc
    }



}
