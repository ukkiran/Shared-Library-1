import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

class JavaJenkinsFile extends JenkinsPipelineSpecification {
    def javaJenkinsFile = null

    def setup() {
        javaJenkinsFile = loadPipelineScriptForTest("vars/java_jenkinsfile.groovy")
    }

    def "[javaJenkinsFile] will run npm publish if deploy is true"() {
        when:
            javaJenkinsFile deploy: true
        then:
            1 * getPipelineMock("sh")("mvn --version")
    }
}
