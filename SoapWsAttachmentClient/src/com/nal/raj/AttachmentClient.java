package com.nal.raj;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.MTOMFeature;
import javax.xml.ws.soap.SOAPBinding;


public class AttachmentClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:8080/ws/attachmentObject?wsdl");
        QName qname = new QName("http://raj.nal.com/", "AttachmentServerImplService");

        Service service = Service.create(url, qname);
        AttachmentServer attachmentServer = service.getPort(AttachmentServer.class);
 
        Attachment attachment = attachmentServer.getAttachment();
        
        String attachmentDetails = attachment.getAttachmentName();
        System.out.println(attachmentDetails);
        Image attchedImage = attachment.getAttachment();
        //display it in frame.............nothing specific to WS
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JLabel label = new JLabel(new ImageIcon(attchedImage));
        frame.add(label);
        frame.setVisible(true);
    }

}