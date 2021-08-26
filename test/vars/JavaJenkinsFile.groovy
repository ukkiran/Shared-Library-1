import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

class JavaJenkinsFile extends JenkinsPipelineSpecification {
    def javaJenkinsFile = null
    
    def specs = [unitTest:[isUnittestRequired: true]]

    def setup() {
        javaJenkinsFile = loadPipelineScriptForTest("vars/java_jenkinsfile.groovy")
    }

    def "[javaJenkinsFile] will run unit test if isUnittestRequired is true"() {
        when:
            javaJenkinsFile specs
        then:
            1 * getPipelineMock("sh")("mvn --version")
    }
}
