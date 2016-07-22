package hackerrank.algorithms.strings

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * Sample Inputll
  * 3
  * abcdde
  * baccd
  * eeabg
  *
  * Sample Output
  * 2
  *
  * Explanation
  * Only "a" and "b" are the two kinds of gem-elements, since these are the only characters that occur in every rock's composition.
  *
  */
object Gemstones {

  //TODO ... 10: 48 == start
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val arr = init(sc.nextInt, Array[String](), sc)
    val res = arr(0).map(e => arr.count(s => s.contains(e))).toList
    val gemCount = res.count(_ == arr.length)
    println(gemCount)
  }

  @tailrec
  def init(t: Int, res: Array[String], sc: java.util.Scanner): Array[String] = {
    if (t == 0) return res
    init(t - 1, res ++ Array(sc.next), sc)
  }

}
