

import org.junit.Test
import org.eclipse.emf.common.util.URI

import static org.junit.Assert.*
import org.xtext.example.mydsl.videoGen.MandatoryVideoSeq
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter
import java.io.FileOutputStream
import org.xtext.example.mydsl.videoGen.VideoSeq

class VideoGenTest1 {


	@Test
	def void testLoadModel() {
		
		val videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI("example1.videogen"))
		assertNotNull(videoGen)
		println(videoGen.information.authorName)		
		// and then visit the model
		// eg access video sequences: 
		val playlist = newArrayList()
		videoGen.medias.forEach [media |
			
			if (media instanceof VideoSeq) {			
				val video = (media as VideoSeq)
				
				if (video instanceof MandatoryVideoSeq) {
					val desc =  video.description
					playlist.add("file '" + desc.location + "'")
					
					/* 
					println("Playing... " + desc.videoid)
					var p = Runtime.runtime.exec("/Applications/VLC.app/Contents/MacOS/VLC --play-and-exit --no-repeat --no-loop " + desc.location + "")
					p.waitFor		
					*/			
						
				}			
			}
		]
		
		var playlistStr = ""
		for (String pl : playlist)
			playlistStr += pl + "\n"
		
		writeInFile("playlist.txt", playlistStr)
		
		var Process p 
		var ffmpegCmd = ffmpegConcatenateCommand("/Users/macher1/git/teaching-MDE-MIAGE1718/VideoGenToolSuite/playlist.txt", "ro.mp4").toString 
		println(ffmpegCmd)
		
	 	p = Runtime.runtime.exec(ffmpegCmd)
		p.waitFor
		
		
				
		
	}
	
	def void writeInFile(String filename, String data) {
		val buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "utf-8"))
		try {
			buffer.write(data)
		}
		catch(IOException e) {
			throw e
		}
		finally {
			buffer.flush()
			buffer.close()
		}
	}
	
	def ffmpegConcatenateCommand(String mpegPlaylistFile, String outputPath) '''
		 /usr/local/bin/ffmpeg -y -f concat -safe 0 -i «mpegPlaylistFile» -c copy «outputPath»
	'''
}