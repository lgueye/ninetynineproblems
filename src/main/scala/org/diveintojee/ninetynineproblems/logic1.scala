package org.diveintojee.ninetynineproblems {

  import scala._

  class S99Logic(a: Boolean) {

    import S99Logic._

    def and(b: Boolean): Boolean =
      (a, b) match {
        case (true, true) => true
        case _            => false
      }

    def or(b: Boolean): Boolean =
      (a, b) match {
        case (true, _) => true
        case (_, true) => true
        case _         => false
      }

    def nor(b: Boolean): Boolean =
      not(a or b)

    def equ(b: Boolean): Boolean =
      (a and b) or (not(a) and not(b))

    def xor(b: Boolean): Boolean =
      not(a equ b)

    def nand(b: Boolean): Boolean =
      not(a and b)

    def impl(b: Boolean): Boolean =
      not(a) or b

  }

  object S99Logic {

    implicit def boolean2S99Logic(a: Boolean): S99Logic = new S99Logic(a)

    def not(a: Boolean) = a match {
      case true  => false
      case false => true
    }

    def table2(f: (Boolean, Boolean) => Boolean) {
      println("A     B     result")
      for {a <- List(true, false);b <- List(true, false)} println("%-5s %-5s %-5s\n", a, b, f(a, b))
    }

    def gray(n: Int): List[String] = n match {
      case 0  => List("")
      case _  => {
        val previous = gray(n - 1)
        (previous map { "0" + _ }) ::: (previous.reverse map { "1" + _ })
      }
    }

  }

}