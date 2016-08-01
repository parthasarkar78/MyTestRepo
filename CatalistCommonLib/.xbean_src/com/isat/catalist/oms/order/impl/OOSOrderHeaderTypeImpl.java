/*
 * XML Type:  OOSOrderHeaderType
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OOSOrderHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order.impl;
/**
 * An XML OOSOrderHeaderType(@http://oms.catalist.isat.com/order).
 *
 * This is a complex type.
 */
public class OOSOrderHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OOSOrderHeaderType
{
    
    public OOSOrderHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "ID");
    private static final javax.xml.namespace.QName ORDERTYPE$2 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "orderType");
    private static final javax.xml.namespace.QName CHANNEL$4 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "channel");
    private static final javax.xml.namespace.QName SOURCE$6 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "source");
    private static final javax.xml.namespace.QName USERCREATE$8 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "userCreate");
    private static final javax.xml.namespace.QName KEY1$10 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "key1");
    private static final javax.xml.namespace.QName KEY2$12 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "key2");
    private static final javax.xml.namespace.QName KEY3$14 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "key3");
    private static final javax.xml.namespace.QName REFID$16 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "refID");
    private static final javax.xml.namespace.QName EXECDATE$18 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "execDate");
    private static final javax.xml.namespace.QName STARTEXECDATE$20 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "startExecDate");
    private static final javax.xml.namespace.QName ENDEXECDATE$22 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "endExecDate");
    private static final javax.xml.namespace.QName RESPONDED$24 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "responded");
    private static final javax.xml.namespace.QName STATUS$26 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "status");
    private static final javax.xml.namespace.QName STATUSERRORCODE$28 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "statusErrorCode");
    private static final javax.xml.namespace.QName STATUSERRORDESCRIPTION$30 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "statusErrorDescription");
    private static final javax.xml.namespace.QName DPDORDERID$32 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "dpdOrderID");
    private static final javax.xml.namespace.QName RESUBMITATTEMPT$34 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "resubmitAttempt");
    private static final javax.xml.namespace.QName ADDITIONALFIELD1$36 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "additionalField1");
    private static final javax.xml.namespace.QName ADDITIONALFIELD2$38 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "additionalField2");
    private static final javax.xml.namespace.QName ADDITIONALFIELD3$40 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "additionalField3");
    private static final javax.xml.namespace.QName ORDERDATE$42 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "orderDate");
    
    
    /**
     * Gets the "ID" element
     */
    public int getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "orderType" element
     */
    public java.lang.String getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderType" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orderType" element
     */
    public void setOrderType(java.lang.String orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$2);
            }
            target.setStringValue(orderType);
        }
    }
    
    /**
     * Sets (as xml) the "orderType" element
     */
    public void xsetOrderType(org.apache.xmlbeans.XmlString orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERTYPE$2);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Gets the "channel" element
     */
    public java.lang.String getChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "channel" element
     */
    public org.apache.xmlbeans.XmlString xgetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "channel" element
     */
    public void setChannel(java.lang.String channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNEL$4);
            }
            target.setStringValue(channel);
        }
    }
    
    /**
     * Sets (as xml) the "channel" element
     */
    public void xsetChannel(org.apache.xmlbeans.XmlString channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANNEL$4);
            }
            target.set(channel);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$6);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$6);
            }
            target.set(source);
        }
    }
    
    /**
     * Gets the "userCreate" element
     */
    public java.lang.String getUserCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERCREATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userCreate" element
     */
    public org.apache.xmlbeans.XmlString xgetUserCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERCREATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userCreate" element
     */
    public void setUserCreate(java.lang.String userCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERCREATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERCREATE$8);
            }
            target.setStringValue(userCreate);
        }
    }
    
    /**
     * Sets (as xml) the "userCreate" element
     */
    public void xsetUserCreate(org.apache.xmlbeans.XmlString userCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERCREATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERCREATE$8);
            }
            target.set(userCreate);
        }
    }
    
    /**
     * Gets the "key1" element
     */
    public java.lang.String getKey1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY1$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key1" element
     */
    public org.apache.xmlbeans.XmlString xgetKey1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY1$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "key1" element
     */
    public void setKey1(java.lang.String key1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY1$10);
            }
            target.setStringValue(key1);
        }
    }
    
    /**
     * Sets (as xml) the "key1" element
     */
    public void xsetKey1(org.apache.xmlbeans.XmlString key1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY1$10);
            }
            target.set(key1);
        }
    }
    
    /**
     * Gets the "key2" element
     */
    public java.lang.String getKey2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY2$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key2" element
     */
    public org.apache.xmlbeans.XmlString xgetKey2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY2$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "key2" element
     */
    public void setKey2(java.lang.String key2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY2$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY2$12);
            }
            target.setStringValue(key2);
        }
    }
    
    /**
     * Sets (as xml) the "key2" element
     */
    public void xsetKey2(org.apache.xmlbeans.XmlString key2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY2$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY2$12);
            }
            target.set(key2);
        }
    }
    
    /**
     * Gets the "key3" element
     */
    public java.lang.String getKey3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY3$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key3" element
     */
    public org.apache.xmlbeans.XmlString xgetKey3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY3$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "key3" element
     */
    public void setKey3(java.lang.String key3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY3$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY3$14);
            }
            target.setStringValue(key3);
        }
    }
    
    /**
     * Sets (as xml) the "key3" element
     */
    public void xsetKey3(org.apache.xmlbeans.XmlString key3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY3$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY3$14);
            }
            target.set(key3);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFID$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFID$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFID$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFID$16);
            }
            target.set(refID);
        }
    }
    
    /**
     * Gets the "execDate" element
     */
    public java.util.Calendar getExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "execDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXECDATE$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "execDate" element
     */
    public void setExecDate(java.util.Calendar execDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECDATE$18);
            }
            target.setCalendarValue(execDate);
        }
    }
    
    /**
     * Sets (as xml) the "execDate" element
     */
    public void xsetExecDate(org.apache.xmlbeans.XmlDateTime execDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXECDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXECDATE$18);
            }
            target.set(execDate);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTEXECDATE$20, 0);
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
    public org.apache.xmlbeans.XmlDateTime xgetStartExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTEXECDATE$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTEXECDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTEXECDATE$20);
            }
            target.setCalendarValue(startExecDate);
        }
    }
    
    /**
     * Sets (as xml) the "startExecDate" element
     */
    public void xsetStartExecDate(org.apache.xmlbeans.XmlDateTime startExecDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTEXECDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTEXECDATE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDEXECDATE$22, 0);
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
    public org.apache.xmlbeans.XmlDateTime xgetEndExecDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDEXECDATE$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDEXECDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDEXECDATE$22);
            }
            target.setCalendarValue(endExecDate);
        }
    }
    
    /**
     * Sets (as xml) the "endExecDate" element
     */
    public void xsetEndExecDate(org.apache.xmlbeans.XmlDateTime endExecDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDEXECDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDEXECDATE$22);
            }
            target.set(endExecDate);
        }
    }
    
    /**
     * Gets the "responded" element
     */
    public boolean getResponded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONDED$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "responded" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetResponded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESPONDED$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "responded" element
     */
    public void setResponded(boolean responded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONDED$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONDED$24);
            }
            target.setBooleanValue(responded);
        }
    }
    
    /**
     * Sets (as xml) the "responded" element
     */
    public void xsetResponded(org.apache.xmlbeans.XmlBoolean responded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESPONDED$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESPONDED$24);
            }
            target.set(responded);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$26, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$26);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATUS$26);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "statusErrorCode" element
     */
    public java.lang.String getStatusErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSERRORCODE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusErrorCode" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSERRORCODE$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "statusErrorCode" element
     */
    public void setStatusErrorCode(java.lang.String statusErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSERRORCODE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSERRORCODE$28);
            }
            target.setStringValue(statusErrorCode);
        }
    }
    
    /**
     * Sets (as xml) the "statusErrorCode" element
     */
    public void xsetStatusErrorCode(org.apache.xmlbeans.XmlString statusErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSERRORCODE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSERRORCODE$28);
            }
            target.set(statusErrorCode);
        }
    }
    
    /**
     * Gets the "statusErrorDescription" element
     */
    public java.lang.String getStatusErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSERRORDESCRIPTION$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusErrorDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSERRORDESCRIPTION$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "statusErrorDescription" element
     */
    public void setStatusErrorDescription(java.lang.String statusErrorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSERRORDESCRIPTION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSERRORDESCRIPTION$30);
            }
            target.setStringValue(statusErrorDescription);
        }
    }
    
    /**
     * Sets (as xml) the "statusErrorDescription" element
     */
    public void xsetStatusErrorDescription(org.apache.xmlbeans.XmlString statusErrorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSERRORDESCRIPTION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSERRORDESCRIPTION$30);
            }
            target.set(statusErrorDescription);
        }
    }
    
    /**
     * Gets the "dpdOrderID" element
     */
    public int getDpdOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPDORDERID$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "dpdOrderID" element
     */
    public org.apache.xmlbeans.XmlInt xgetDpdOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DPDORDERID$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dpdOrderID" element
     */
    public void setDpdOrderID(int dpdOrderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPDORDERID$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DPDORDERID$32);
            }
            target.setIntValue(dpdOrderID);
        }
    }
    
    /**
     * Sets (as xml) the "dpdOrderID" element
     */
    public void xsetDpdOrderID(org.apache.xmlbeans.XmlInt dpdOrderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DPDORDERID$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DPDORDERID$32);
            }
            target.set(dpdOrderID);
        }
    }
    
    /**
     * Gets the "resubmitAttempt" element
     */
    public int getResubmitAttempt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESUBMITATTEMPT$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "resubmitAttempt" element
     */
    public org.apache.xmlbeans.XmlInt xgetResubmitAttempt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESUBMITATTEMPT$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resubmitAttempt" element
     */
    public void setResubmitAttempt(int resubmitAttempt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESUBMITATTEMPT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESUBMITATTEMPT$34);
            }
            target.setIntValue(resubmitAttempt);
        }
    }
    
    /**
     * Sets (as xml) the "resubmitAttempt" element
     */
    public void xsetResubmitAttempt(org.apache.xmlbeans.XmlInt resubmitAttempt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESUBMITATTEMPT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RESUBMITATTEMPT$34);
            }
            target.set(resubmitAttempt);
        }
    }
    
    /**
     * Gets the "additionalField1" element
     */
    public java.lang.String getAdditionalField1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALFIELD1$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "additionalField1" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalField1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALFIELD1$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "additionalField1" element
     */
    public void setAdditionalField1(java.lang.String additionalField1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALFIELD1$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALFIELD1$36);
            }
            target.setStringValue(additionalField1);
        }
    }
    
    /**
     * Sets (as xml) the "additionalField1" element
     */
    public void xsetAdditionalField1(org.apache.xmlbeans.XmlString additionalField1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALFIELD1$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALFIELD1$36);
            }
            target.set(additionalField1);
        }
    }
    
    /**
     * Gets the "additionalField2" element
     */
    public java.lang.String getAdditionalField2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALFIELD2$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "additionalField2" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalField2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALFIELD2$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "additionalField2" element
     */
    public void setAdditionalField2(java.lang.String additionalField2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALFIELD2$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALFIELD2$38);
            }
            target.setStringValue(additionalField2);
        }
    }
    
    /**
     * Sets (as xml) the "additionalField2" element
     */
    public void xsetAdditionalField2(org.apache.xmlbeans.XmlString additionalField2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALFIELD2$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALFIELD2$38);
            }
            target.set(additionalField2);
        }
    }
    
    /**
     * Gets the "additionalField3" element
     */
    public java.lang.String getAdditionalField3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALFIELD3$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "additionalField3" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalField3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALFIELD3$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "additionalField3" element
     */
    public void setAdditionalField3(java.lang.String additionalField3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALFIELD3$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALFIELD3$40);
            }
            target.setStringValue(additionalField3);
        }
    }
    
    /**
     * Sets (as xml) the "additionalField3" element
     */
    public void xsetAdditionalField3(org.apache.xmlbeans.XmlString additionalField3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALFIELD3$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALFIELD3$40);
            }
            target.set(additionalField3);
        }
    }
    
    /**
     * Gets the "orderDate" element
     */
    public java.util.Calendar getOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$42, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orderDate" element
     */
    public void setOrderDate(java.util.Calendar orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATE$42);
            }
            target.setCalendarValue(orderDate);
        }
    }
    
    /**
     * Sets (as xml) the "orderDate" element
     */
    public void xsetOrderDate(org.apache.xmlbeans.XmlDateTime orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ORDERDATE$42);
            }
            target.set(orderDate);
        }
    }
}
