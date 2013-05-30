package org.diveintojee.ninetynineproblems

object P26 extends App {

  def combinations[A](subListSize: Int, list: List[A]): List[List[A]] =
    (list, subListSize) match {
      case (_, 0)                   => List(Nil)
      case (l, n) if l.length == n  => List(l)
      case (head :: tail, n)        => combinations(n - 1, tail).map(head :: _) ++ combinations(n, tail)
    }

}
