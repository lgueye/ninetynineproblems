package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P15._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P15Suite extends FunSuite with ShouldMatchers {

  test("duplicate should succeed") {
    val actual: List[Symbol] = duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    val expected: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    assert(actual === expected)
  }

}
