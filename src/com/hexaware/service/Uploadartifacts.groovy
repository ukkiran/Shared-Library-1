package com.hexaware.service
class Uploadartifacts implements Serializable{
Script mainScript
Map specs
Map config

  def Uploadartifacts(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def uploadartifactFunc(Map specs, Map config){
      def server = mainScript.Artifactory.server 'artifactory'
        def uploadSpec = """{
        "files": [
          {
            "pattern": "target/*.jar",
            "target": "default-maven-local/petclinic/jar/"
          }
       ]
      }"""
      def buildInfo = server.upload(uploadSpec)  
      server.publishBuildInfo(buildInfo)
  }
}
