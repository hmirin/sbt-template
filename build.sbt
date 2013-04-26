version := "1.0"

name := "template"

// recommended for scalanlp
scalaVersion := "2.10.1"

//processing lib.
unmanagedBase <<= baseDirectory { base => base / "processing-2.0b8" }

//scalanlp
libraryDependencies  ++= Seq(
            "org.scalanlp" %% "breeze-math" % "0.2.3",
            "org.scalanlp" %% "breeze-learn" % "0.2.3",
            "org.scalanlp" %% "breeze-process" % "0.2.3",
            "org.scalanlp" %% "breeze-viz" % "0.2.3"
)




