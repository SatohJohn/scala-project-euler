package archive

/**
  * Created by satohjohn on 2016/02/25.
  */
object Archive3 {
  def main(args: Array[String]) {
    val actual = 600851475143L
    for (i <- 3L to math.ceil(math.sqrt(actual.toDouble)).toLong by 2 if actual % i == 0L) {
      println(i)
    }
  }
}
