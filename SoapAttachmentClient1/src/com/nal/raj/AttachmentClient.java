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
	   
	URL url = new URL("http://localhost:8080/ws/attachment?wsdl");
        QName qname = new QName("http://raj.nal.com/", "AttachmentServerImplService");

        Service service = Service.create(url, qname);
        AttachmentServer attachmentServer = service.getPort(AttachmentServer.class);
 
        
        Image image = attachmentServer.getAttachment();
                
        //display it in frame.............nothing specific to WS
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }

}