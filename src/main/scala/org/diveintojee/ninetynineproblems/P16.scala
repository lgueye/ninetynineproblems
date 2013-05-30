package org.diveintojee.ninetynineproblems

object P16 extends App {

  def drop[A] (n:Int, list: List[A]): List[A] =
    (list grouped(3)).toList flatMap( _.take(2))

}
