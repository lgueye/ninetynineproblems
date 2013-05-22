package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P19._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P19Suite extends FunSuite with ShouldMatchers {

  test("rotate positive should succeed") {
    val actual: List[Any] = rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected: List[Any] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    assert(actual === expected)
  }

  test("rotate negative should succeed") {
    val actual: List[Any] = rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected: List[Any] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    assert(actual === expected)
  }

}
