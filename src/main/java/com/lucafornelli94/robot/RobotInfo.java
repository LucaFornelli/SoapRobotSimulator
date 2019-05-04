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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RobotInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RobotInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="facing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RobotInfo", propOrder = {
    "id",
    "xPosition",
    "yPosition",
    "width",
    "height",
    "facing"
})
public class RobotInfo {

    protected int id;
    protected int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    @XmlElement(required = true)
    protected String facing;

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà xPosition.
     * 
     */
    public int getXPosition() {
        return xPosition;
    }

    /**
     * Imposta il valore della proprietà xPosition.
     * 
     */
    public void setXPosition(int value) {
        this.xPosition = value;
    }

    /**
     * Recupera il valore della proprietà yPosition.
     * 
     */
    public int getYPosition() {
        return yPosition;
    }

    /**
     * Imposta il valore della proprietà yPosition.
     * 
     */
    public void setYPosition(int value) {
        this.yPosition = value;
    }

    /**
     * Recupera il valore della proprietà width.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Imposta il valore della proprietà width.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà facing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacing() {
        return facing;
    }

    /**
     * Imposta il valore della proprietà facing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacing(String value) {
        this.facing = value;
    }

}
