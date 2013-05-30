package org.diveintojee.ninetynineproblems

object P21 extends App {

  def insertAt[A] (elem:A, index: Int, list: List[A]): List[A] =
    index match {
      case idx if ((idx < 0 || idx > list.size -1)) => throw new IndexOutOfBoundsException
      case _                                        => {
        val split: (List[A], List[A]) = list.splitAt(index)
        split._1 ::: (elem ::split._2)
      }
    }

}
