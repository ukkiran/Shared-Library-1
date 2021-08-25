package com.hexaware.service
class Codequality implements Serializable{
Script mainScript
Map specs
Map config

  def Codequality(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def codequalityFunc(Map specs, Map config){
    mainScript.sh mvn sonar:sonar -Dsonar.projectKey="Petclinic" -Dsonar.host.url="https://sonarcloud.io" -Dsonar.login="74b5ee6411083764b620699a731e7f05f5b12b9b" -Dsonar.projectName="Petclinic"
     }
  
}
