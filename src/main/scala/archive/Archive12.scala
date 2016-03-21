package archive

/**
  * Created by john on 2016/03/21.
  */
object Archive12 {
  def main(args: Array[String]) {
    println(u())
  }

  def u(): Long = {
    def loop(l: Long) : Long = if(util.Math.divisor(util.Math.tri(l)).length < 500) loop(l+1) else l
    util.Math.tri(loop(1))
  }
}
