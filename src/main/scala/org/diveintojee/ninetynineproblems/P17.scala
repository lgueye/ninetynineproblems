package org.diveintojee.ninetynineproblems

object P17 extends App {

  def listR[A](elementsToBeTaken: Int, remainingList: List[A], acc:List[A]): (List[A], List[A]) = {
    if (elementsToBeTaken == 0 || remainingList.isEmpty) (acc.reverse, remainingList)
    else listR(elementsToBeTaken -1, remainingList.tail, remainingList.head::acc)
  }

  def split[A] (n:Int, list: List[A]): (List[A], List[A]) = listR(n, list, Nil)

}
