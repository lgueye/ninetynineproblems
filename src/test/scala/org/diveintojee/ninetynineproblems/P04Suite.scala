package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P04._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P04Suite extends FunSuite with ShouldMatchers {

  test("lgth should succeed") {
    val actual: Int = lgth(List(1, 2, 3, 5, 8))
    val expected: Int = 5
    assert(actual === expected)
  }

}
