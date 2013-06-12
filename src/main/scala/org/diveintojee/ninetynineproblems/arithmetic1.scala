package org.diveintojee.ninetynineproblems {

import scala._

class S99Int(val start: Int) {

    import S99Int._
    import P10.encode

    private def divisors: List[Int] =
      for (index <- List.range(1, start + 1) if start % index == 0) yield index

    def isPrime: Boolean =
    divisors.size == 2

    def isCoprimeTo(n: Int): Boolean =
      gcd(start, n) == 1

    def totient: Int =
      (List.range(1, start + 1) filter { isCoprimeTo(_) }). size

    def improvedTotient: Int = {
      println(primeFactorMultiplicity)
      improvedTotientR(primeFactorMultiplicity, 1)
    }

    def improvedTotientR(list: List[(Int, Int)], acc: Int): Int =
      list match {
        case Nil          => acc
        case head :: tail => improvedTotientR(tail, (head._1 - 1) * Math.pow(head._1, head._2 - 1).toInt * acc)
      }

    def primeFactors: List[Int] = {
      val primes = (for (i <- 1 to start + 1 if (i.isPrime)) yield i).toList
      primeFactorsR(start, primes, Nil)
    }

    private def primeFactorsR(n: Int, primes: List[Int], acc: List[Int]): List[Int] =
      (n, primes) match {
        case (x, y) if (x == 0 || y.isEmpty)      => acc.reverse
        case (_, head :: tail) if (n % head == 0) => primeFactorsR (n / head, head :: tail, head :: acc)
        case (_, head :: tail)                    => primeFactorsR (n, tail, acc)
      }

    def primeFactorMultiplicity: List[(Int, Int)] =
      encode(primeFactors) map { _.swap}

    def primeFactorMultiplicityAsMap: Map[Int, Int] =
      Map(primeFactorMultiplicity: _*)

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
