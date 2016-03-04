import com.ning.http.client.ProxyServer.Protocol

/**
  * Created by satohjohn on 2016/02/26.
  */
object RefactorVM {
  def main(args: Array[String]): Unit = {
    getElem("http://qiita.com/kazu0620/items/20ea8cd1c3a2e3bb5574")
  }

  import dispatch._, Defaults._
  import com.ning.http.client.ProxyServer
  def getElem(u: String) = {
    val server: ProxyServer = new ProxyServer(Protocol.HTTP, "10.5.81.33", 3128)
    val svc = url(u).setProxyServer(server)
    // jsoupでdocumentにフェッチしている
    val document = Http(svc OK as.jsoup.Document).apply()
    println(document.text())
  }
}
