package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P03._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P03Suite extends FunSuite with ShouldMatchers {

  test("nth should produce IndexOutOfBoundsException with out of bounds index") {
    evaluating { nth(0, List()) } should produce [IndexOutOfBoundsException]
    evaluating { nth(2, List(1, 2)) } should produce [IndexOutOfBoundsException]
  }

  test("nth should produce IllegalArgumentException with negative index") {
    evaluating { nth(-1, List(1, 2)) } should produce [IllegalArgumentException]
  }

  test("nth should succeed") {
    val actual: Int = nth(2, List(1, 2, 3, 5, 8))
    val expected: Int = 3
    assert(actual === expected)
  }

}
