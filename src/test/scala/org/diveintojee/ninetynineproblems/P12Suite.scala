package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P12._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P12Suite extends FunSuite with ShouldMatchers {

  test("decode should succeed") {
    val actual: List[Any] = decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    val expected: List[Any] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(actual === expected)
  }

}
