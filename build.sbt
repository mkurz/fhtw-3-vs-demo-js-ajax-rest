name := """demo-vs-js-ajax"""

organization := "at.fhtw"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  "org.hibernate" % "hibernate-core" % "5.5.6.Final",
  "org.postgresql" % "postgresql" % "42.3.1",
)
