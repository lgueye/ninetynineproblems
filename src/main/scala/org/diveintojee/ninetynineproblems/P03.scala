package org.diveintojee.ninetynineproblems

object P03 extends App {

  def nth[A] (index: Int, list: List[A]): A =
    if (index <= 0) list.head else nth(index -1, list.tail)

}
