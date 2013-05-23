package org.diveintojee.ninetynineproblems

import P23.randomSelect

object P24 extends App {

  def lotto(count: Int, max: Int): List[Int] =
    randomSelect(count, List.range(1, max + 1))

}
