package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P27._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class P27Suite extends FunSuite with ShouldMatchers {

  test("group3 should succeed") {
    val expected: List[Any] = List(
      List(List("Aldo"), List("Beat", "Carla")),
      List(List("Beat"), List("Carla", "Aldo")),
      List(List("Carla"), List("Aldo", "Beat"))
    )
    //val actual: List[Any] = group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    val actual: List[Any] = group3(List("Aldo", "Beat", "Carla"))
    assert(actual === expected)
  }

}
