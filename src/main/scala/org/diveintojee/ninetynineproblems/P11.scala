package org.diveintojee.ninetynineproblems

import P09.pack

object P11 extends App {

  def encode[A] (list: List[A]): List[(Int, A)] = pack(list).map(x => (x.size, x.head))

}
