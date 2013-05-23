package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P21._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P22Suite extends FunSuite with ShouldMatchers {

  test("insertAt should throw IndexOutOfBoundException with illegal bounds") {
    evaluating { insertAt('new, -1, List('a, 'b)) } should produce [IndexOutOfBoundsException]
    evaluating { insertAt('new, 2, List('a, 'b)) } should produce [IndexOutOfBoundsException]
  }

  test("insertAt should succeed") {
    val actual: List[Any] = insertAt('new, 1, List('a, 'b, 'c, 'd))
    val expected: List[Any] = List('a, 'new, 'b, 'c, 'd)
    assert(actual === expected)
  }

}
