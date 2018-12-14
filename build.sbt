name := "lambdatest"

version := "0.1"

scalaVersion := "2.12.8"

val awsSdkVersion = "1.11.346"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-lambda" % awsSdkVersion,
  "com.amazonaws" % "aws-lambda-java-events" % "2.1.0",
  "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
)

assemblyJarName in assembly := "lambdatest.jar"
