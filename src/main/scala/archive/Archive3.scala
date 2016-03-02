package archive

/**
  * Created by satohjohn on 2016/02/25.
  */
object Archive3 {
  def main(args: Array[String]) {
    val arg = 600851475143L
    devide(3L, arg)
  }

  def devide(l:Long, d:Long): Long = {
    var i = l
    while (i <= d) {
      if (d % i == 0L) {
        println(i, d)
        return devide(i, d/ i)
      }
      i = i + 2
    }
    0L
  }
}
