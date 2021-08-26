import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

class JavaJenkinsFile extends JenkinsPipelineSpecification {
    def javaJenkinsFile = null

    def setup() {
        javaJenkinsFile = loadPipelineScriptForTest("vars/java_jenkinsfile.groovy")
    }

    def "[javaJenkinsFile] will run unit test if isUnittestRequired is true"() {
        when:
            javaJenkinsFile isUnittestRequired: true
        then:
            1 * getPipelineMock("sh")("mvn --version")
    }
}
