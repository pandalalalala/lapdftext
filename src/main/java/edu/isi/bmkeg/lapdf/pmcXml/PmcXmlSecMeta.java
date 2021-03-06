//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}contrib-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}kwd-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}permissions" minOccurs="0"/>
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
    "contribGroups",
    "kwdGroups",
    "permissions"
})
@XmlRootElement(name = "sec-meta")
public class PmcXmlSecMeta {

    @XmlElement(name = "contrib-group")
    protected List<PmcXmlContribGroup> contribGroups;
    @XmlElement(name = "kwd-group")
    protected List<PmcXmlKwdGroup> kwdGroups;
    protected PmcXmlPermissions permissions;

    /**
     * Gets the value of the contribGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contribGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlContribGroup }
     * 
     * 
     */
    public List<PmcXmlContribGroup> getContribGroups() {
        if (contribGroups == null) {
            contribGroups = new ArrayList<PmcXmlContribGroup>();
        }
        return this.contribGroups;
    }

    /**
     * Gets the value of the kwdGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kwdGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKwdGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlKwdGroup }
     * 
     * 
     */
    public List<PmcXmlKwdGroup> getKwdGroups() {
        if (kwdGroups == null) {
            kwdGroups = new ArrayList<PmcXmlKwdGroup>();
        }
        return this.kwdGroups;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlPermissions }
     *     
     */
    public PmcXmlPermissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlPermissions }
     *     
     */
    public void setPermissions(PmcXmlPermissions value) {
        this.permissions = value;
    }

}
