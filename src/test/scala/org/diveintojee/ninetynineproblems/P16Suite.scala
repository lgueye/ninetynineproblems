package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P16._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P16Suite extends FunSuite with ShouldMatchers {

  test("drop should succeed") {
    val actual: List[Symbol] = drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    assert(actual === expected)
  }

}
