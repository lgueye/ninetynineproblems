package org.diveintojee.ninetynineproblems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import org.diveintojee.ninetynineproblems.S99Logic._
import org.scalatest.matchers.ShouldMatchers

/**
 * Truth table tests are based on material from <a href="http://en.wikipedia.org/wiki/Truth_table">Wikipedia truth tables</a>
 */
@RunWith(classOf[JUnitRunner])
class S99LogicSuite extends FunSuite with ShouldMatchers {

  test("and(true, true) should succeed") {
    val actual = true.and(true)
    val expected = true
    assert(actual === expected)
  }

  test("and(true, false) should succeed") {
    val actual = true.and(false)
    val expected = false
    assert(actual === expected)
  }

  test("and(false, true) should succeed") {
    val actual = false.and(true)
    val expected = false
    assert(actual === expected)
  }

  test("and(false, false) should succeed") {
    val actual = false.and(false)
    val expected = false
    assert(actual === expected)
  }

  test("or(true, true) should succeed") {
    val actual = true.or(true)
    val expected = true
    assert(actual === expected)
  }

  test("or(true, false) should succeed") {
    val actual = true.or(false)
    val expected = true
    assert(actual === expected)
  }

  test("or(false, true) should succeed") {
    val actual = false.or(true)
    val expected = true
    assert(actual === expected)
  }

  test("or(false, false) should succeed") {
    val actual = false.or(false)
    val expected = false
    assert(actual === expected)
  }

  test("nand(true, true) should succeed") {
    val actual = true.nand(true)
    val expected = false
    assert(actual === expected)
  }

  test("nand(true, false) should succeed") {
    val actual = true.nand(false)
    val expected = true
    assert(actual === expected)
  }

  test("nand(false, true) should succeed") {
    val actual = false.nand(true)
    val expected = true
    assert(actual === expected)
  }

  test("nand(false, false) should succeed") {
    val actual = false.nand(false)
    val expected = true
    assert(actual === expected)
  }

  test("nor(true, true) should succeed") {
    val actual = true.nor(true)
    val expected = false
    assert(actual === expected)
  }

  test("nor(true, false) should succeed") {
    val actual = true.nor(false)
    val expected = false
    assert(actual === expected)
    }

  test("nor(false, true) should succeed") {
    val actual = false.nor(true)
    val expected = false
    assert(actual === expected)
  }

  test("nor(false, false) should succeed") {
    val actual = false.nor(false)
    val expected = true
    assert(actual === expected)
  }

  test("xor(true, true) should succeed") {
    val actual = true.xor(true)
    val expected = false
    assert(actual === expected)
  }

  test("xor(true, false) should succeed") {
    val actual = true.xor(false)
    val expected = true
    assert(actual === expected)
  }

  test("xor(false, true) should succeed") {
    val actual = false.xor(true)
    val expected = true
    assert(actual === expected)
  }

  test("xor(false, false) should succeed") {
    val actual = false.xor(false)
    val expected = false
    assert(actual === expected)
  }

  test("impl(true, true) should succeed") {
    val actual = true.impl(true)
    val expected = true
    assert(actual === expected)
  }

  test("impl(true, false) should succeed") {
    val actual = true.impl(false)
    val expected = false
    assert(actual === expected)
  }

  test("impl(false, true) should succeed") {
    val actual = false.impl(true)
    val expected = true
    assert(actual === expected)
  }

  test("impl(false, false) should succeed") {
    val actual = false.impl(false)
    val expected = true
    assert(actual === expected)
  }

  test("equ(true, true) should succeed") {
    val actual = true.equ(true)
    val expected = true
    assert(actual === expected)
  }

  test("equ(true, false) should succeed") {
    val actual = true.equ(false)
    val expected = false
    assert(actual === expected)
  }

  test("equ(false, true) should succeed") {
    val actual = false.equ(true)
    val expected = false
    assert(actual === expected)
  }

  test("equ(false, false) should succeed") {
    val actual = false.equ(false)
    val expected = true
    assert(actual === expected)
  }

  test("gray should succeed") {
    val n = 3
    val actual = gray(n)
    val expected = List("000", "001", "011", "010", "110", "111", "101", "100")
    assert(expected.size === Math.pow(2, n))
    assert(actual === expected)
  }

}
