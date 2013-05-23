package org.diveintojee.ninetynineproblems

import P23.randomSelect

object P24 extends App {

  def lotto(resultListSize: Int, intSetSize: Int): List[Int] =
    randomSelect(resultListSize, (for (i <- 1 to intSetSize) yield i).toList)

}
