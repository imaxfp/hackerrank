package hackerrank.algorithms.sorting

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * V - the value that has to be searched.
  * n - the size of the array.
  * ar - n - numbers that make up the array.
  *
  */
object IntroToTutorialChallenges {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val v = sc.nextInt()
    val n = sc.nextInt()
    val arr = init(n, Array[Int](), sc)
    arr.zipWithIndex.foreach{case (e,i) => if(e == v)println(i)}
  }

  @tailrec
  def init(n: Int, res: Array[Int], sc: java.util.Scanner): Array[Int] = {
    if (n == 0) return res
    init(n - 1, res ++ Array(sc.nextInt()), sc)
  }

}
