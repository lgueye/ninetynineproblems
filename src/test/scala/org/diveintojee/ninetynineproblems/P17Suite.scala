package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P17._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P17Suite extends FunSuite with ShouldMatchers {

  test("split should succeed") {
    val actual: (List[Any], List[Any]) = split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected: (List[Any], List[Any]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(actual === expected)
  }

}
