def call(){
  node('master') {
    stage('Specs Checkout'){
      ciFunc.checkoutVarFunc([
      repo: Repo
      branch: Branch
      ])
      def specsDir = "./Specs/$Version"
    
      if(fileExists(specsDir = "ci_template.yaml")){
       ci_template = readYaml file : specsDir + "/ci_template.yaml"
       specs = specs + ci_template
       println "reading specs file" + specs
        }
      }
    stage('Code Checkout'){
      ciFunc.checkoutVarFunc(specs)
    }
    stage('Build'){
      ciFunc.build(specs)
    }
  }
}
