package archive

/**
  * Created by satohjohn on 2016/02/18.
  */
object Archive2 {
  def main(args: Array[String]): Unit = {
    var list = List(2L, 1L)
    //フィボナッチ数列を作成する
    println (addList(list).filter(_ % 2 == 0).reverse.sum)
  }
  def addList(l: List[Long]): List[Long] = {
    l.take(2).sum match {
      case x if x > 4000000 => l
      case x => addList(x :: l)
    }
  }
}
