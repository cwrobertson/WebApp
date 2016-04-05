lazy val root = project.in(file(".")).enablePlugins(PlayJava)

name := """WebApp"""

version := "1.0-SNAPSHOT"

libraryDependencies += javaEbean