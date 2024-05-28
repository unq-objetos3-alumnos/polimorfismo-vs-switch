name := "PolimorfismoInternoVsExterno"

version := "0.1"

scalaVersion := "2.13.14"

libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.3" % Test

scalacOptions ++= Seq(
  "-feature",
  "-Xlint",
  "-Wconf:cat=other-match-analysis:error",
)
