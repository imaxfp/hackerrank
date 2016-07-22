package hackerrank.datastructure.arrays

/**
  * @author Maxim
  * Sparse Arrays
  *
  * There are  strings. Each string's length is no more than  characters. There are also  queries.
  * For each query, you are given a string, and you need to find out how many times this string occurred previously.
  *
  * Explanations:
  *
  * init string:
  * 4
  * aba
  * baba
  * aba
  * xzxb
  *
  * how many times this string occurred previous:
  * 3
  * aba - 2
  * xzxb - 1
  * ab - 0
  *
  */
object SparseArrays {

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val first = initArray(sc)
    val second = initArray(sc)
    second.foreach(e => println(first.count(_ == e)))

    val rrrr = new Array[Int](10)
    rrrr.sum
  }

  def initArray(sc: java.util.Scanner): Array[String] = {
    var inputCount = sc.nextInt()
    var arr = new Array[String](inputCount)
    for (i <- 0 until inputCount) {
      arr(i) = sc.next()
    }
    arr
  }
}
