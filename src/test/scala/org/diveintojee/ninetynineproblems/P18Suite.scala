package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P18._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P18Suite extends FunSuite with ShouldMatchers {

  test("slice should succeed") {
    val actual: List[Any] = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected: List[Any] = List('d, 'e, 'f, 'g)
    assert(actual === expected)
  }

}
