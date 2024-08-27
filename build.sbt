ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

ThisBuild / scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:postfixOps",
  "-language:higherKinds")

lazy val root = (project
  .in(file("."))
  .settings(
    name := "cats-learning",
    version := "0.1.0",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.5.4" withSources() withJavadoc()
    )
  ))

