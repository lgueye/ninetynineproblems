package org.diveintojee.ninetynineproblems

object P03 extends App {

  def nth[A] (index: Int, list: List[A]): A =
    index match {
      case idx if (idx < 0)             => throw new IllegalArgumentException
      case idx if (idx > list.size -1)  => throw new IndexOutOfBoundsException
      case idx if (idx == 0)            => list.head
      case _                            => nth(index -1, list.tail)
    }


}
