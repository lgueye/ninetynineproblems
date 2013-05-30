package org.diveintojee.ninetynineproblems

import java.util.NoSuchElementException

object P01 extends App {

  def last[A] (list: List[A]): A =
    list match {
      case head :: Nil  => head
      case head :: tail => last(tail)
      case Nil          => throw new NoSuchElementException
    }

}
