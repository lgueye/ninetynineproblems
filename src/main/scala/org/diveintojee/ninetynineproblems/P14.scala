package org.diveintojee.ninetynineproblems

object P14 extends App {

  def duplicate[A] (list: List[A]): List[A] = list flatMap { x => List(x, x)}

}
