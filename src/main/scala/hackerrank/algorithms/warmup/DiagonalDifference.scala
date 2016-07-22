package hackerrank.algorithms.warmup

/**
  * @author Maxim
  *
  * Given a square matrix of N x N size , calculate the absolute difference between the sums of its diagonals.
  *
  */
object DiagonalDifference {

  val b1 = Array(11, 2, 4)
  val b2 = Array(4, 5, 6)
  val b3 = Array(10, 8, -12)

  val matrix = Array.ofDim[Int](3, 3)
  matrix.update(0, b1)
  matrix.update(1, b2)
  matrix.update(2, b3)


  def main(args: Array[String]) {
    val primary = for (i <- matrix.indices) yield matrix(i)(i)
    val secondary = for (i <- matrix.length - 1 to 0 by -1) yield matrix(matrix.length - 1 - i)(i)
    val absoluteDiff = primary.sum - secondary.sum
    //println(if (absoluteDiff < 0) absoluteDiff * -1 else absoluteDiff)
    println(Math.abs(primary.sum - secondary.sum))
  }

  def readInput: Array[Array[Int]] = {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var a = Array.ofDim[Int](n, n)
    for (a_i <- 0 until n) {
      for (a_j <- 0 to n - 1) {
        a(a_i)(a_j) = sc.nextInt()
      }
    }
    a
  }

}
