package org.diveintojee.ninetynineproblems

object P13 extends App {

  def encodeDirect[A] (list: List[A]): List[(Int, A)] = list match {
    case Nil          => Nil
    case head :: tail => {
      val (group, remaining) = list span { _ == list.head }
      (group.length, group.head) :: encodeDirect(remaining)
    }
  }

}
