def checkoutVarFunc(Map specs) {
  println "Printing specs" + specs
  docheckout = new com.hexaware.service.Codecheckout(this, specs)
  docheckout.checkOutFunc(specs)  
}
def build(Map specs) {
  dobuild = new com.hexaware.service.Build(this, specs)
  dobuild.buildFunc(specs)
  
}
