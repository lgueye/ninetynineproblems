package org.diveintojee.ninetynineproblems

object P08 extends App {

  def compress (list: List[Any]): List[Any] =
    list.reverse.foldLeft(List[Any]())((acc, x) => if (acc.isEmpty || acc.head != x) x :: acc else acc)

}
