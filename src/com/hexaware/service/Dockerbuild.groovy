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
    mainScript.withCredentials([mainScript.usernamePassword(credentialsId: 'artifactory', passwordVariable: 'password', usernameVariable: 'username')]) {
      mainScript.sh """ docker login -u mainScript.username -p mainScript.password "https://apurbaa10.jfrog.io/artifactory/default-docker-local/" """
      mainScript.sh config.java.dockerbuild.docker.command
    }
  }
}
