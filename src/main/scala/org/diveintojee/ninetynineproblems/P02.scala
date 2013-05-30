package org.diveintojee.ninetynineproblems

import java.util.NoSuchElementException

object P02 extends App {

  def penultimate[A] (list: List[A]): A =
    list match {
      case head :: _ :: Nil => head
      case head :: tail     => penultimate(tail)
      case _                => throw new NoSuchElementException
    }

}
