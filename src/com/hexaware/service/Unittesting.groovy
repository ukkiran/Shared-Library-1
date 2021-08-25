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
    if (config.java.unittest.junit.status == true) {
      mainScript.sh config.java.unittest.junit.command 
    } else {
        println "skipping test"
    } 
    mainScript.sh config.java.unittest.junit.surefire
    //mainScript.sh config.java.unittest.junit.command 
    //mainScript.sh config.java.unittest.junit.surefire
    // mainScript.sh config.java.unittest.junit.status
  }
}
