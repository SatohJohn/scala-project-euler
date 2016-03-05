package archive

/**
  * Created by john on 2016/03/05.
  */
object Archive5 {
  def main(args: Array[String]) {
    // 1から20で割れる最小値
    // 各数の素因数分解したものを取得して、それらをあわせる
    // filterNotだと一つあったらダメなので、diffを使ってやる
    val result = (1 to 20).map(util.Math.divide(_)).reduceLeft((collectList, list) => collectList:::list.diff(collectList)).product
    println(result)
  }
}
