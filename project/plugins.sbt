unmanagedSourceDirectories.in(Compile) +=
  baseDirectory.in(ThisBuild).value.getParentFile /
    "plugin" / "src" / "main" / "scala"
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.3")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
