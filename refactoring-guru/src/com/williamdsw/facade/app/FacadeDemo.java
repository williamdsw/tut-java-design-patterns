package com.williamdsw.facade.app;

import java.io.File;

import com.williamdsw.facade.classes.VideoConversionFacade;

public class FacadeDemo {
	
	public static void facadeDemo () {
		String filePath = "test.ogg";
		VideoConversionFacade converter = new VideoConversionFacade ();
		File mp4 = converter.convertVideo (filePath, "mp4");
		File mkv = converter.convertVideo (filePath, "mkv");
	}

}
