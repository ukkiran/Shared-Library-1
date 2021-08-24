def checkoutVarFunc(Map specs) {
  println "Printing specs" + specs
  docheckout = new com.hexaware.service.Codecheckout(this, specs)
  docheckout.checkOutFunc(specs)  
}
def build(Map specs, Map config) {
  dobuild = new com.hexaware.service.Build(this, specs, config)
  dobuild.buildFunc(specs, config) 
}
def unitTestFunc(Map specs, Map config) {
  dounittest = new com.hexaware.service.Unittesting(this, specs, config)
  dounittest.UnittestFunc(specs, config) 
}
def codeCoverageFunc(Map specs, Map config) {
  docodecoverage = new com.hexaware.service.Codecoverage(this, specs, config)
  docodecoverage.CodecoveragecheckFunc(specs, config) 
}
