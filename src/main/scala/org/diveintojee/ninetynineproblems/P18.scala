package org.diveintojee.ninetynineproblems

object P18 extends App {

  def sliceR[A](include: Int, exclude: Int, remainingList: List[A], acc:List[A], index:Int): List[A] =
    if (include > exclude)
      throw new IllegalArgumentException
    else if (remainingList.isEmpty || index == exclude)
      return acc.reverse
    else if (index >= include)
      sliceR(include, exclude, remainingList.tail, remainingList.head::acc, index + 1)
    else
      sliceR(include, exclude, remainingList.tail, acc, index + 1)

  def slice[A] (include: Int, exclude: Int, list: List[A]): List[A] =
    sliceR(include, exclude, list, Nil, 0)

}
