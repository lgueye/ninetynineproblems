package org.diveintojee.ninetynineproblems

object P22 extends App {

  def rangeR(low: Int, up: Int, acc: List[Int]): List[Int] = {
    if (low > up) throw new IllegalArgumentException
    else if (low == up) return (low :: acc).reverse
    return rangeR(low + 1, up, low :: acc)
  }

  def range(low: Int, up: Int): List[Int] = rangeR(low, up, Nil)

}
