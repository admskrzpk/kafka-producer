ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "kafka-producer"
  )
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.1.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11" % Runtime