/*
 * XML Type:  StatusType
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.StatusType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput.impl;
/**
 * An XML StatusType(@http://catalist.eai.indosat.com/StandardInputOutput).
 *
 * This is a complex type.
 */
public class StatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.StatusType
{
    
    public StatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "Status");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "ErrorCode");
    private static final javax.xml.namespace.QName ERRORDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "ErrorDescription");
    
    
    /**
     * Gets the "Status" element
     */
    public com.indosat.eai.catalist.standardInputOutput.StatusType.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.indosat.eai.catalist.standardInputOutput.StatusType.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.indosat.eai.catalist.standardInputOutput.StatusType.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.StatusType.Status target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.StatusType.Status)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.indosat.eai.catalist.standardInputOutput.StatusType.Status.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.indosat.eai.catalist.standardInputOutput.StatusType.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.StatusType.Status target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.StatusType.Status)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType.Status)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$2);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORCODE$2);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Gets the "ErrorDescription" element
     */
    public java.lang.String getErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorDescription" element
     */
    public void setErrorDescription(java.lang.String errorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESCRIPTION$4);
            }
            target.setStringValue(errorDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorDescription" element
     */
    public void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESCRIPTION$4);
            }
            target.set(errorDescription);
        }
    }
    /**
     * An XML Status(@http://catalist.eai.indosat.com/StandardInputOutput).
     *
     * This is an atomic type that is a restriction of com.indosat.eai.catalist.standardInputOutput.StatusType$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.indosat.eai.catalist.standardInputOutput.StatusType.Status
    {
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
