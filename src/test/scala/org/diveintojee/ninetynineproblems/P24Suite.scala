package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P24._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P24Suite extends FunSuite with ShouldMatchers {

  test("lotto should succeed") {
    val count: Int = 6
    val max: Int = 49
    val actual: List[Int] = lotto(count, max)
    assert(actual.size === count)
  }

}
