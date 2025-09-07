// give the user a nice default project!
ThisBuild / organization := "com.example"

lazy val root = (project in file(".")).
  settings(
    name := "$name$"
  )
