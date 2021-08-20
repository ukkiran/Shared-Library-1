def call(){
  node('master') {
    def specs = [:]
    stage('Specs Checkout'){
      cleanWS()
      ciFunc.checkoutVarFunc([
      repo: Repo,
      branch: Branch
      ])
      def specsDir = "./Specs/$Version"
      println "specs version" + specsDir
      // if(fileExists(specsDir + "ci_template.yaml")){
       ci_template = readYaml file : specsDir + "/ci_template.yaml"
       specs = specs + ci_template
       println "reading specs file" + specs
        //}
      }
    stage('Code Checkout'){
      ciFunc.checkoutVarFunc([
      repo: specs.scm.repo,
      branch: specs.scm.branch  
      ])
    }
    stage('Build'){
      ciFunc.build(specs)
    }
  }
}
