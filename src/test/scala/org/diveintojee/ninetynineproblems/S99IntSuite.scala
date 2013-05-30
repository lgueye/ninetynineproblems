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

}
