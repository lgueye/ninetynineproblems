package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.Tree._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class S99TreeSuite extends FunSuite with ShouldMatchers {

  test("cBalanced should succeed") {
    val actual = cBalanced(4, "x")
    val expected = List(("a","0"), ("b", "101"), ("c","100"), ("d","111"), ("e","1101"), ("f","1100"))
    assert(actual === expected)
  }

}
