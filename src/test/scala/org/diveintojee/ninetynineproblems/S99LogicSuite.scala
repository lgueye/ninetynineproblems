package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.S99Logic._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class S99LogicSuite extends FunSuite with ShouldMatchers {

  test("and(true, true) should succeed") {
    val actual = and(true, true)
    val expected = true
    assert(actual === expected)
  }

  test("and(false, true) should succeed") {
    val actual = and(false, true)
    val expected = false
    assert(actual === expected)
  }

  test("and(true, false) should succeed") {
    val actual = and(true, false)
    val expected = false
    assert(actual === expected)
  }

  test("and(false, false) should succeed") {
    val actual = and(false, false)
    val expected = false
    assert(actual === expected)
  }

  test("or(true, true) should succeed") {
    val actual = or(true, true)
    val expected = true
    assert(actual === expected)
  }

  test("or(false, true) should succeed") {
    val actual = or(false, true)
    val expected = true
    assert(actual === expected)
  }

  test("or(true, false) should succeed") {
    val actual = or(true, false)
    val expected = true
    assert(actual === expected)
  }

  test("or(false, false) should succeed") {
    val actual = or(false, false)
    val expected = false
    assert(actual === expected)
  }

  test("nand(true, true) should succeed") {
    val actual = nand(true, true)
    val expected = false
    assert(actual === expected)
  }

  test("nand(false, true) should succeed") {
    val actual = nand(false, true)
    val expected = true
    assert(actual === expected)
  }

  test("nand(true, false) should succeed") {
    val actual = nand(true, false)
    val expected = true
    assert(actual === expected)
  }

  test("nand(false, false) should succeed") {
    val actual = nand(false, false)
    val expected = true
    assert(actual === expected)
  }

  test("nor(true, true) should succeed") {
    val actual = nor(true, true)
    val expected = false
    assert(actual === expected)
  }

  test("nor(false, true) should succeed") {
    val actual = nor(false, true)
    val expected = false
    assert(actual === expected)
  }

  test("nor(true, false) should succeed") {
    val actual = nor(true, false)
    val expected = false
    assert(actual === expected)
  }

  test("nor(false, false) should succeed") {
    val actual = nor(false, false)
    val expected = true
    assert(actual === expected)
  }

  test("xor(true, true) should succeed") {
    val actual = xor(true, true)
    val expected = false
    assert(actual === expected)
  }

  test("xor(false, true) should succeed") {
    val actual = xor(false, true)
    val expected = true
    assert(actual === expected)
  }

  test("xor(true, false) should succeed") {
    val actual = xor(true, false)
    val expected = true
    assert(actual === expected)
  }

  test("xor(false, false) should succeed") {
    val actual = xor(false, false)
    val expected = false
    assert(actual === expected)
  }

}
