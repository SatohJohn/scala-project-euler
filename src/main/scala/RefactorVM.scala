/**
  * Created by satohjohn on 2016/02/26.
  */
object RefactorVM {
  def main(args: Array[String]): Unit = {
    println(getLength("http://google.com"))
    println(getElem("http://google.com"))
    println(getLength("http://dispatch.databinder.net/Dispatch.html"))
    println(getElem("http://dispatch.databinder.net/Dispatch.html"))
  }

  import dispatch._, Defaults._
  def getLength(u: String) = {
    val svc = url(u)
    val http = Http(svc OK as.String)
    println(http.print)
    val length = for (h <- http) yield h.length
    length.completeOption.getOrElse(-1)
  }
  def getElem(u: String) = {
    val svc = url(u)
    val http = Http(svc OK as.xml.Elem)
  }
}
