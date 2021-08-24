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
  dobuild = new com.hexaware.service.Build(this, specs, config)
  dobuild.UnittestFunc(specs, config) 
}
def codeCoverageFunc(Map specs, Map config) {
  dobuild = new com.hexaware.service.Build(this, specs, config)
  dobuild.CodecoveragecheckFunc(specs, config) 
}
