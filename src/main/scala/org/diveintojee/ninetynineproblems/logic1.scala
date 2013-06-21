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

    /**
     * 1 - From the initial decoded string, build a list of tuples (char, frequency) sorted by frequency asc
     * 2 - From that list, build a list of leaves
     * 3 - Until you obtain a single tree:
     *    * merge the 2 leaves with lowest frequency into one tree
     *    * build a new list: insert the new tree in the old list, preserve the frequency sort, remove the 2 leaves
     * 4 - From this tree, build a coding table by traversing all leaves.
     *    Each character should be represented by a unique bits path : 'a' -> "100110" for example
     * 5 - From this coding table, translate each char from the initial text into its huffman code
     *
     * @param decodedText
     * @return
     */
    def huffmanEncoding(decodedText: String): List[String] =
      encode (decodedText, codingTable (decodedText, huffmanTree {charsFrequency (decodedText)}))

    /**
     * Builds a list of tuples (char, frequency) sorted by frequency asc
     *
     * @param decodedText
     * @return
     */
    def charsFrequency(decodedText: String): List[(Char, Int)] =
      (decodedText.toList groupBy { x => x } mapValues { _.size }).toList

    sealed abstract class CodeTree
    case class Node(left: CodeTree, right: CodeTree) extends CodeTree
    case class Leaf(char: Char, weight: Int) extends CodeTree

    /**
     * Builds a Huffman tree from the frequency list:
     * Until you obtain a single tree:
     * - merge the 2 leaves with lowest frequency into one tree
     * - build a new list: insert the new tree in the old list, preserve the frequency sort, remove the 2 leaves
     *
     * @param charsFrequency
     * @return
     */
    def huffmanTree(charsFrequency: List[(Char, Int)]): CodeTree =
      combine { charsFrequency sortWith { (x,y) => x._2 < y._2 } map { x => Leaf (x._1, x._2)} }

    /**
     *
     * @param tree
     * @return
     */
    def weight(tree: CodeTree): Int =
      tree match {
        case Node(left, right) => weight(left) + weight(right)
        case Leaf(char, w) => w
      }

    /**
     *
     * @param tree
     * @return
     */
    def chars(tree: CodeTree): List[Char] =
      tree match {
        case Node(left, right) => chars(left) ::: chars(right)
        case Leaf(char, w) => List(char)
      }

    /**
     * Insert a tree in the list, preserving frequency order
     *
     * @param x
     * @param xs
     * @return
     */
    def insert(x: CodeTree, xs: List[CodeTree]): List[CodeTree] =
      if (xs.isEmpty || weight(x) <= weight(xs.head)) x :: xs
      else xs.head :: insert(x, xs.tail)

    /**
     * Merge leaves with initial list minus leaves
     * Do it until the list contains only one tree
     *
     * @param trees
     * @return
     */
    def combine(trees: List[CodeTree]): CodeTree =
      trees match {
        case Nil                      => throw new IllegalArgumentException
        case head :: Nil              => head
        case left :: right :: tail => combine { insert ( Node(left, right), tail) }
      }

    /**
     *
     * @param c
     * @param tree
     * @return
     */
    def encodeChar(c: Char, tree: CodeTree): String =
      encodeCharR(c, tree, "")

    /**
     *
     * @param char
     * @param tree
     * @param acc
     * @return
     */
    private def encodeCharR(char: Char, tree: CodeTree, acc: String): String =
      tree match {
        case Node(left, right) =>
          if (chars(left).contains(char)) encodeCharR(char, left, acc + "0")
          else encodeCharR(char, right, acc + "1")
        case Leaf(c, w) => acc
      }


    /**
     * Build a coding table by traversing all leaves.
     * Each character should be represented by a unique bits path : 'a' -> "100110" for example
     *
     * @param decodedText
     * @param huffmanTree
     * @return
     */
    def codingTable(decodedText: String, huffmanTree: CodeTree): Map[Char, String] =
      codingTableR(decodedText.toList.groupBy(x => x).keys.toList, huffmanTree, Map.empty)

    /**
     *
     * @param decodedChars
     * @param huffmanTree
     * @param acc
     * @return
     */
    private def codingTableR(decodedChars: List[Char], huffmanTree: CodeTree, acc: Map[Char, String]): Map[Char, String] =
      decodedChars match {
        case Nil => acc
        case head :: tail => codingTableR(tail, huffmanTree, acc ++ Map( (head, encodeChar(head, huffmanTree)) ))
      }

    /**
     *
     * @param decodedText
     * @param codingTable
     * @return
     */
    def encode(decodedText: String, codingTable: Map[Char, String]): List[String] =
      decodedText.toList map { codingTable ( _ ) }

    def huffman(stringFrequencies: List[(String, Int)]): List[(String, String)] =
      {
        val text = (stringFrequencies map {tuple => tuple._1 * tuple._2}).mkString
        val charFrequencies = stringFrequencies map {tuple => (tuple._1.charAt(0), tuple._2)}
        codingTable(text, huffmanTree(charFrequencies)).toList map {x => (x._1.toString, x._2)} sortWith( (a, b) => a._1 < b._1)
      }


  }

}
