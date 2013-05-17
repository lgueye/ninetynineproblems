package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P05._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P05Suite extends FunSuite with ShouldMatchers {

  test("reverse should succeed") {
    val actual: List[Int] = reverse(List(1, 2, 3, 5, 8))
    val expected: List[Int] = List(8, 5, 3, 2, 1)
    assert(actual === expected)
  }

}
