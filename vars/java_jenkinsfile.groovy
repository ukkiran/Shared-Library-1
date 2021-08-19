def call(Map specs){
  node('master') {
    stage('Checkout'){
      ciFunc.checkoutVarFunc(specs)
      println "java specs" + specs
    }
  }
}
