package org.diveintojee.ninetynineproblems

import P26.combinations

object P27 extends App {

  def group2[A](list: List[A]): List[List[List[A]]] =
    for {
      firstCombination <- combinations(1, list)
      exceptFirst = list diff firstCombination
    } yield List(firstCombination, exceptFirst)

  def group3[A](list: List[A]): List[List[List[A]]] =
    for {
      firstCombination <- combinations(2, list)
      exceptFirst = list diff firstCombination
      secondCombination <- combinations(3, exceptFirst)
      exceptSecond = exceptFirst diff secondCombination
    } yield List(firstCombination, exceptFirst, exceptSecond)

  def group[A](distribution: List[Int], list: List[A]): List[List[List[A]]] =
    distribution match {
      case Nil          => List(Nil)
      case head :: tail =>
        combinations(head, list) flatMap {
          combination => group(tail, list diff combination) map { combination :: _}
        }
    }

}
