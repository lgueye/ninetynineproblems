package org.diveintojee.ninetynineproblems {

  import scala._

  class S99Logic(a: Boolean) {

    import S99Logic._

    def and(b: Boolean): Boolean =
      (a, b) match {
        case (true, true) => true
        case _            => false
      }

    def or(b: Boolean): Boolean =
      (a, b) match {
        case (true, _) => true
        case (_, true) => true
        case _         => false
      }

    def nor(b: Boolean): Boolean =
      not(a or b)

    def equ(b: Boolean): Boolean =
      (a and b) or (not(a) and not(b))

    def xor(b: Boolean): Boolean =
      not(a equ b)

    def nand(b: Boolean): Boolean =
      not(a and b)

    def impl(b: Boolean): Boolean =
      not(a) or b

  }

  object S99Logic {

    implicit def boolean2S99Logic(a: Boolean): S99Logic = new S99Logic(a)

    def not(a: Boolean) = a match {
      case true  => false
      case false => true
    }

    def table2(f: (Boolean, Boolean) => Boolean) {
      println("A     B     result")
      for {a <- List(true, false);b <- List(true, false)} println("%-5s %-5s %-5s\n", a, b, f(a, b))
    }

    def gray(n: Int): List[String] = n match {
      case 0  => List("")
      case _  => {
        val previous = gray(n - 1)
        (previous map { "0" + _ }) ::: (previous.reverse map { "1" + _ })
      }
    }

    def huffman(decodedText: String): List[String] =
      encode (decodedText, codingTable (decodedText, huffmanTree {charsFrequency (decodedText)}))

    private def charsFrequency(decodedText: String): List[(Char, Int)] = ???

    sealed abstract class CodeTree
    case class Node(left: CodeTree, right: CodeTree, chars: List[Char], weight: Int) extends CodeTree
    case class Leaf(char: Char, weight: Int) extends CodeTree

    private def huffmanTree(charsFrequency: List[(Char, Int)]): CodeTree = ???

    private def codingTable(decodedText: String, huffmanTree: CodeTree): Map[Char, String] =
      codingTableAcc(decodedText.toList, huffmanTree, Map.empty)

    private def encodeChar(c: Char, tree: CodeTree): String = encodeCharAcc(c, tree, "")

    private def encodeCharAcc(char: Char, tree: CodeTree, acc: String): String =
      tree match {
        case Node(left, right, c, weight) =>
          if (chars(left).contains(char)) encodeCharAcc(char, left, acc + "0")
          else encodeCharAcc(char, right, acc + "1")
        case Leaf(c, w) => acc
      }

    def weight(tree: CodeTree): Int =
      tree match {
        case Node(left, right, chars, w) => weight(left) + weight(right)
        case Leaf(char, w) => w
      }

    def chars(tree: CodeTree): List[Char] =
      tree match {
        case Node(left, right, c, weight) => c
        case Leaf(char, w) => List(char)
      }

    private def codingTableAcc(decodedChars: List[Char], huffmanTree: CodeTree, acc: Map[Char, String]): Map[Char, String] =
      decodedChars match {
        case Nil => acc
        case head :: tail => codingTableAcc(tail, huffmanTree, acc ++ Map(head, encodeChar(head, huffmanTree)))
      }

    private def encode(decodedText: String, codingTable: Map[Char, String]): List[String] =
      decodedText.toList map { codingTable(_) }

  }

}