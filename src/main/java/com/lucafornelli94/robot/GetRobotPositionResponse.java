//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.05.04 alle 05:20:18 PM CEST 
//


package com.lucafornelli94.robot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RobotInfo" type="{http://lucafornelli94.com/robot}RobotInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "robotInfo"
})
@XmlRootElement(name = "GetRobotPositionResponse")
public class GetRobotPositionResponse {

    @XmlElement(name = "RobotInfo", required = true)
    protected RobotInfo robotInfo;

    /**
     * Recupera il valore della proprietà robotInfo.
     * 
     * @return
     *     possible object is
     *     {@link RobotInfo }
     *     
     */
    public RobotInfo getRobotInfo() {
        return robotInfo;
    }

    /**
     * Imposta il valore della proprietà robotInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RobotInfo }
     *     
     */
    public void setRobotInfo(RobotInfo value) {
        this.robotInfo = value;
    }

}
