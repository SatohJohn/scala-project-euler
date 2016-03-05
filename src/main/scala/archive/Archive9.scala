package archive

/**
  * Created by john on 2016/03/06.
  */
object Archive9 {
  def main(args: Array[String]) {
    val limit = 1000
    for (a <- 1 until limit; b <- 1 until limit if a < b; if a * a + b * b == (limit - a - b) * (limit - a - b)) {
      println("a=%s, b=%s, c=%s. product is %s".format(a, b, limit - a - b, a*b*(limit - a - b)))
    }
  }
}
