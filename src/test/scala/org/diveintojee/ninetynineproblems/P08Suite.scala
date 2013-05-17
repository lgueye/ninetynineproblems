package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P08._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P08Suite extends FunSuite with ShouldMatchers {

  test("compress should succeed") {
    val actual: List[Any] = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected: List[Any] = List('a, 'b, 'c, 'a, 'd, 'e)
    assert(actual === expected)
  }

}
