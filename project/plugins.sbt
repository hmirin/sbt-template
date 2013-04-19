libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test" //2013-04

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.1") //2013-04

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/" // for latest sbt-idea 2013-04

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.0-SNAPSHOT")

