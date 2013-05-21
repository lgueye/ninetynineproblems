package org.diveintojee.ninetynineproblems

object P15 extends App {

  def duplicateN[A] (n:Int, list: List[A]): List[A] = list flatMap { x => for (index <- 0 to n-1) yield x }

}
