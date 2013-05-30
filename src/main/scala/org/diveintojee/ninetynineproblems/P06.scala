package org.diveintojee.ninetynineproblems

import P05.reverse

object P06 extends App {

  def isPalindrome[A] (list: List[A]): Boolean =
    (reverse(list) == list)

}
