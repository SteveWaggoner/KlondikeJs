logLevel := Level.Warn

resolvers += "spray repo" at "http://repo.spray.io"
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.24")

addSbtPlugin("com.lihaoyi" % "workbench" % "0.4.1")
