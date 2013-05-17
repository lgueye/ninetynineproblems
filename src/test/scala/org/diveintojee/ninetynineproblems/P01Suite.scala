package org.diveintojee.ninetynineproblems

import org.junit._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P01._

@RunWith(classOf[JUnitRunner])
class P01Suite extends FunSuite {

  test("last should succeed") {
    val actual: Int = last(List(1, 1, 2, 3, 5, 8))
    val expected: Int = 8
    assert(actual === expected)
  }
}
