package com.hexaware.service
class Dockerbuild implements Serializable{
Script mainScript
Map specs
Map config

  def Dockerbuild(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def dockerbuildCheckFunc(Map specs, Map config){
  
  }
}
