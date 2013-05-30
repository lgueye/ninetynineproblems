package org.diveintojee.ninetynineproblems

import P10.encode

object P28 extends App {

  def lsort[A](list: List[List[A]]): List[List[A]] = list.sortBy(_.size)

  def lsortFreq[A](list: List[List[A]]): List[List[A]] = {
    val lengthFrequencies = Map( encode(list map {_.length} sortWith { (x,y) => x < y}) map {_.swap} : _*)
    list sortWith  { (e1, e2) => lengthFrequencies(e1.length) < lengthFrequencies(e2.length) }
  }

}
