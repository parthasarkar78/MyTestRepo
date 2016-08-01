/*
 * XML Type:  DummyInputType
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyInputType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput.impl;
/**
 * An XML DummyInputType(@http://catalist.eai.indosat.com/StandardInputOutput).
 *
 * This is a complex type.
 */
public class DummyInputTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.DummyInputType
{
    
    public DummyInputTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MSISDN$0 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "MSISDN");
    private static final javax.xml.namespace.QName ICCID$2 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "ICCID");
    private static final javax.xml.namespace.QName IMSI$4 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "IMSI");
    
    
    /**
     * Gets the "MSISDN" element
     */
    public java.lang.String getMSISDN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSISDN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MSISDN" element
     */
    public org.apache.xmlbeans.XmlString xgetMSISDN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSISDN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MSISDN" element
     */
    public void setMSISDN(java.lang.String msisdn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSISDN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSISDN$0);
            }
            target.setStringValue(msisdn);
        }
    }
    
    /**
     * Sets (as xml) the "MSISDN" element
     */
    public void xsetMSISDN(org.apache.xmlbeans.XmlString msisdn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSISDN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MSISDN$0);
            }
            target.set(msisdn);
        }
    }
    
    /**
     * Gets the "ICCID" element
     */
    public java.lang.String getICCID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICCID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ICCID" element
     */
    public org.apache.xmlbeans.XmlString xgetICCID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICCID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ICCID" element
     */
    public void setICCID(java.lang.String iccid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICCID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICCID$2);
            }
            target.setStringValue(iccid);
        }
    }
    
    /**
     * Sets (as xml) the "ICCID" element
     */
    public void xsetICCID(org.apache.xmlbeans.XmlString iccid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICCID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICCID$2);
            }
            target.set(iccid);
        }
    }
    
    /**
     * Gets the "IMSI" element
     */
    public java.lang.String getIMSI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMSI$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IMSI" element
     */
    public org.apache.xmlbeans.XmlString xgetIMSI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMSI$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IMSI" element
     */
    public void setIMSI(java.lang.String imsi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMSI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMSI$4);
            }
            target.setStringValue(imsi);
        }
    }
    
    /**
     * Sets (as xml) the "IMSI" element
     */
    public void xsetIMSI(org.apache.xmlbeans.XmlString imsi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMSI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMSI$4);
            }
            target.set(imsi);
        }
    }
}
