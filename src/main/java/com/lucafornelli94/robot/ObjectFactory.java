//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.05.04 alle 06:30:39 PM CEST 
//


package com.lucafornelli94.robot;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lucafornelli94.robot package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRobotPositionRequest_QNAME = new QName("http://lucafornelli94.com/robot", "GetRobotPositionRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lucafornelli94.robot
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRobotPositionResponse }
     * 
     */
    public GetRobotPositionResponse createGetRobotPositionResponse() {
        return new GetRobotPositionResponse();
    }

    /**
     * Create an instance of {@link RobotInfo }
     * 
     */
    public RobotInfo createRobotInfo() {
        return new RobotInfo();
    }

    /**
     * Create an instance of {@link InitializeRobotPositionResponse }
     * 
     */
    public InitializeRobotPositionResponse createInitializeRobotPositionResponse() {
        return new InitializeRobotPositionResponse();
    }

    /**
     * Create an instance of {@link InitializeRobotPositionRequest }
     * 
     */
    public InitializeRobotPositionRequest createInitializeRobotPositionRequest() {
        return new InitializeRobotPositionRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lucafornelli94.com/robot", name = "GetRobotPositionRequest")
    public JAXBElement<Object> createGetRobotPositionRequest(Object value) {
        return new JAXBElement<Object>(_GetRobotPositionRequest_QNAME, Object.class, null, value);
    }

}
