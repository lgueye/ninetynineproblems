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

}
