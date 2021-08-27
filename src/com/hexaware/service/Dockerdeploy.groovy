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
      mainScript.sh """ docker inspect f01ef1158f4191ad760357361d4fc3319dd8896c302059c42a5e36e3412b3236 "
      //mainScript.sh """ docker run -d --name petclinic apurbaa10.jfrog.io/default-docker-local/petclinic:V1 """
    
  }
}
