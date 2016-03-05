package archive

/**
  * Created by john on 2016/03/05.
  */
object Archive6 {
  def main(args: Array[String]) {
    println(math.pow((1 to 100).sum, 2).toLong - (1 to 100).map(math.pow(_, 2)).sum.toLong)
  }
}
