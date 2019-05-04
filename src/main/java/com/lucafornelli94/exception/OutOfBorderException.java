package com.lucafornelli94.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode=FaultCode.CUSTOM, 
	customFaultCode="{http://lucafornelli94.com/robot}001_OUT_OF_BORDER")
public class OutOfBorderException extends RuntimeException{

	private static final long serialVersionUID = 2124837114201695434L;
	
	public OutOfBorderException(String message) {
		super(message);
	}

}
