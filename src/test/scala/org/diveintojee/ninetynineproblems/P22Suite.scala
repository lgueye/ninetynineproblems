package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P22._
import org.scalatest.matchers.ShouldMatchers
import java.lang.IllegalArgumentException

@RunWith(classOf[JUnitRunner])
class P22Suite extends FunSuite with ShouldMatchers {

  test("range should throw IllegalArgumentException with illegal bounds") {
    evaluating { range(4,3) } should produce [IllegalArgumentException]
  }

  test("range should succeed") {
    val actual: List[Any] = range(4, 9)
    val expected: List[Any] = List(4, 5, 6, 7, 8, 9)
    assert(actual === expected)
  }

}
