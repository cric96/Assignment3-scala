ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"
val akkaVersion = "2.8.5"
lazy val root = (project in file("."))
  .settings(
    name := "akka-remote-basics",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion, // For standard log configuration
      "com.typesafe.akka" %% "akka-remote" % akkaVersion, // For akka remote
      "com.typesafe.akka" %% "akka-cluster-typed" % akkaVersion, // akka clustering module
      "com.typesafe.akka" %% "akka-serialization-jackson" % akkaVersion,
      "ch.qos.logback" % "logback-classic" % "1.2.3"
    )
  )