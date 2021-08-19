def checkoutVarFunc(Map specs) {
  docheckout = new com.hexaware.service.Codecheckout(this, specs)
  docheckout.checkOutFunc(specs)
  println "Printing specs" + specs
}
