package hackerrank.algorithms.implementation

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * @see https://www.hackerrank.com/challenges/angry-professor
  *
  */
object AngryProfessor {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val countTests = sc.nextInt()
    val professor = init(countTests, List(), sc)
    professor.foreach { case (count: Int, arives: List[Int]) =>
      if (arives.count(_ <= 0) >= count) println("NO") else println("YES")
    }
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
