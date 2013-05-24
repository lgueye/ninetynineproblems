package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P26._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P26Suite extends FunSuite with ShouldMatchers {

  test("C(2, 3) combinations should succeed") {
    val expected: List[Any] = List(List('a, 'b), List('a, 'c), List('b, 'c))
    val actual: List[Any] = combinations(2, List('a, 'b, 'c))
    assert(actual === expected)
  }

  test("C(2, 4) combinations should succeed") {
    val expected: List[Any] = List(List('a, 'b), List('a, 'c), List('a, 'd), List('b, 'c), List('b, 'd), List('c, 'd))
    val actual: List[Any] = combinations(2, List('a, 'b, 'c, 'd))
    assert(actual === expected)
  }

  test("C(3, 4) combinations should succeed") {
    val expected: List[Any] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'c, 'd), List('b, 'c, 'd))
    val actual: List[Any] = combinations(3, List('a, 'b, 'c, 'd))
    assert(actual === expected)
  }

}
