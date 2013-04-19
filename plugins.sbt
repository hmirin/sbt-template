libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.1")

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/" // for latest sbt-idea

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.0-SNAPSHOT")

