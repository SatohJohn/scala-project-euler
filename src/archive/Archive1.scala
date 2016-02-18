package archive

/**
  * Created by satohjohn on 2016/02/16.
  */
object Archive1 {
  def main (args: Array[String]) {
    println(Range(1, 1000).filter(v => {v%3==0||v%5==0}).sum)
    println((for(i <- 1 until 1000 if i%5==0 || i%3 == 0) yield i).sum)
  }
}
