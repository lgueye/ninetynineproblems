package org.diveintojee.ninetynineproblems

import P23.randomSelect

object P25 extends App {

  def randomPermute[A](list: List[A]): List[A] =
    randomSelect(list.size, list)

}
