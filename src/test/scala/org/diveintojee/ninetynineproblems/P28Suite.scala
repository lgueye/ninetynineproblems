package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P28._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P28Suite extends FunSuite with ShouldMatchers {

  test("lsort should succeed") {
    val expected = List(List('o), List('d, 'e), List('d, 'e),
                        List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
    val actual = lsort(List(List('a, 'b, 'c), List('d, 'e),
                            List('f, 'g, 'h), List('d, 'e),
                            List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    assert(actual === expected)
  }

  test("lsortFreq should succeed") {
    val actual = lsortFreq(List(List('a, 'b, 'c),
                                List('d, 'e), List('f, 'g, 'h), List('d, 'e),
                                List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    val expected = List(List('i, 'j, 'k, 'l), List('o),
                        List('a, 'b, 'c), List('f, 'g, 'h),
                        List('d, 'e), List('d, 'e), List('m, 'n))
    assert(actual === expected)
  }

}
