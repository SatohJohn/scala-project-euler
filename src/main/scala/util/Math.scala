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
  def primeFactor(d: => Long): List[Long] = {
    var result: List[Long] = List.empty
    var s = d
    def res(i:Long) = {
      s = s/i
      result = i::result
      i
    }
    def loop(l: Long): Long =
      if (l <= s && s%l == 0) loop(res(l))
      else if (l<=s) loop(l+inclement)
      else 0

    loop(start)
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

  def tri(a: Long): Long = {
    (1L to a).sum
  }

  /**
    *
    * @param d
    * @return
    */
  def divisor(d: Long): List[Long] = {
    var i = 1L
    var result: ListBuffer[Long] = new ListBuffer[Long]
    while (i < math.floor(math.sqrt(d))) {
      if (d%i == 0) {
        result += i
        result += d/i
      }
      i += 1L
    }
    result.toList.sorted
  }
}
