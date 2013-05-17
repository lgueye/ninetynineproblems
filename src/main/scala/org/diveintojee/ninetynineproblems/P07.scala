package org.diveintojee.ninetynineproblems

object P07 extends App {

  def flatten (list: List[Any]): List[Any] = list flatMap {
    case nested: List[_] => flatten(nested)
    case element => List(element)
  }

}
