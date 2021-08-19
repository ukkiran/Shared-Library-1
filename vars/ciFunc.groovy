def Checkout(Map specs) {
  docheckout = new com.hexaware.service.Chekout(this, specs)
  docheckout.checkOutFunc(specs)
}
