def call(Map specs){
  node('master') {
    stage('Checkout'){
      ciFunc.checkoutVarFunc(specs)
    }
    stage('Build'){
      ciFunc.build(specs)
    }
  }
}
