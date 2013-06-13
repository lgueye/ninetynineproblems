package org.diveintojee.ninetynineproblems {

  import scala._

  object S99Logic {

    def and(a: Boolean, b: Boolean) =
      (a, b) match {
        case (true, true) => true
        case _            => false
      }

    def or(a: Boolean, b: Boolean) =
    (a, b) match {
      case (true, _) => true
      case (_, true) => true
      case _            => false
    }

    def nand(a: Boolean, b: Boolean) =
      and(a,b) match {
        case true => false
        case false => true
      }

    def nor(a: Boolean, b: Boolean) =
      or(a,b) match {
        case true => false
        case false => true
      }

    def xor(a: Boolean, b: Boolean) =
      (a, b) match {
        case (true, true) => false
        case _            => or(a,b)
      }

  }

}