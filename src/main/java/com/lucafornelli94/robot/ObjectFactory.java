//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.05.04 alle 08:47:56 PM CEST 
//


package com.lucafornelli94.robot;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lucafornelli94.robot
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link RobotInfo }
     * 
     */
    public RobotInfo createRobotInfo() {
        return new RobotInfo();
    }

    /**
     * Create an instance of {@link TurnRightRequest }
     * 
     */
    public TurnRightRequest createTurnRightRequest() {
        return new TurnRightRequest();
    }

    /**
     * Create an instance of {@link GetRobotPositionResponse }
     * 
     */
    public GetRobotPositionResponse createGetRobotPositionResponse() {
        return new GetRobotPositionResponse();
    }

    /**
     * Create an instance of {@link MoveRequest }
     * 
     */
    public MoveRequest createMoveRequest() {
        return new MoveRequest();
    }

    /**
     * Create an instance of {@link TurnLeftResponse }
     * 
     */
    public TurnLeftResponse createTurnLeftResponse() {
        return new TurnLeftResponse();
    }

    /**
     * Create an instance of {@link InitializeRobotPositionResponse }
     * 
     */
    public InitializeRobotPositionResponse createInitializeRobotPositionResponse() {
        return new InitializeRobotPositionResponse();
    }

    /**
     * Create an instance of {@link TurnLeftRequest }
     * 
     */
    public TurnLeftRequest createTurnLeftRequest() {
        return new TurnLeftRequest();
    }

    /**
     * Create an instance of {@link InitializeRobotPositionRequest }
     * 
     */
    public InitializeRobotPositionRequest createInitializeRobotPositionRequest() {
        return new InitializeRobotPositionRequest();
    }

    /**
     * Create an instance of {@link TurnRightResponse }
     * 
     */
    public TurnRightResponse createTurnRightResponse() {
        return new TurnRightResponse();
    }

    /**
     * Create an instance of {@link GetRobotPositionRequest }
     * 
     */
    public GetRobotPositionRequest createGetRobotPositionRequest() {
        return new GetRobotPositionRequest();
    }

}
