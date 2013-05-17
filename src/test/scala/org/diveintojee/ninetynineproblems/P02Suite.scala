package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P02._

@RunWith(classOf[JUnitRunner])
class P02Suite extends FunSuite {

  test("penultimate should succeed") {
    val actual: Int = penultimate(List(1, 2, 3, 5, 8))
    val expected: Int = 5
    assert(actual === expected)
  }
}
