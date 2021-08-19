def checkoutVarFunc(Map specs) {
  println "Printing specs" + specs
  docheckout = new com.hexaware.service.Codecheckout(this, specs)
  docheckout.checkOutFunc(specs)
  
}
