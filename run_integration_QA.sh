#!/bin/bash -e
ENV=qa
BROWSER=chrome
DRIVER=-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver

# Scalafmt checks have been separated from the test command to avoid OutOfMemoryError in Jenkins
sbt scalafmtCheckAll scalafmtSbtCheck

sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.IntegrationRunner"
