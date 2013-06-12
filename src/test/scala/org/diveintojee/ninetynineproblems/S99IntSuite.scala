package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.S99Int._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class S99IntSuite extends FunSuite with ShouldMatchers {

  test("isPrime should succeed") {
    val actual = 7.isPrime
    val expected = true
    assert(actual === expected)
  }

  test("gcd should succeed") {
    val actual = gcd(36,63)
    val expected = 9
    assert(actual === expected)
  }

  test("isCoprimeTo should succeed") {
    val actual = 35.isCoprimeTo(64)
    val expected = true
    assert(actual === expected)
  }

  test("totient should succeed") {
    val actual = 10.totient
    val expected = 4
    assert(actual === expected)
  }

  test("primeFactors should succeed") {
    val actual = 315.primeFactors
    val expected = List(3, 3, 5, 7)
    assert(actual === expected)
  }

  test("primeFactorMultiplicity should succeed") {
    val actual = 315.primeFactorMultiplicity
    val expected = List((3, 2), (5, 1), (7, 1))
    assert(actual === expected)
  }

  test("primeFactorMultiplicityAsMap should succeed") {
    val actual = 315.primeFactorMultiplicityAsMap
    val expected = Map(3 -> 2, 5 -> 1, 7 -> 1)
    assert(actual === expected)
  }

  test("improved totient should succeed") {
    val actual = 10.improvedTotient
    val expected = 4
    assert(actual === expected)
  }

  test("listPrimesinRange should succeed") {
    val actual = listPrimesinRange(7 to 31)
    val expected = List(7, 11, 13, 17, 19, 23, 29, 31)
    assert(actual === expected)
  }

  test("goldbach should succeed") {
    val actual = 28.goldbach
    val expected = (5,23)
    assert(actual === expected)
  }

  test("goldbach list should succeed") {
    val actual = goldbachList(9 to 20)
    val expected = List((3, 7), (5, 7), (3, 11), (3, 13), (5, 13), (3, 17))
    assert(actual === expected)
  }

}
