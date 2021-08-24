def call(){
  node('master') {
    def specs = [:]
    try {
    stage('Specs Checkout'){
      cleanWs()
      ciFunc.checkoutVarFunc([
      repo: Repo,
      branch: Branch
      ])
      stage('reading GlobalConfig & Specs'){ 
          println "reading the specs from Specs repository"
          def specsDir = "./specs/$Version"
          println "specs version" + specsDir
          try {
            if(fileExists(specsDir + "/ci_template.yaml")){
             ci_template = readYaml file : specsDir + "/ci_template.yaml"
             specs = specs + ci_template
             println "reading specs file" + specs
              }
          }
          catch(Exception e) {
             println "Error in reading specs file : " + e.getMessage()
          throw e
            }
        println "reading the global config from resources"
        def request = libraryResource "com/hexaware/service/globalConfig/globalConfig.yaml"
        config = readYaml text: request
      }
     
    stage('Code Checkout'){
        ciFunc.checkoutVarFunc([
        repo: specs.scm.repo,
        branch: specs.scm.branch  
          ])
        }
    }   
    stage('Build'){
      ciFunc.build(specs)
      }
    }
      catch(Exception e) {
        println "Error in build stage : " + e.getMessage()
      throw e
      }
    }
  }
