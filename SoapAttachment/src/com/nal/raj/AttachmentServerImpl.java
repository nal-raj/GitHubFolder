package com.nal.raj;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

//Service Implementation Bean
@MTOM
@WebService(endpointInterface = "com.nal.raj.AttachmentServer")
public class AttachmentServerImpl implements AttachmentServer{

	@Override
	public Image getAttachment() {
		try {
			
			File image = new File("E:\\images\\dload\\AB.jpg");
			return ImageIO.read(image);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			return null; 
			
		}
	}

}