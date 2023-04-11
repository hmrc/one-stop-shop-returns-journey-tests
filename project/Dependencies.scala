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
    "uk.gov.hmrc"         %% "webdriver-factory"  % "0.43.0"   % Test,
    "org.scalatest"       %% "scalatest"          % "3.2.12"   % Test,
    "org.scalatestplus"   %% "selenium-3-141"     % "3.2.10.0" % Test,
    "com.vladsch.flexmark" % "flexmark-all"       % "0.64.0"   % Test,
    "io.cucumber"         %% "cucumber-scala"     % "8.2.6"    % Test,
    "io.cucumber"          % "cucumber-junit"     % "7.3.3"    % Test,
    "junit"                % "junit"              % "4.13.2"   % Test,
    "com.novocode"         % "junit-interface"    % "0.11"     % Test,
    "com.typesafe"         % "config"             % "1.4.2"    % Test,
    "org.mongodb.scala"   %% "mongo-scala-driver" % "4.7.1"    % Test
  )

}
