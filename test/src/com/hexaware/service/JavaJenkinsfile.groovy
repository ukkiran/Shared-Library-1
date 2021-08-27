import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class JavaJenkinsfile extends JenkinsPipelineSpecification {

	def DefaultPipeline = null
  def specs = [unitTest:[isUnittestRequired: true]]

	public static class DummyException extends RuntimeException {
		public DummyException(String _message) { super( _message ); }
	}

	def setup() {
		DefaultPipeline = loadPipelineScriptForTest("vars/java_jenkinsfile.groovy")
	}
	def "isUnittestRequired" () {
		setup:
			DefaultPipeline.getBinding().setVariable( "specs.unitTest.isUnittestRequired", "true" )
		when:
			DefaultPipeline()
		then:
			1 * getPipelineMock("Unittesting.unitTestFunc")( _ as Map )
	}
}
