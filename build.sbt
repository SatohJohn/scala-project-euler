name := "scala project euler"
version := "1.0"
scalaVersion := "2.11.7"

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
libraryDependencies += "net.databinder.dispatch" %% "dispatch-jsoup" % "0.11.0"

resolvers ++= Seq("releases" at "http://oss.sonatype.org/content/repositories/releases")
