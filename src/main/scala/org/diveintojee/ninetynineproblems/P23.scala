package org.diveintojee.ninetynineproblems

import scala.util.Random

import P20.removeAt

object P23 extends App {

  def randomSelect[A](n: Int, list: List[A]): List[A] =
    randomSelectR(n, list, Nil)

  private def randomSelectR[A](n: Int, list: List[A], acc: List[A]): List[A] =
    n match {
      case 0 => acc
      case _ => val removed = removeAt(Random.nextInt(list.size), list)
        randomSelectR(n-1, removed._1, removed._2 :: acc)
    }

}
