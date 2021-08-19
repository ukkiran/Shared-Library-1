package com.hexaware.service.build.groovy
class Build implements Serializable{
Script mainScript
Map specs

  def Build(Script mainScript, Map specs){
  this.mainScript = mainScript
  this.specs = specs
  }
  def buildFunc(Map specs){
    mainScript.mvnbuild([echo "hello",
    sh "mvn -Dmaven.test.failure.ignore=true clean package",
    userRemoteConfigs: [[url: specs.repo ]]
    ])
  }
}
