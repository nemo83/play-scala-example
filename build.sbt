name := """play-scala-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

// ** Docker Specific Stuff
// Exposing the Play ports
dockerExposedPorts in Docker := Seq(9000, 9443)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

publishTo := {
  val nexus = "http://jenkins.local/nexus/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("snapshots" at nexus + "content/repositories/releases")
}
credentials += Credentials("Simple local nexus", "jenkins.local", "deployment", "development")