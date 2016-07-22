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
object InsertionSortPart1 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val size = sc.nextInt()
    val arr = init(size, Array[Int](), sc)
    insertSort(arr, 0).foreach(e => print(e + " "))
  }

  def insertSort(arr: Array[Int], start: Int): Array[Int] = {
    for (i <- start until arr.length-1) {
      if(arr.apply(i) > arr.apply(i+1)) {
        val t = arr.apply(i+1)
        arr.update(i + 1, arr.apply(i))
        arr.foreach(e => print(e + " "))
        println()
        arr.update(i, t)
        insertSort(arr, if(i>0) i-1 else 0)
      }
    }
    arr
  }

  @tailrec
  def init(n: Int, res: Array[Int], sc: java.util.Scanner): Array[Int] = {
    if (n == 0) return res
    init(n - 1, res ++ Array(sc.nextInt()), sc)
  }
}
