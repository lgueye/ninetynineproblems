package org.diveintojee.ninetynineproblems

object P04 extends App {

  def lgth[A] (list: List[A]): Int = lgthR(list, 0)
  def lgthR[A] (list: List[A], acc: Int): Int = list match {
    case Nil => acc
    case _ :: tail => lgthR(tail, acc + 1)
  }

}
