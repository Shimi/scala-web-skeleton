name := "example"

version := "0.0.1-SNAPSHOT"

organization := "org.something"

scalaVersion := "2.9.1"

seq(webSettings :_*)

resolvers ++= Seq("shimi repo snapshots" at "https://raw.github.com/Shimi/shimi-mvn-repo/master/snapshots")

libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.6.2",
	"ch.qos.logback" % "logback-classic" % "0.9.30",
	"javax.servlet" % "servlet-api" % "2.5" % "provided",
	"org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" % "container")
