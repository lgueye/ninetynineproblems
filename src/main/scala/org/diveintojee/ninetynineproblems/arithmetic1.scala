package org.diveintojee.ninetynineproblems {

  class S99Int(val start: Int) {

    def isPrime: Boolean =
      divisors.size == 2

    def divisors: List[Int] =
      for (index <- List.range(1, start + 1) if start % index == 0) yield index

  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    def gcd(x: Int, y: Int): Int =
      y match {
        case 0 => x
        case _ => gcd(y, x % y)
      }

  }
}
