package com.hexaware.service
class Build implements Serializable{
Script mainScript
Map specs
Map config

  def Build(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def buildFunc(Map specs){
    mainScript.sh config.java.maven.command 
  }
}
