def call(Map specs){
  node('master') {
    stage('Checkout'){
       println "java specs" + specs.repo
       println "java specs" + specs.branch
      ciFunc.checkoutVarFunc(specs)
     
    }
  }
}
