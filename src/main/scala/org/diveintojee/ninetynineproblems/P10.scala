package org.diveintojee.ninetynineproblems

import P09.pack

object P10 extends App {

  def encode (list: List[Symbol]): List[(Int, Any)] = pack(list).map(x => (x.size, x.head))

}
