def dockerDeploy(Map specs, Map config) {
  dodockerDeploy = new com.hexaware.service.Dockerdeploy(this, specs, config)
  dodockerDeploy.dockerdeployFunc(specs, config)
}
