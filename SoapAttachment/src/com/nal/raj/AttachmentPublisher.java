package com.nal.raj;

import javax.xml.ws.Endpoint;
import com.nal.raj.AttachmentServerImpl;


public class AttachmentPublisher{
	
    public static void main(String[] args) {
		
	Endpoint.publish("http://localhost:8080/ws/attachment", new AttachmentServerImpl());
		
	System.out.println("Server is published!");
	   
    }

}