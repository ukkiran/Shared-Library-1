package com.hexaware.service
class Dockerdeploy implements Serializable{
Script mainScript
Map specs
Map config

  def Dockerdeploy(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def dockerdeployFunc(Map specs, Map config){
    
      mainScript.sh """ docker run -it --name petclinic --expose 80 apurbaa10.jfrog.io/default-docker-local/petclinic:V1 """
    
  }
}
