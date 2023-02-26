ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-S3-AWS-demo"
  )



libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "s3" % "2.19.0",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.12.368" ,
  "com.dimafeng" %% "testcontainers-scala-scalatest" % "0.40.12" ,
  "com.dimafeng" %% "testcontainers-scala-localstack-v2" % "0.40.12" ,
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-wordspec" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-flatspec" % "3.2.15" % Test


)