package org.diveintojee.ninetynineproblems

object P18 extends App {

  def slice[A] (include: Int, exclude: Int, list: List[A]): List[A] =
    sliceR(include, exclude, list, Nil, 0)

  def sliceR[A](include: Int, exclude: Int, remainingList: List[A], acc:List[A], index:Int): List[A] =
    (include, exclude, remainingList, index) match {
      case (incl, excl, l, idx) if (incl > excl)                => throw new IllegalArgumentException
      case (incl, excl, l, idx) if (l.isEmpty || idx == excl)  => acc.reverse
      case (incl, excl, l, idx) if (idx >= incl)                => sliceR(incl, excl, l.tail, l.head::acc, idx + 1)
      case _                                                    => sliceR(include, exclude, remainingList.tail, acc, index + 1)
    }

}
