import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.xtext.example.mydsl.videoGen.AlternativeVideoSeq;
import org.xtext.example.mydsl.videoGen.MandatoryVideoSeq;
import org.xtext.example.mydsl.videoGen.Media;
import org.xtext.example.mydsl.videoGen.OptionalVideoSeq;
import org.xtext.example.mydsl.videoGen.VideoDescription;
import org.xtext.example.mydsl.videoGen.VideoGeneratorModel;
import org.xtext.example.mydsl.videoGen.VideoSeq;

public class VideoGenTestJava1 {
	
	@Test
	public void testInJava1() {
		
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI("example1.videogen"));
		assertNotNull(videoGen);
		
		System.out.println(videoGen.getInformation().getAuthorName());		
		// and then visit the model
		// eg access video sequences: 
		EList<Media> medias = videoGen.getMedias();
		
		List<List<String>> allConfs = new ArrayList<List<String>>();
		for (Media media : medias) {
			// 
			if (media instanceof VideoSeq) {				
				VideoSeq video = (VideoSeq) media;				
					
					if (video instanceof MandatoryVideoSeq) {
						System.out.println("mandatory " + video);
						String id = ((MandatoryVideoSeq)video).getDescription().getVideoid();
						allConfs = addVideoIdToAllConfigurations(id, allConfs);
					}	
					/*
					if (video instanceof OptionalVideoSeq) {
						for (List<String> partialConf : allConfs) {
							List<String> nPartialConf = new ArrayList<String>();
							nPartialConf.addAll(partialConf);
							nPartialConf.add(((OptionalVideoSeq)video).getDescription().getVideoid()); 
							allConfs.add(nPartialConf);	
						}
					}
					if (video instanceof AlternativeVideoSeq) {
						for (List<String> partialConf : allConfs) {
							 AlternativeVideoSeq alt = (AlternativeVideoSeq) video;
							for (VideoDescription desc : alt.getVideodescs()) {
								List<String> nPartialConf = new ArrayList<String>();
								nPartialConf.addAll(partialConf);
								nPartialConf.add(desc.getVideoid()); 
								allConfs.add(nPartialConf);							
							}
						}
					}*/
				
			}
			
			
		}
		System.out.println("allConfs:" + allConfs);
		assertEquals(4, allConfs.size());
		
	}

	private List<List<String>> addVideoIdToAllConfigurations(String id, List<List<String>> allConfs) {
		
		if (allConfs.isEmpty()) {
			List<String> nPartialConf = new ArrayList<String>();
			nPartialConf.add(id);
			allConfs.add(nPartialConf);
		}
		else {	
			System.out.println("" + allConfs);
			for (List<String> partialConf : allConfs) {
				partialConf.add(id); 
			}	
		}
		List<List<String>> nAllConfs = new ArrayList<List<String>>(allConfs);
		return  nAllConfs;
	}

}
