package hackerrank.datastructure.arrays

/**
  * @author Maxim
  *
  * Calculate max sum "hour glass" in the matrix.
  * For example:
  * 2 4 4
  *   2
  * 1 2 4
  *
  * = 19
  **/
object Hourglass2D {

  val cube = Array.ofDim[Int](8, 8, 8)

  val b1 = Array(1, 1, 1, 0, 0, 0)
  val b2 = Array(0, 1, 0, 0, 0, 0)
  val b3 = Array(1, 1, 1, 0, 0, 0)
  val b4 = Array(0, 0, 2, 4, 4, 0)
  val b5 = Array(0, 0, 0, 2, 0, 0)
  val b6 = Array(0, 0, 1, 2, 4, 0)

  val m1 = Array(-1, -1, 0, -9, -2, -2)
  val m2 = Array(-2, -1, -6, -8, -2, -5)
  val m3 = Array(-1, -1, -1, -2, -3, -4)
  val m4 = Array(-1, -9, -2, -4, -4, -5)
  val m5 = Array(-7, -3, -3, -2, -9, -9)
  val m6 = Array(-1, -3, -1, -2, -4, -5)


  val matrix = Array.ofDim[Int](6, 6)
  matrix.update(0, b1)
  matrix.update(1, b2)
  matrix.update(2, b3)
  matrix.update(3, b4)
  matrix.update(4, b5)
  matrix.update(5, b6)

  val matrixM = Array.ofDim[Int](6, 6)
  matrixM.update(0, m1)
  matrixM.update(1, m2)
  matrixM.update(2, m3)
  matrixM.update(3, m4)
  matrixM.update(4, m5)
  matrixM.update(5, m6)


  def main(args: Array[String]) {
    printSquareMatrix(matrix)
    var res = -2147483648
    for (i <- 0 until matrix.length - 2) {
      for (j <- 0 until matrix.length - 2) {
        val sum = checkSum(matrix, i, j, j + 2) + checkSum(matrix, i + 1, j + 1, j + 1) + checkSum(matrix, i + 2, j, j + 2)
        if (sum > res) res = sum
      }
    }

    println(res)
  }

  private def checkSum(matrix: Array[Array[Int]], row: Int, first: Int, last: Int) = {
    var sum = -1
    for (i <- first until last + 1) {
      sum = sum + matrix(row)(i)
    }
    sum + 1
  }

  private def printSquareMatrix(matrix: Array[Array[Int]]): Unit = {
    for (arr_i <- matrix.indices) {
      for (arr_j <- matrix.indices) {
        print(matrix(arr_i)(arr_j) + " ")
      }
      println("")
    }
  }

}

