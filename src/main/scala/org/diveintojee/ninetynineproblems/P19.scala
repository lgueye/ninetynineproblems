package org.diveintojee.ninetynineproblems

object P19 extends App {

  def rotate[A] (steps: Int, list: List[A]): List[A] =
    if (steps == 0)
      return list
    else if (steps < 0) rotate(steps + 1, List(list.last) ::: list.take(list.size -1) )
    else rotate(steps - 1, list.tail ::: List(list.head))

}
