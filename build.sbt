import com.lihaoyi.workbench.WorkbenchPlugin._

val root = (project in file(".")).enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

workbenchSettings

name := "klondike-js"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.2" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

// bootSnippet := "example.PixiScalaJSExample().main(document.getElementById('canvas'));"

//refreshBrowsers := refreshBrowsers.triggeredBy(fastOptJS in Compile).value
