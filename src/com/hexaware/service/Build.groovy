package com.hexaware.service
class Build implements Serializable{
Script mainScript
Map specs

  def Build(Script mainScript, Map specs){
  this.mainScript = mainScript
  this.specs = specs
  }
  def buildFunc(Map specs){
    // mainScript.sh "mvn -Dmaven.test.failure.ignore=true clean package" 
    def mvnHome = tool name: 'maven', type: 'maven'
    mainScript.sh "${mvnHome}/bin/mvn -version"
  }
}
