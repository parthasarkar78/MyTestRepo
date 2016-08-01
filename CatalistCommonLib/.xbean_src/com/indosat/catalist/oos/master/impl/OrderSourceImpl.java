/*
 * XML Type:  OrderSource
 * Namespace: http://oos.catalist.indosat.com/Master
 * Java type: com.indosat.catalist.oos.master.OrderSource
 *
 * Automatically generated - do not modify.
 */
package com.indosat.catalist.oos.master.impl;
/**
 * An XML OrderSource(@http://oos.catalist.indosat.com/Master).
 *
 * This is a complex type.
 */
public class OrderSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.catalist.oos.master.OrderSource
{
    
    public OrderSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCENAME$0 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "SourceName");
    private static final javax.xml.namespace.QName CLASSNAME$2 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "ClassName");
    
    
    /**
     * Gets the "SourceName" element
     */
    public java.lang.String getSourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceName" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceName" element
     */
    public void setSourceName(java.lang.String sourceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCENAME$0);
            }
            target.setStringValue(sourceName);
        }
    }
    
    /**
     * Sets (as xml) the "SourceName" element
     */
    public void xsetSourceName(org.apache.xmlbeans.XmlString sourceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCENAME$0);
            }
            target.set(sourceName);
        }
    }
    
    /**
     * Gets the "ClassName" element
     */
    public java.lang.String getClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClassName" element
     */
    public org.apache.xmlbeans.XmlString xgetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClassName" element
     */
    public void setClassName(java.lang.String className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$2);
            }
            target.setStringValue(className);
        }
    }
    
    /**
     * Sets (as xml) the "ClassName" element
     */
    public void xsetClassName(org.apache.xmlbeans.XmlString className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$2);
            }
            target.set(className);
        }
    }
}
