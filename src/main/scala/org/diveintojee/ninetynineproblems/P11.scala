package org.diveintojee.ninetynineproblems

import P09.pack

object P11 extends App {

  def encodeModified[A] (list: List[A]): List[Any] =
    pack(list) map {x => if (x.size == 1 ) x.head else (x.size, x.head)}

}
