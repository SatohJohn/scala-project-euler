package util

import scala.collection.mutable.ListBuffer

/**
  * Created by john on 2016/03/05.
  */
object Math {
  val start: Long = 2L
  val inclement: Long = 1L

  /**
    * {@code d}の素因数を取得する
    * @param d
    * @return
    */
  // => とかくと名前渡しになって、関数、または、値を渡せる
  def primeFactor(d: => Long): List[Long] = {
    var result: List[Long] = List.empty
    var i = start
    var s = d
    while (i <= s) {
      if (s % i == 0L) {
        s = s/i
        result = i::result
      } else {
        i = i+inclement
      }
    }
    result.reverse
  }

  /**
    * {@code limit}までに存在する素数を計算する
    * @param limit
    * @return
    */
  def primes(limit: Int): List[Long] = {
    var result: ListBuffer[Long] = new ListBuffer[Long]
    result += 2
    var i = 3
    while (i < Long.MaxValue) {
      if (result.size >= limit) {
        return result.toList
      }
      if (result.forall(i % _ != 0)) {
        result += i
      }
      i = i+2
    }
    result.toList
  }

  /**
    * {@code limit}までに存在する素数を取得する
    * @param limit
    * @return
    */
  def primes(limit: Long): List[Long] = {
    (2L to limit).par.filterNot(i => (2L until math.sqrt(i).toLong).exists(i%_ == 0)).toList
  }
}
