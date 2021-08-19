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
    "uk.gov.hmrc"         %% "webdriver-factory"  % "0.20.0"  % Test,
    "org.scalatest"       %% "scalatest"          % "3.2.0"   % Test,
    "org.scalatestplus"   %% "selenium-3-141"     % "3.2.0.0" % Test,
    "com.vladsch.flexmark" % "flexmark-all"       % "0.35.10" % Test,
    "io.cucumber"         %% "cucumber-scala"     % "6.9.1"   % Test,
    "io.cucumber"          % "cucumber-junit"     % "6.9.1"   % Test,
    "junit"                % "junit"              % "4.12"    % Test,
    "com.novocode"         % "junit-interface"    % "0.11"    % Test,
    "com.typesafe"         % "config"             % "1.3.2"   % Test,
    "org.mongodb.scala"   %% "mongo-scala-driver" % "2.6.0"   % Test,
    "com.typesafe.play"   %% "play-iteratees"     % "2.6.1"   % Test
  )

}
