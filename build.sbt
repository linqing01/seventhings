enablePlugins(SbtWar)

organization := "Lift"

name := "seventhings"

version := "0.6"

scalaVersion := "2.13.18"

scalacOptions ++= Seq("-deprecation", "-unchecked")


libraryDependencies ++= {
  val liftVersion = "4.0.0-M3"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion,
    "junit" % "junit" % "4.13.2" % "test",
    "ch.qos.logback" % "logback-classic" % "1.5.22",
    "org.specs2" %% "specs2-core" % "4.23.0" % "test",
    "org.specs2" %% "specs2-matcher-extra" % "4.23.0" % "test",
    "org.specs2" %% "specs2-junit" % "4.23.0" % "test",
    "com.h2database" % "h2" % "2.4.240"
  )
}