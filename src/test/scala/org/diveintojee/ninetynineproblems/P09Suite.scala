package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P09._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P09Suite extends FunSuite with ShouldMatchers {

  test("pack should succeed") {
    val actual: List[Any] = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected: List[Any] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    assert(actual === expected)
  }

}
