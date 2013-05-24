package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P25._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P25Suite extends FunSuite with ShouldMatchers {

  test("randomPermute should succeed") {
    val input: List[Any] = List('a, 'b, 'c, 'd, 'e, 'f)
    val actual: List[Any] = randomPermute(input)
    assert(actual.size === input.size)
    if (actual.size > 0) assert(actual.forall(x => input.contains(x)))
  }

}
