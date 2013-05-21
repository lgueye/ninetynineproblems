package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P13._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P13Suite extends FunSuite with ShouldMatchers {

  test("encodeDirect should succeed") {
    val actual: List[(Int, Any)] = encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected: List[(Int, Any)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    assert(actual === expected)
  }

}
