package archive

/**
  * Created by john on 2016/03/02.
  */
object Archive4 {
  def main(args: Array[String]): Unit = {
    println(Range(1, 999).filter(_ % 10 != 0).map(i => ((i / 100) * 1000) + (((i % 100) / 10) * 10000) + ((i % 10) * 100000) + i).sorted(Ordering[Int].reverse).find(i => {
      Range(999, math.sqrt(i).toInt, -1).exists(diveider => {
        (i%diveider == 0) && (i/diveider) < 1000 && (i/diveider) >= 100
      })
    }))
  }
}
