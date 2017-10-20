import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.example.mydsl.videoGen.VideoGeneratorModel
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import org.xtext.example.mydsl.VideoGenStandaloneSetup

class VideoGenHelper {
	
	def loadVideoGenerator(URI uri) {
		VideoGenStandaloneSetup::doSetup
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGeneratorModel
	}

	def saveVideoGenerator(URI uri, VideoGeneratorModel videoGen) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(videoGen);
		rs.save(new HashMap());
	}
	
	
}