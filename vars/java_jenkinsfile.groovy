def call(Map specs){
  node('master') {
    stage('Checkout'){
       println "java specs" + specs
      ciFunc.checkoutVarFunc(specs)
     
    }
  }
}
