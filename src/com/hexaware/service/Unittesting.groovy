package com.hexaware.service
class Unittesting implements Serializable{
Script mainScript
Map specs
Map config

  def Unittesting(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def unitTestFunc(Map specs, Map config){
    mainScript.sh config.java.unittest.junit.command 
    mainScript.sh config.java.unittest.junit.surefire
  }
}
