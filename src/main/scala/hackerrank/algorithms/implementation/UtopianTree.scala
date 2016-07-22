package hackerrank.algorithms.implementation

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * @see https://www.hackerrank.com/challenges/utopian-tree
  *      Arithmetico-geometric sequence
  */
object UtopianTree {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    val years = init(t, Array(), sc)
    years.foreach(e => println(cycles(e, 1)))
  }

  @tailrec
  def cycles(cycl: Int, res: Int): Int = {
    if (cycl <= 0) return res
    val progression = if (cycl % 2 == 0) res * 2 else res + 1
    cycles(cycl - 1, progression)
  }

  @tailrec
  def init(t: Int, res: Array[Int], sc: java.util.Scanner): Array[Int] = {
    if (t == 0) return res
    init(t - 1, res ++ Array(sc.nextInt()), sc)
  }

}
