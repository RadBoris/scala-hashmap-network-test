lazy val root = (project in file(".")).

settings (
  name := "MapReduce",
  version := "1.0",
  scalaVersion := "2.12.8",
  scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation", "-encoding", "UTF-8",  "-Xlint"),
  resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.22",
  libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.5.22",
  libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.5.23",
  libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3",
  libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.23",
  libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.23" % Test,
  libraryDependencies += "de.heikoseeberger" %% "constructr" % "0.19.0",
  libraryDependencies += "de.heikoseeberger" %% "constructr-coordination-etcd" % "0.19.0"
)

// maintainer := "Rad Borislavov <rad.borislavov@gmail.com>"

// version in Docker := "latest"

// dockerExposedPorts in Docker := Seq(1600)

// dockerEntrypoint in Docker := Seq("sh", "-c", "bin/clustering $*")

// // dockerRepository := Some("lightbend")

// dockerBaseImage := "java"
// enablePlugins(JavaAppPackaging)
