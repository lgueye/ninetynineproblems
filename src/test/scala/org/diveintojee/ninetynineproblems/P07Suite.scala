package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P07._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P07Suite extends FunSuite with ShouldMatchers {

  test("flatten should succeed") {
    val actual: List[Any] = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    val expected: List[Int] = List(1, 1, 2, 3, 5, 8)
    assert(actual === expected)
  }

  test("flatten should succeed with empty lists") {
    val actual: List[Any] = flatten(List( List(), List(), List()))
    val expected: List[Int] = List()
    assert(actual === expected)
  }

}
