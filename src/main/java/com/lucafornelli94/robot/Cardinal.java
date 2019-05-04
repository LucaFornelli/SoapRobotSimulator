//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.05.04 alle 08:47:56 PM CEST 
//


package com.lucafornelli94.robot;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Cardinal.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Cardinal">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORTH"/>
 *     &lt;enumeration value="SOUTH"/>
 *     &lt;enumeration value="WEST"/>
 *     &lt;enumeration value="EAST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Cardinal")
@XmlEnum
public enum Cardinal {

    NORTH,
    SOUTH,
    WEST,
    EAST;

    public String value() {
        return name();
    }

    public static Cardinal fromValue(String v) {
        return valueOf(v);
    }

}
