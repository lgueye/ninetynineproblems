package org.diveintojee.ninetynineproblems

object P28 extends App {

  def lsort[A](list: List[List[A]]): List[List[A]] = list.sortBy(_.size)

  private def lsortFreqAcc[A](frequencies: List[Int], frequencyMap: Map[Int, List[List[A]]], acc: List[List[A]]): List[List[A]] = frequencies match {
    case Nil          => acc
    case head :: tail => lsortFreqAcc(tail, frequencyMap, frequencyMap(head) ++ acc)
  }

  def lsortFreq[A](list: List[List[A]]): List[List[A]] = {
    val frequencyMap = list.groupBy(_.size)
    lsortFreqAcc(frequencyMap.keySet.toList.sorted, frequencyMap, List(Nil))
  }

}
