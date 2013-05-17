package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P06._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P06Suite extends FunSuite with ShouldMatchers {

  test("isPalindrome should return true") {
    val actual: Boolean = isPalindrome(List(1, 2, 3, 2, 1))
    val expected: Boolean = true
    assert(actual === expected)
  }

  test("isPalindrome should return false") {
    val actual: Boolean = isPalindrome(List(1, 2, 3, 5, 8))
    val expected: Boolean = false
    assert(actual === expected)
  }

}
