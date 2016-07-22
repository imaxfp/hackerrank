package hackerrank.algorithms.strings

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * Changes all the words in the letter into palindromes.
  */
object LoveLetterMystery {

  def main(args: Array[String]) {
    val t = scala.io.StdIn.readLine().toInt
    val initArr = init(t, Array[String]())
    initArr.foreach(e => println(count(0, e, 0)))
  }

  @tailrec
  def count(index: Int, arr: String, res: Int): Int = {
    if (index == arr.length - 1) return res
    val res2 = if (arr(index) == arr(index + 1)) res + 1 else res
    count(index + 1, arr, res2)
  }

  @tailrec
  def init(t: Int, res: Array[String]): Array[String] = {
    if (t == 0) return res
    init(t - 1, res ++ Array(scala.io.StdIn.readLine()))
  }

}
