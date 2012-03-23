organization := "de.johoop"

name := "findbugs4sbt"

version := "1.1.4"

sbtPlugin := true

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>http://www.bitbucket.org/jmhofer/findbugs4sbt</url>
  <licenses>
    <license>
      <name>Eclipse Public License v1.0</name>
      <url>http://www.eclipse.org/legal/epl-v10.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://bitbucket.org/jmhofer/findbugs4sbt</url>
    <connection>scm:hg:https://bitbucket.org/jmhofer/findbugs4sbt</connection>
  </scm>
  <developers>
    <developer>
      <id>johofer</id>
      <name>Joachim Hofer</name>
      <url>http://jmhofer.johoop.de</url>
    </developer>
  </developers>
)

