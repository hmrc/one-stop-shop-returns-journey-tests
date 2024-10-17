import sbt.Keys.resolvers
import sbt._

object Dependencies {

  val hmrcRepoHost = java.lang.System.getProperty("hmrc.repo.host", "https://nexus-preview.tax.service.gov.uk")
  resolvers ++= Seq(
    "hmrc-snapshots" at hmrcRepoHost + "/content/repositories/hmrc-snapshots",
    "hmrc-releases" at hmrcRepoHost + "/content/repositories/hmrc-releases",
    "typesafe-releases" at hmrcRepoHost + "/content/repositories/typesafe-releases",
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    Resolver.bintrayRepo("hmrc", "releases")
  )

  val test = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner"     % "0.38.0"   % Test,
    "org.slf4j"            % "slf4j-simple"       % "1.7.36"   % Test,
    "org.scalatest"       %% "scalatest"          % "3.2.18"   % Test,
    "org.scalatestplus"   %% "selenium-4-12"      % "3.2.17.0" % Test,
    "com.vladsch.flexmark" % "flexmark-all"       % "0.64.8"   % Test,
    "io.cucumber"         %% "cucumber-scala"     % "8.20.0"   % Test,
    "io.cucumber"          % "cucumber-junit"     % "7.15.0"   % Test,
    "junit"                % "junit"              % "4.13.2"   % Test,
    "com.novocode"         % "junit-interface"    % "0.11"     % Test,
    "com.typesafe"         % "config"             % "1.4.2"    % Test,
    "org.mongodb.scala"   %% "mongo-scala-driver" % "4.7.1"    % Test
  )

}
