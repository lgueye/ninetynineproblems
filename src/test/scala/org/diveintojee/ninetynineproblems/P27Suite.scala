package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.P27._
import org.scalatest.matchers.ShouldMatchers
import scala.io.Source

@RunWith(classOf[JUnitRunner])
class P27Suite extends FunSuite with ShouldMatchers {

  def loadExpected(s: String): List[List[List[String]]] = {
    //val lines: List[String]  = io.Source.fromInputStream(getClass.getResourceAsStream(s)).getLines().toList
    val lines: List[String]  = Source.fromURL(getClass.getResource(s)).getLines().toList
    val tmp: List[List[String]] = lines map { _.split("|").toList }
    println(tmp)
    Nil
  }

  test("group should succeed") {
    val expected = loadExpected("/expected-group.txt")
    println(expected)
//    val actual = group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
//    assert(actual === expected)
  }

  test("group3 should succeed") {
    val expected = loadExpected("/expected-group3.txt")
    println(expected)
//    val actual = group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary","Hugo", "Ida"))
//    assert(actual === expected)
  }

}
