package org.diveintojee.ninetynineproblems

object P22 extends App {

  def range(low: Int, up: Int): List[Int] = rangeR(low, up, Nil)

  private def rangeR(low: Int, up: Int, acc: List[Int]): List[Int] =
    (low, up) match {
      case (low, up) if (low > up)  => throw new IllegalArgumentException
      case (low, up) if (low == up) => (low :: acc).reverse
      case _                        => rangeR(low + 1, up, low :: acc)
  }

}
