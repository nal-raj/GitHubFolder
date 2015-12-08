package com.nal.raj;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

@MTOM
@WebService(endpointInterface = "com.nal.raj.AttachmentServer")
public class AttachmentServerImpl implements AttachmentServer{

	@Override
	public Attachment getAttachment() {
		// TODO Auto-generated method stub
		Attachment att= new Attachment();
		File image = new File("E:\\images\\dload\\AB.jpg");
		
		try {
			
			att.setAttachmentName("AttachmentDtails");
			att.setAttachment(ImageIO.read(image));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return att;
	}
}