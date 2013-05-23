package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P23._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P23Suite extends FunSuite with ShouldMatchers {

  test("randomSelect should succeed") {
    val n: Int = 3
    val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
    val actual: List[Any] = randomSelect(n, list)
    assert(actual.size === n)
    if (actual.size > 0) assert(actual.forall(x => list.contains(x)))
  }

}
