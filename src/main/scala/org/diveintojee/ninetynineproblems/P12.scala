package org.diveintojee.ninetynineproblems

object P12 extends App {

  def decode[A] (list: List[(Int, A)]): List[A] =
    list flatMap {pair => for (index <- 0 to pair._1 -1) yield pair._2}

}
