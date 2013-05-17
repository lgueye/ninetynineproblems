package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P03._

@RunWith(classOf[JUnitRunner])
class P03Suite extends FunSuite {

  test("nth should succeed") {
    val actual: Int = nth(2, List(1, 2, 3, 5, 8))
    val expected: Int = 3
    assert(actual === expected)
  }
}
