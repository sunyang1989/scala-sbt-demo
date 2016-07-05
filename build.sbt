name := "scala-sbt-demo"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  //"com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.2",
  "org.scala-lang" % "scala-swing" % "2.11.0-M7",
  "org.scala-lang" % "scala-actors" % "2.11.8"
)

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
    