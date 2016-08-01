/*
 * XML Type:  OOSOrderLineItemType
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OOSOrderLineItemType
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order.impl;
/**
 * An XML OOSOrderLineItemType(@http://oms.catalist.isat.com/order).
 *
 * This is a complex type.
 */
public class OOSOrderLineItemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OOSOrderLineItemType
{
    
    public OOSOrderLineItemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERID$0 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "orderID");
    private static final javax.xml.namespace.QName LINEID$2 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "lineID");
    private static final javax.xml.namespace.QName REFID$4 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "refID");
    private static final javax.xml.namespace.QName SERVICEID$6 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "serviceID");
    private static final javax.xml.namespace.QName STARTEXECDATE$8 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "startExecDate");
    private static final javax.xml.namespace.QName ENDEXECDATE$10 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "endExecDate");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "status");
    private static final javax.xml.namespace.QName NOTES$14 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "notes");
    private static final javax.xml.namespace.QName PARAMETERS$16 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "parameters");
    private static final javax.xml.namespace.QName HASOUTPUT$18 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "hasOutput");
    private static final javax.xml.namespace.QName RPARAMETERS$20 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "rParameters");
    private static final javax.xml.namespace.QName AUTOGENERATE$22 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "autoGenerate");
    private static final javax.xml.namespace.QName RETRYATTEMPT$24 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "retryAttempt");
    private static final javax.xml.namespace.QName DEPENDLINEID$26 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "dependLineID");
    private static final javax.xml.namespace.QName MAPPINGFIELDS$28 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "mappingFields");
    
    
    /**
     * Gets the "orderID" element
     */
    public int getOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderID" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orderID" element
     */
    public void setOrderID(int orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$0);
            }
            target.setIntValue(orderID);
        }
    }
    
    /**
     * Sets (as xml) the "orderID" element
     */
    public void xsetOrderID(org.apache.xmlbeans.XmlInt orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDERID$0);
            }
            target.set(orderID);
        }
    }
    
    /**
     * Gets the "lineID" element
     */
    public int getLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lineID" element
     */
    public org.apache.xmlbeans.XmlInt xgetLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LINEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lineID" element
     */
    public void setLineID(int lineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINEID$2);
            }
            target.setIntValue(lineID);
        }
    }
    
    /**
     * Sets (as xml) the "lineID" element
     */
    public void xsetLineID(org.apache.xmlbeans.XmlInt lineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LINEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LINEID$2);
            }
            target.set(lineID);
        }
    }
    
    /**
     * Gets the "refID" element
     */
    public java.lang.String getRefID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "refID" element
     */
    public org.apache.xmlbeans.XmlString xgetRefID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "refID" element
     */
    public void setRefID(java.lang.String refID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFID$4);
            }
            target.setStringValue(refID);
        }
    }
    
    /**
     * Sets (as xml) the "refID" element
     */
    public void xsetRefID(org.apache.xmlbeans.XmlString refID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFID$4);
            }
            target.set(refID);
        }
    }
    
    /**
     * Gets the "serviceID" element
     */
    public java.lang.String getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceID" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "serviceID" element
     */
    public void setServiceID(java.lang.String serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$6);
            }
            target.setStringValue(serviceID);
        }
    }
    
    /**
     * Sets (as xml) the "serviceID" element
     */
    public void xsetServiceID(org.apache.xmlbeans.XmlString serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEID$6);
            }
            target.set(serviceID);
        }
    }
    
    /**
     * Gets the "startExecDate" element
     */
    public java.util.Calendar getStartExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTEXECDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startExecDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetStartExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTEXECDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startExecDate" element
     */
    public void setStartExecDate(java.util.Calendar startExecDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTEXECDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTEXECDATE$8);
            }
            target.setCalendarValue(startExecDate);
        }
    }
    
    /**
     * Sets (as xml) the "startExecDate" element
     */
    public void xsetStartExecDate(org.apache.xmlbeans.XmlDate startExecDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTEXECDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTEXECDATE$8);
            }
            target.set(startExecDate);
        }
    }
    
    /**
     * Gets the "endExecDate" element
     */
    public java.util.Calendar getEndExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDEXECDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endExecDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetEndExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDEXECDATE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endExecDate" element
     */
    public void setEndExecDate(java.util.Calendar endExecDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDEXECDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDEXECDATE$10);
            }
            target.setCalendarValue(endExecDate);
        }
    }
    
    /**
     * Sets (as xml) the "endExecDate" element
     */
    public void xsetEndExecDate(org.apache.xmlbeans.XmlDate endExecDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDEXECDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDEXECDATE$10);
            }
            target.set(endExecDate);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public int getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlInt xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(int status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$12);
            }
            target.setIntValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlInt status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATUS$12);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "notes" element
     */
    public java.lang.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "notes" element
     */
    public org.apache.xmlbeans.XmlString xgetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(java.lang.String notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$14);
            }
            target.setStringValue(notes);
        }
    }
    
    /**
     * Sets (as xml) the "notes" element
     */
    public void xsetNotes(org.apache.xmlbeans.XmlString notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$14);
            }
            target.set(notes);
        }
    }
    
    /**
     * Gets a List of "parameters" elements
     */
    public java.util.List<com.isat.catalist.oms.order.OOSOrderLineItemParamType> getParametersList()
    {
        final class ParametersList extends java.util.AbstractList<com.isat.catalist.oms.order.OOSOrderLineItemParamType>
        {
            public com.isat.catalist.oms.order.OOSOrderLineItemParamType get(int i)
                { return OOSOrderLineItemTypeImpl.this.getParametersArray(i); }
            
            public com.isat.catalist.oms.order.OOSOrderLineItemParamType set(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType o)
            {
                com.isat.catalist.oms.order.OOSOrderLineItemParamType old = OOSOrderLineItemTypeImpl.this.getParametersArray(i);
                OOSOrderLineItemTypeImpl.this.setParametersArray(i, o);
                return old;
            }
            
            public void add(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType o)
                { OOSOrderLineItemTypeImpl.this.insertNewParameters(i).set(o); }
            
            public com.isat.catalist.oms.order.OOSOrderLineItemParamType remove(int i)
            {
                com.isat.catalist.oms.order.OOSOrderLineItemParamType old = OOSOrderLineItemTypeImpl.this.getParametersArray(i);
                OOSOrderLineItemTypeImpl.this.removeParameters(i);
                return old;
            }
            
            public int size()
                { return OOSOrderLineItemTypeImpl.this.sizeOfParametersArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParametersList();
        }
    }
    
    /**
     * Gets array of all "parameters" elements
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType[] getParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERS$16, targetList);
            com.isat.catalist.oms.order.OOSOrderLineItemParamType[] result = new com.isat.catalist.oms.order.OOSOrderLineItemParamType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameters" element
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType getParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().find_element_user(PARAMETERS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameters" element
     */
    public int sizeOfParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$16);
        }
    }
    
    /**
     * Sets array of all "parameters" element
     */
    public void setParametersArray(com.isat.catalist.oms.order.OOSOrderLineItemParamType[] parametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parametersArray, PARAMETERS$16);
        }
    }
    
    /**
     * Sets ith "parameters" element
     */
    public void setParametersArray(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().find_element_user(PARAMETERS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameters" element
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType insertNewParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().insert_element_user(PARAMETERS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameters" element
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().add_element_user(PARAMETERS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameters" element
     */
    public void removeParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$16, i);
        }
    }
    
    /**
     * Gets the "hasOutput" element
     */
    public boolean getHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hasOutput" element
     */
    public void setHasOutput(boolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASOUTPUT$18);
            }
            target.setBooleanValue(hasOutput);
        }
    }
    
    /**
     * Sets (as xml) the "hasOutput" element
     */
    public void xsetHasOutput(org.apache.xmlbeans.XmlBoolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASOUTPUT$18);
            }
            target.set(hasOutput);
        }
    }
    
    /**
     * Gets a List of "rParameters" elements
     */
    public java.util.List<com.isat.catalist.oms.order.OOSOrderLineItemParamType> getRParametersList()
    {
        final class RParametersList extends java.util.AbstractList<com.isat.catalist.oms.order.OOSOrderLineItemParamType>
        {
            public com.isat.catalist.oms.order.OOSOrderLineItemParamType get(int i)
                { return OOSOrderLineItemTypeImpl.this.getRParametersArray(i); }
            
            public com.isat.catalist.oms.order.OOSOrderLineItemParamType set(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType o)
            {
                com.isat.catalist.oms.order.OOSOrderLineItemParamType old = OOSOrderLineItemTypeImpl.this.getRParametersArray(i);
                OOSOrderLineItemTypeImpl.this.setRParametersArray(i, o);
                return old;
            }
            
            public void add(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType o)
                { OOSOrderLineItemTypeImpl.this.insertNewRParameters(i).set(o); }
            
            public com.isat.catalist.oms.order.OOSOrderLineItemParamType remove(int i)
            {
                com.isat.catalist.oms.order.OOSOrderLineItemParamType old = OOSOrderLineItemTypeImpl.this.getRParametersArray(i);
                OOSOrderLineItemTypeImpl.this.removeRParameters(i);
                return old;
            }
            
            public int size()
                { return OOSOrderLineItemTypeImpl.this.sizeOfRParametersArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RParametersList();
        }
    }
    
    /**
     * Gets array of all "rParameters" elements
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType[] getRParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RPARAMETERS$20, targetList);
            com.isat.catalist.oms.order.OOSOrderLineItemParamType[] result = new com.isat.catalist.oms.order.OOSOrderLineItemParamType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rParameters" element
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType getRParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().find_element_user(RPARAMETERS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rParameters" element
     */
    public int sizeOfRParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPARAMETERS$20);
        }
    }
    
    /**
     * Sets array of all "rParameters" element
     */
    public void setRParametersArray(com.isat.catalist.oms.order.OOSOrderLineItemParamType[] rParametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rParametersArray, RPARAMETERS$20);
        }
    }
    
    /**
     * Sets ith "rParameters" element
     */
    public void setRParametersArray(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType rParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().find_element_user(RPARAMETERS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rParameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rParameters" element
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType insertNewRParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().insert_element_user(RPARAMETERS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rParameters" element
     */
    public com.isat.catalist.oms.order.OOSOrderLineItemParamType addNewRParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OOSOrderLineItemParamType target = null;
            target = (com.isat.catalist.oms.order.OOSOrderLineItemParamType)get_store().add_element_user(RPARAMETERS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "rParameters" element
     */
    public void removeRParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPARAMETERS$20, i);
        }
    }
    
    /**
     * Gets the "autoGenerate" element
     */
    public boolean getAutoGenerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOGENERATE$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoGenerate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoGenerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOGENERATE$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "autoGenerate" element
     */
    public void setAutoGenerate(boolean autoGenerate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOGENERATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOGENERATE$22);
            }
            target.setBooleanValue(autoGenerate);
        }
    }
    
    /**
     * Sets (as xml) the "autoGenerate" element
     */
    public void xsetAutoGenerate(org.apache.xmlbeans.XmlBoolean autoGenerate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOGENERATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOGENERATE$22);
            }
            target.set(autoGenerate);
        }
    }
    
    /**
     * Gets the "retryAttempt" element
     */
    public int getRetryAttempt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYATTEMPT$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "retryAttempt" element
     */
    public org.apache.xmlbeans.XmlInt xgetRetryAttempt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRYATTEMPT$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "retryAttempt" element
     */
    public void setRetryAttempt(int retryAttempt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYATTEMPT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRYATTEMPT$24);
            }
            target.setIntValue(retryAttempt);
        }
    }
    
    /**
     * Sets (as xml) the "retryAttempt" element
     */
    public void xsetRetryAttempt(org.apache.xmlbeans.XmlInt retryAttempt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRYATTEMPT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETRYATTEMPT$24);
            }
            target.set(retryAttempt);
        }
    }
    
    /**
     * Gets a List of "dependLineID" elements
     */
    public java.util.List<java.lang.Integer> getDependLineIDList()
    {
        final class DependLineIDList extends java.util.AbstractList<java.lang.Integer>
        {
            public java.lang.Integer get(int i)
                { return OOSOrderLineItemTypeImpl.this.getDependLineIDArray(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = OOSOrderLineItemTypeImpl.this.getDependLineIDArray(i);
                OOSOrderLineItemTypeImpl.this.setDependLineIDArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { OOSOrderLineItemTypeImpl.this.insertDependLineID(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = OOSOrderLineItemTypeImpl.this.getDependLineIDArray(i);
                OOSOrderLineItemTypeImpl.this.removeDependLineID(i);
                return old;
            }
            
            public int size()
                { return OOSOrderLineItemTypeImpl.this.sizeOfDependLineIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DependLineIDList();
        }
    }
    
    /**
     * Gets array of all "dependLineID" elements
     */
    public int[] getDependLineIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDLINEID$26, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dependLineID" element
     */
    public int getDependLineIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDLINEID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "dependLineID" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlInt> xgetDependLineIDList()
    {
        final class DependLineIDList extends java.util.AbstractList<org.apache.xmlbeans.XmlInt>
        {
            public org.apache.xmlbeans.XmlInt get(int i)
                { return OOSOrderLineItemTypeImpl.this.xgetDependLineIDArray(i); }
            
            public org.apache.xmlbeans.XmlInt set(int i, org.apache.xmlbeans.XmlInt o)
            {
                org.apache.xmlbeans.XmlInt old = OOSOrderLineItemTypeImpl.this.xgetDependLineIDArray(i);
                OOSOrderLineItemTypeImpl.this.xsetDependLineIDArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlInt o)
                { OOSOrderLineItemTypeImpl.this.insertNewDependLineID(i).set(o); }
            
            public org.apache.xmlbeans.XmlInt remove(int i)
            {
                org.apache.xmlbeans.XmlInt old = OOSOrderLineItemTypeImpl.this.xgetDependLineIDArray(i);
                OOSOrderLineItemTypeImpl.this.removeDependLineID(i);
                return old;
            }
            
            public int size()
                { return OOSOrderLineItemTypeImpl.this.sizeOfDependLineIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DependLineIDList();
        }
    }
    
    /**
     * Gets (as xml) array of all "dependLineID" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetDependLineIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDLINEID$26, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dependLineID" element
     */
    public org.apache.xmlbeans.XmlInt xgetDependLineIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPENDLINEID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "dependLineID" element
     */
    public int sizeOfDependLineIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDLINEID$26);
        }
    }
    
    /**
     * Sets array of all "dependLineID" element
     */
    public void setDependLineIDArray(int[] dependLineIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dependLineIDArray, DEPENDLINEID$26);
        }
    }
    
    /**
     * Sets ith "dependLineID" element
     */
    public void setDependLineIDArray(int i, int dependLineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDLINEID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(dependLineID);
        }
    }
    
    /**
     * Sets (as xml) array of all "dependLineID" element
     */
    public void xsetDependLineIDArray(org.apache.xmlbeans.XmlInt[]dependLineIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dependLineIDArray, DEPENDLINEID$26);
        }
    }
    
    /**
     * Sets (as xml) ith "dependLineID" element
     */
    public void xsetDependLineIDArray(int i, org.apache.xmlbeans.XmlInt dependLineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPENDLINEID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dependLineID);
        }
    }
    
    /**
     * Inserts the value as the ith "dependLineID" element
     */
    public void insertDependLineID(int i, int dependLineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DEPENDLINEID$26, i);
            target.setIntValue(dependLineID);
        }
    }
    
    /**
     * Appends the value as the last "dependLineID" element
     */
    public void addDependLineID(int dependLineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPENDLINEID$26);
            target.setIntValue(dependLineID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependLineID" element
     */
    public org.apache.xmlbeans.XmlInt insertNewDependLineID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(DEPENDLINEID$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependLineID" element
     */
    public org.apache.xmlbeans.XmlInt addNewDependLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPENDLINEID$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "dependLineID" element
     */
    public void removeDependLineID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDLINEID$26, i);
        }
    }
    
    /**
     * Gets a List of "mappingFields" elements
     */
    public java.util.List<java.lang.String> getMappingFieldsList()
    {
        final class MappingFieldsList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return OOSOrderLineItemTypeImpl.this.getMappingFieldsArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = OOSOrderLineItemTypeImpl.this.getMappingFieldsArray(i);
                OOSOrderLineItemTypeImpl.this.setMappingFieldsArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { OOSOrderLineItemTypeImpl.this.insertMappingFields(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = OOSOrderLineItemTypeImpl.this.getMappingFieldsArray(i);
                OOSOrderLineItemTypeImpl.this.removeMappingFields(i);
                return old;
            }
            
            public int size()
                { return OOSOrderLineItemTypeImpl.this.sizeOfMappingFieldsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MappingFieldsList();
        }
    }
    
    /**
     * Gets array of all "mappingFields" elements
     */
    public java.lang.String[] getMappingFieldsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPPINGFIELDS$28, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "mappingFields" element
     */
    public java.lang.String getMappingFieldsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPINGFIELDS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "mappingFields" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetMappingFieldsList()
    {
        final class MappingFieldsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return OOSOrderLineItemTypeImpl.this.xgetMappingFieldsArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderLineItemTypeImpl.this.xgetMappingFieldsArray(i);
                OOSOrderLineItemTypeImpl.this.xsetMappingFieldsArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { OOSOrderLineItemTypeImpl.this.insertNewMappingFields(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderLineItemTypeImpl.this.xgetMappingFieldsArray(i);
                OOSOrderLineItemTypeImpl.this.removeMappingFields(i);
                return old;
            }
            
            public int size()
                { return OOSOrderLineItemTypeImpl.this.sizeOfMappingFieldsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MappingFieldsList();
        }
    }
    
    /**
     * Gets (as xml) array of all "mappingFields" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMappingFieldsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPPINGFIELDS$28, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "mappingFields" element
     */
    public org.apache.xmlbeans.XmlString xgetMappingFieldsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGFIELDS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "mappingFields" element
     */
    public int sizeOfMappingFieldsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPINGFIELDS$28);
        }
    }
    
    /**
     * Sets array of all "mappingFields" element
     */
    public void setMappingFieldsArray(java.lang.String[] mappingFieldsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mappingFieldsArray, MAPPINGFIELDS$28);
        }
    }
    
    /**
     * Sets ith "mappingFields" element
     */
    public void setMappingFieldsArray(int i, java.lang.String mappingFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPINGFIELDS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(mappingFields);
        }
    }
    
    /**
     * Sets (as xml) array of all "mappingFields" element
     */
    public void xsetMappingFieldsArray(org.apache.xmlbeans.XmlString[]mappingFieldsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mappingFieldsArray, MAPPINGFIELDS$28);
        }
    }
    
    /**
     * Sets (as xml) ith "mappingFields" element
     */
    public void xsetMappingFieldsArray(int i, org.apache.xmlbeans.XmlString mappingFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGFIELDS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mappingFields);
        }
    }
    
    /**
     * Inserts the value as the ith "mappingFields" element
     */
    public void insertMappingFields(int i, java.lang.String mappingFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MAPPINGFIELDS$28, i);
            target.setStringValue(mappingFields);
        }
    }
    
    /**
     * Appends the value as the last "mappingFields" element
     */
    public void addMappingFields(java.lang.String mappingFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPPINGFIELDS$28);
            target.setStringValue(mappingFields);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mappingFields" element
     */
    public org.apache.xmlbeans.XmlString insertNewMappingFields(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MAPPINGFIELDS$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mappingFields" element
     */
    public org.apache.xmlbeans.XmlString addNewMappingFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPPINGFIELDS$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "mappingFields" element
     */
    public void removeMappingFields(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPINGFIELDS$28, i);
        }
    }
}
