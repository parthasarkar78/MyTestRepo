/*
 * XML Type:  DummyOutputType
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyOutputType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput.impl;
/**
 * An XML DummyOutputType(@http://catalist.eai.indosat.com/StandardInputOutput).
 *
 * This is a complex type.
 */
public class DummyOutputTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.DummyOutputType
{
    
    public DummyOutputTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQID$0 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "SEQID");
    
    
    /**
     * Gets the "SEQID" element
     */
    public java.lang.String getSEQID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SEQID" element
     */
    public org.apache.xmlbeans.XmlString xgetSEQID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SEQID" element
     */
    public void setSEQID(java.lang.String seqid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQID$0);
            }
            target.setStringValue(seqid);
        }
    }
    
    /**
     * Sets (as xml) the "SEQID" element
     */
    public void xsetSEQID(org.apache.xmlbeans.XmlString seqid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEQID$0);
            }
            target.set(seqid);
        }
    }
}
