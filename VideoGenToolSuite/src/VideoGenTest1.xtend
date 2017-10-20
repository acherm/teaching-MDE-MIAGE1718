

import org.junit.Test
import org.eclipse.emf.common.util.URI

import static org.junit.Assert.*

class VideoGenTest1 {


	@Test
	def void testLoadModel() {
		
		val videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI("example1.videogen"))
		assertNotNull(videoGen)
		println(videoGen.information.authorName)		
		// and then visit the model
		// eg access video sequences: videoGen.videoseqs
		
	}
}