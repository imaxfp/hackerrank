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
object InsertionSortPart2 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val size = sc.nextInt()
    val arr = init(size, Array[Int](), sc)
    insertSort(arr)
  }

  //https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif
  def insertSort(arr: Array[Int]) {
    for (i <- 0 to arr.size - 1) {
      //(j <- arr.length - 1 to i by -1)
      for (j <- i to 0 by -1) {
        if (arr.apply(j) > arr.apply(i + 1)) {
          swap(arr, j, i + 1)
        }
      }
    }
  }

  private def swap(arr: Array[Int], i: Int, j: Int) : Array[Int] = {
    arr.foreach(e => print(e + " "))
    println()
    val tmp = arr.apply(i)
    arr.update(i, arr.apply(j))
    arr.update(j, tmp)
    arr
  }

  @tailrec
  def init(n: Int, res: Array[Int], sc: java.util.Scanner): Array[Int] = {
    if (n == 0) return res
    init(n - 1, res ++ Array(sc.nextInt()), sc)
  }

}
