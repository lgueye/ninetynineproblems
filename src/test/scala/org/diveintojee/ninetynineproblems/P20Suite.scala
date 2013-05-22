package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P20._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P20Suite extends FunSuite with ShouldMatchers {

  test("removeAt should throw IndexOutOfBoundException with illegal bounds") {
    evaluating { removeAt(-1, List('a, 'b)) } should produce [IndexOutOfBoundsException]
    evaluating { removeAt(2, List('a, 'b)) } should produce [IndexOutOfBoundsException]
  }

  test("removeAt should succeed") {
    val actual: (List[Any], Any) = removeAt(1, List('a, 'b, 'c, 'd))
    val expected: (List[Any], Any) = (List('a, 'c, 'd),'b)
    assert(actual === expected)
  }

}
