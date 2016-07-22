package hackerrank.algorithms.strings

/**
  * @author Maxim
  *
  * Sample Input
  * "We promptly judged antique ivory buckles for the next prize" == pangram "has all alphabet letters"
  * Input #2
  * We promptly judged antique ivory buckles for the prize == not pangram
  *
  */
object Pangrams {

  def main(args: Array[String]) {
    val line = scala.io.StdIn.readLine().toLowerCase.replace(" ", "")

    val panagram = "We promptly judged antique ivory buckles for the next prize".toLowerCase.replace(" ", "")
    val noPanagram = "We promptly judged antique ivory buckles for the prize".toLowerCase.replace(" ", "")

    for (i <- 'a' until 'z') if (noPanagram.length < 26 || !noPanagram.contains(i)) {
      println("not pangram")
      return
    }
    println("pangram")
  }

}
