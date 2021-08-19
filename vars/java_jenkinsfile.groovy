def call(Map specs){
  node('master') {
    stage('Checkout'){
      ciFunc.Checkout(specs)
    }
  }
}
