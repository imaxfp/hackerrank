package hackerrank.algorithms.implementation

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * @see https://www.hackerrank.com/challenges/angry-professor
  *
  */
object Sherlock {

  def main(args: Array[String]) {
   ???
  }

  @tailrec
  def init(t: Int, res: List[Tuple2[Int, List[Int]]], sc: java.util.Scanner): List[Tuple2[Int, List[Int]]] = {
    if (t == 0) return res
    val countStud = sc.nextInt()
    val kStudents = sc.nextInt()
    val arrived = for (i <- 0 until countStud) yield sc.nextInt()
    init(t - 1, res ++ List(Tuple2(kStudents, arrived.toList)), sc)
  }
}
