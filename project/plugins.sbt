scalacOptions ++= Seq("-unchecked", "-feature"/*, "-deprecation", "-Xlint" , "-Xfatal-warnings"*/)

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.12.0"

libraryDependencies += "org.pantsbuild" % "jarjar" % "1.7.2"

libraryDependencies += "biz.aQute.bnd" % "biz.aQute.bndlib" % "6.1.0"

enablePlugins(BuildInfoPlugin)

// configure sbt-buildinfo to send the externalDependencyClasspath to the main build, which allows using it for the IntelliJ project config

lazy val buildClasspath = taskKey[String]("Colon-separated (or semicolon-separated in case of Windows) list of entries on the sbt build classpath.")

buildClasspath := (Compile / externalDependencyClasspath).value.map(_.data).mkString(java.io.File.pathSeparator)

buildInfoKeys := Seq[BuildInfoKey](buildClasspath)

buildInfoPackage := "scalabuild"

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.9.2")

libraryDependencies ++= Seq(
  "org.eclipse.jgit" % "org.eclipse.jgit" % "4.6.0.201612231935-r",
  "org.slf4j" % "slf4j-nop" % "1.7.32",
  "com.googlecode.java-diff-utils" % "diffutils" % "1.3.0"
  )

concurrentRestrictions in Global := Seq(
  Tags.limitAll(1) // workaround for https://github.com/sbt/sbt/issues/2970
)

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.2")
