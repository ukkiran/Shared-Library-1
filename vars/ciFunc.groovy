def Checkout(Map specs) {
  docheckout = new com.hexaware.service.Checkout(this, specs)
  docheckout.checkOutFunc(specs)
}
