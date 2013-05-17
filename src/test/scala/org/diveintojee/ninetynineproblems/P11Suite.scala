package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P11._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P11Suite extends FunSuite with ShouldMatchers {

  test("pack should succeed") {
    val actual: List[Any] = encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    assert(actual === expected)
  }

}
