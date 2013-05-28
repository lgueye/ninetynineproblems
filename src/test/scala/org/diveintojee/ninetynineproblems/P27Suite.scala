package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P27._
import org.scalatest.matchers.ShouldMatchers
import scala.io.Source

@RunWith(classOf[JUnitRunner])
class P27Suite extends FunSuite with ShouldMatchers {

  test("group (3,1) should succeed") {
    val expected = List(
      List(List("Aldo", "Beat", "Carla"), List("David")),
      List(List("Aldo", "Beat", "David"), List("Carla")),
      List(List("Aldo", "Carla", "David"), List("Beat")),
      List(List("Beat", "Carla", "David"), List("Aldo"))
    )
    val actual = group(List(3, 1), List("Aldo", "Beat", "Carla", "David"))
    assert(actual === expected)
  }

  test("group (2,2) should succeed") {
    val expected = List(
      List(List("Aldo", "Beat"), List("Carla", "David")),
      List(List("Aldo", "Carla"), List("Beat", "David")),
      List(List("Aldo", "David"), List("Beat", "Carla")),
      List(List("Beat", "Carla"), List("Aldo", "David")),
      List(List("Beat", "David"), List("Aldo", "Carla")),
      List(List("Carla", "David"), List("Aldo", "Beat"))
    )
    val actual = group(List(2, 2), List("Aldo", "Beat", "Carla", "David"))
    assert(actual === expected)
  }

  test("group (1,3) should succeed") {
    val expected = List(
      List(List("Aldo"), List("Beat", "Carla", "David")),
      List(List("Beat"), List("Aldo", "Carla", "David")),
      List(List("Carla"), List("Aldo", "Beat", "David")),
      List(List("David"), List("Aldo", "Beat", "Carla"))
    )
    val actual = group(List(1, 3), List("Aldo", "Beat", "Carla", "David"))
    assert(actual === expected)
  }

  test("group2 should succeed") {
    val expected = group(List(1, 3), List("Aldo", "Beat", "Carla", "David"))
    val actual = group2(List("Aldo", "Beat", "Carla", "David"))
    assert(actual === expected)
  }

}
