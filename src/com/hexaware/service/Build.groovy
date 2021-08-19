package com.hexaware.service
class Build implements Serializable{
Script mainScript
Map specs

  def Build(Script mainScript, Map specs){
  this.mainScript = mainScript
  this.specs = specs
  }
  def buildFunc(Map specs){
    mainScript.echo "hello"
    
  }
}
