package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P02._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P02Suite extends FunSuite with ShouldMatchers {

  test("penultimate should succeed") {
    val actual: Int = penultimate(List(1, 2, 3, 5, 8))
    val expected: Int = 5
    assert(actual === expected)
  }

  test("penultimate should produce NoSuchElementException with invalid input") {
    evaluating { penultimate(Nil) } should produce [NoSuchElementException]
    evaluating { penultimate(List(2)) } should produce [NoSuchElementException]
  }

}
