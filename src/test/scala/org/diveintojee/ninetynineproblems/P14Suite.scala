package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P14._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P14Suite extends FunSuite with ShouldMatchers {

  test("duplicate should succeed") {
    val actual: List[Symbol] = duplicate(List('a, 'b, 'c, 'c, 'd))
    val expected: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    assert(actual === expected)
  }

}
