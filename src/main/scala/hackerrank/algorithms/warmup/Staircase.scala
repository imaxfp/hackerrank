package hackerrank.algorithms.warmup

import scala.annotation.tailrec

/**
  * @author Maxim
  *
  * Expected Output:
  *     #
  *    ##
  *   ###
  *  ####
  * #####
  *######
  *
  */
object Staircase {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    printRec(sc.nextInt()-1, 1)
  }

  @tailrec
  def printRec(gaps: Int, grid: Int): Unit ={
    if(gaps < 0) return
    for(i <- 0 until gaps) print(" ")
    for(i <- 0 until grid) print("#")
    println
    printRec(gaps -1, grid+1)
  }

}
