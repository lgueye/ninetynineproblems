package org.diveintojee.ninetynineproblems

import P26.combinations

object P27 extends App {

  def group3[A](list: List[A]): List[List[List[A]]] = for {
    a <- combinations(2, list)
    exceptA = list.filter(x => x != a)
    b <- combinations(2, exceptA)
  } yield List(a, b, exceptA.filter(y => y != b))

}
