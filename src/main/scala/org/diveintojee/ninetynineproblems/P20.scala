package org.diveintojee.ninetynineproblems

object P20 extends App {

  def removeAt[A] (index: Int, list: List[A]): (List[A], A) =
    removeAtR(index, list, list)

  private def removeAtR[A](index: Int, list: List[A], acc: List[A]): (List[A], A) =
    index match {
      case idx if (idx < 0 || idx > list.size -1) => throw new IndexOutOfBoundsException
      case 0                                      => (list.takeWhile(x => x != acc.head):::list.dropWhile(x => x != acc.head).drop(1), acc.head)
      case _                                      => removeAtR(index -1, list, acc.tail)
    }

}
