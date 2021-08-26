import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class JavaJenkinsfile extends JenkinsPipelineSpecification {

	def DefaultPipeline = null
  def specs = [unitTest[isUnittestRequired: true]]

	public static class DummyException extends RuntimeException {
		public DummyException(String _message) { super( _message ); }
	}


	def "Does NOT attempt to deploy non-MASTER branch PRODUCTION" () {
		setup:
			DefaultPipeline.getBinding().setVariable( "unitTest.isUnittestRequired", "true" )
		when:
			DefaultPipeline()
		then:
			0 * getPipelineMock("ciFunc.unittest.call")(specs)
	}
}
