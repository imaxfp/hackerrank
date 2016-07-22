package hackerrank.algorithms.warmup

/**
  * @author Maxim
  *
  * Given a square matrix of N x N size , calculate the absolute difference between the sums of its diagonals.
  *
  */
object PlusMinus {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt()
    }
    printf("%.6f\n%.6f\n%.6f", arr.count(_ > 0) / n.toDouble, arr.count(_ < 0).toDouble / n, arr.count(_ == 0) / n.toDouble)
  }

}
