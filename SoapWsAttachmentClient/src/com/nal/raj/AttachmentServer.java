
package com.nal.raj;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AttachmentServer", targetNamespace = "http://raj.nal.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AttachmentServer {


    /**
     * 
     * @return
     *     returns com.nal.raj.Attachment
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://raj.nal.com/AttachmentServer/getAttachmentRequest", output = "http://raj.nal.com/AttachmentServer/getAttachmentResponse")
    public Attachment getAttachment();

}
