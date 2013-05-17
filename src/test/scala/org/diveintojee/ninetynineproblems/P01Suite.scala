package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P01._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P01Suite extends FunSuite with ShouldMatchers {

  test("last should produce NoSuchElementException with empty input") {
    evaluating { last(Nil) } should produce [NoSuchElementException]
  }

  test("last should succeed") {
    val actual: Int = last(List(1, 2, 3, 5, 8))
    val expected: Int = 8
    assert(actual === expected)
  }

}
