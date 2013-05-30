package org.diveintojee.ninetynineproblems

object P19 extends App {

  def rotate[A] (steps: Int, list: List[A]): List[A] =
    steps match {
      case 0            => list
      case n if (n < 0) => rotate(n + 1, List(list.last) ::: list.take(list.size -1) )
      case _            => rotate(steps - 1, list.tail ::: List(list.head))
    }

}
