package org.diveintojee.ninetynineproblems

object P20 extends App {

  def removeAtR[A](index: Int, list: List[A], acc: List[A]): (List[A], A) =
    if (index < 0 || index > list.size -1) throw new IndexOutOfBoundsException
    else if (index == 0) (list.takeWhile(x => x != acc.head):::list.dropWhile(x => x != acc.head).drop(1), acc.head)
    else removeAtR(index -1, list, acc.tail)

  def removeAt[A] (index: Int, list: List[A]): (List[Any], Any) = removeAtR(index, list, list)

}
