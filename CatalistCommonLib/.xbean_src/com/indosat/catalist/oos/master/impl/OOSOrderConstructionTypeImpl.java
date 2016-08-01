/*
 * XML Type:  OOSOrderConstructionType
 * Namespace: http://oos.catalist.indosat.com/Master
 * Java type: com.indosat.catalist.oos.master.OOSOrderConstructionType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.catalist.oos.master.impl;
/**
 * An XML OOSOrderConstructionType(@http://oos.catalist.indosat.com/Master).
 *
 * This is a complex type.
 */
public class OOSOrderConstructionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.catalist.oos.master.OOSOrderConstructionType
{
    
    public OOSOrderConstructionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "source");
    private static final javax.xml.namespace.QName ORDERTYPE$2 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "orderType");
    private static final javax.xml.namespace.QName SERVICEID$4 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "serviceID");
    private static final javax.xml.namespace.QName EXEC$6 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "exec");
    private static final javax.xml.namespace.QName HASOUTPUT$8 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "hasOutput");
    private static final javax.xml.namespace.QName CLASSNAME$10 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "className");
    private static final javax.xml.namespace.QName DEPENDSEQID$12 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "dependSeqID");
    private static final javax.xml.namespace.QName SEQID$14 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "seqID");
    private static final javax.xml.namespace.QName FIELDMAPPING$16 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "fieldMapping");
    private static final javax.xml.namespace.QName STATICFIELD$18 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "staticField");
    private static final javax.xml.namespace.QName IGNOREERROR$20 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "ignoreError");
    private static final javax.xml.namespace.QName FETCHOUTPUT$22 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "fetchOutput");
    
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
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
     * Gets the "serviceID" element
     */
    public java.lang.String getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEID$4);
            }
            target.set(serviceID);
        }
    }
    
    /**
     * Gets the "exec" element
     */
    public int getExec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXEC$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "exec" element
     */
    public org.apache.xmlbeans.XmlInt xgetExec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXEC$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "exec" element
     */
    public void setExec(int exec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXEC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXEC$6);
            }
            target.setIntValue(exec);
        }
    }
    
    /**
     * Sets (as xml) the "exec" element
     */
    public void xsetExec(org.apache.xmlbeans.XmlInt exec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXEC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EXEC$6);
            }
            target.set(exec);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$8, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASOUTPUT$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASOUTPUT$8);
            }
            target.set(hasOutput);
        }
    }
    
    /**
     * Gets the "className" element
     */
    public java.lang.String getClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "className" element
     */
    public org.apache.xmlbeans.XmlString xgetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "className" element
     */
    public void setClassName(java.lang.String className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$10);
            }
            target.setStringValue(className);
        }
    }
    
    /**
     * Sets (as xml) the "className" element
     */
    public void xsetClassName(org.apache.xmlbeans.XmlString className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$10);
            }
            target.set(className);
        }
    }
    
    /**
     * Gets a List of "dependSeqID" elements
     */
    public java.util.List<java.lang.Integer> getDependSeqIDList()
    {
        final class DependSeqIDList extends java.util.AbstractList<java.lang.Integer>
        {
            public java.lang.Integer get(int i)
                { return OOSOrderConstructionTypeImpl.this.getDependSeqIDArray(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = OOSOrderConstructionTypeImpl.this.getDependSeqIDArray(i);
                OOSOrderConstructionTypeImpl.this.setDependSeqIDArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { OOSOrderConstructionTypeImpl.this.insertDependSeqID(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = OOSOrderConstructionTypeImpl.this.getDependSeqIDArray(i);
                OOSOrderConstructionTypeImpl.this.removeDependSeqID(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfDependSeqIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DependSeqIDList();
        }
    }
    
    /**
     * Gets array of all "dependSeqID" elements
     */
    public int[] getDependSeqIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDSEQID$12, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dependSeqID" element
     */
    public int getDependSeqIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDSEQID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "dependSeqID" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlInt> xgetDependSeqIDList()
    {
        final class DependSeqIDList extends java.util.AbstractList<org.apache.xmlbeans.XmlInt>
        {
            public org.apache.xmlbeans.XmlInt get(int i)
                { return OOSOrderConstructionTypeImpl.this.xgetDependSeqIDArray(i); }
            
            public org.apache.xmlbeans.XmlInt set(int i, org.apache.xmlbeans.XmlInt o)
            {
                org.apache.xmlbeans.XmlInt old = OOSOrderConstructionTypeImpl.this.xgetDependSeqIDArray(i);
                OOSOrderConstructionTypeImpl.this.xsetDependSeqIDArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlInt o)
                { OOSOrderConstructionTypeImpl.this.insertNewDependSeqID(i).set(o); }
            
            public org.apache.xmlbeans.XmlInt remove(int i)
            {
                org.apache.xmlbeans.XmlInt old = OOSOrderConstructionTypeImpl.this.xgetDependSeqIDArray(i);
                OOSOrderConstructionTypeImpl.this.removeDependSeqID(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfDependSeqIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DependSeqIDList();
        }
    }
    
    /**
     * Gets (as xml) array of all "dependSeqID" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetDependSeqIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDSEQID$12, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dependSeqID" element
     */
    public org.apache.xmlbeans.XmlInt xgetDependSeqIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPENDSEQID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "dependSeqID" element
     */
    public int sizeOfDependSeqIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDSEQID$12);
        }
    }
    
    /**
     * Sets array of all "dependSeqID" element
     */
    public void setDependSeqIDArray(int[] dependSeqIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dependSeqIDArray, DEPENDSEQID$12);
        }
    }
    
    /**
     * Sets ith "dependSeqID" element
     */
    public void setDependSeqIDArray(int i, int dependSeqID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDSEQID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(dependSeqID);
        }
    }
    
    /**
     * Sets (as xml) array of all "dependSeqID" element
     */
    public void xsetDependSeqIDArray(org.apache.xmlbeans.XmlInt[]dependSeqIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dependSeqIDArray, DEPENDSEQID$12);
        }
    }
    
    /**
     * Sets (as xml) ith "dependSeqID" element
     */
    public void xsetDependSeqIDArray(int i, org.apache.xmlbeans.XmlInt dependSeqID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPENDSEQID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dependSeqID);
        }
    }
    
    /**
     * Inserts the value as the ith "dependSeqID" element
     */
    public void insertDependSeqID(int i, int dependSeqID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DEPENDSEQID$12, i);
            target.setIntValue(dependSeqID);
        }
    }
    
    /**
     * Appends the value as the last "dependSeqID" element
     */
    public void addDependSeqID(int dependSeqID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPENDSEQID$12);
            target.setIntValue(dependSeqID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependSeqID" element
     */
    public org.apache.xmlbeans.XmlInt insertNewDependSeqID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(DEPENDSEQID$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependSeqID" element
     */
    public org.apache.xmlbeans.XmlInt addNewDependSeqID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPENDSEQID$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "dependSeqID" element
     */
    public void removeDependSeqID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDSEQID$12, i);
        }
    }
    
    /**
     * Gets the "seqID" element
     */
    public int getSeqID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "seqID" element
     */
    public org.apache.xmlbeans.XmlInt xgetSeqID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQID$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "seqID" element
     */
    public void setSeqID(int seqID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQID$14);
            }
            target.setIntValue(seqID);
        }
    }
    
    /**
     * Sets (as xml) the "seqID" element
     */
    public void xsetSeqID(org.apache.xmlbeans.XmlInt seqID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQID$14);
            }
            target.set(seqID);
        }
    }
    
    /**
     * Gets a List of "fieldMapping" elements
     */
    public java.util.List<java.lang.String> getFieldMappingList()
    {
        final class FieldMappingList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return OOSOrderConstructionTypeImpl.this.getFieldMappingArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = OOSOrderConstructionTypeImpl.this.getFieldMappingArray(i);
                OOSOrderConstructionTypeImpl.this.setFieldMappingArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { OOSOrderConstructionTypeImpl.this.insertFieldMapping(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = OOSOrderConstructionTypeImpl.this.getFieldMappingArray(i);
                OOSOrderConstructionTypeImpl.this.removeFieldMapping(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfFieldMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FieldMappingList();
        }
    }
    
    /**
     * Gets array of all "fieldMapping" elements
     */
    public java.lang.String[] getFieldMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDMAPPING$16, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "fieldMapping" element
     */
    public java.lang.String getFieldMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDMAPPING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "fieldMapping" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFieldMappingList()
    {
        final class FieldMappingList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return OOSOrderConstructionTypeImpl.this.xgetFieldMappingArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderConstructionTypeImpl.this.xgetFieldMappingArray(i);
                OOSOrderConstructionTypeImpl.this.xsetFieldMappingArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { OOSOrderConstructionTypeImpl.this.insertNewFieldMapping(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderConstructionTypeImpl.this.xgetFieldMappingArray(i);
                OOSOrderConstructionTypeImpl.this.removeFieldMapping(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfFieldMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FieldMappingList();
        }
    }
    
    /**
     * Gets (as xml) array of all "fieldMapping" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFieldMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDMAPPING$16, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "fieldMapping" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDMAPPING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "fieldMapping" element
     */
    public int sizeOfFieldMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDMAPPING$16);
        }
    }
    
    /**
     * Sets array of all "fieldMapping" element
     */
    public void setFieldMappingArray(java.lang.String[] fieldMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldMappingArray, FIELDMAPPING$16);
        }
    }
    
    /**
     * Sets ith "fieldMapping" element
     */
    public void setFieldMappingArray(int i, java.lang.String fieldMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDMAPPING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fieldMapping);
        }
    }
    
    /**
     * Sets (as xml) array of all "fieldMapping" element
     */
    public void xsetFieldMappingArray(org.apache.xmlbeans.XmlString[]fieldMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldMappingArray, FIELDMAPPING$16);
        }
    }
    
    /**
     * Sets (as xml) ith "fieldMapping" element
     */
    public void xsetFieldMappingArray(int i, org.apache.xmlbeans.XmlString fieldMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDMAPPING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fieldMapping);
        }
    }
    
    /**
     * Inserts the value as the ith "fieldMapping" element
     */
    public void insertFieldMapping(int i, java.lang.String fieldMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FIELDMAPPING$16, i);
            target.setStringValue(fieldMapping);
        }
    }
    
    /**
     * Appends the value as the last "fieldMapping" element
     */
    public void addFieldMapping(java.lang.String fieldMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDMAPPING$16);
            target.setStringValue(fieldMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fieldMapping" element
     */
    public org.apache.xmlbeans.XmlString insertNewFieldMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FIELDMAPPING$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fieldMapping" element
     */
    public org.apache.xmlbeans.XmlString addNewFieldMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDMAPPING$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "fieldMapping" element
     */
    public void removeFieldMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDMAPPING$16, i);
        }
    }
    
    /**
     * Gets a List of "staticField" elements
     */
    public java.util.List<java.lang.String> getStaticFieldList()
    {
        final class StaticFieldList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return OOSOrderConstructionTypeImpl.this.getStaticFieldArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = OOSOrderConstructionTypeImpl.this.getStaticFieldArray(i);
                OOSOrderConstructionTypeImpl.this.setStaticFieldArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { OOSOrderConstructionTypeImpl.this.insertStaticField(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = OOSOrderConstructionTypeImpl.this.getStaticFieldArray(i);
                OOSOrderConstructionTypeImpl.this.removeStaticField(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfStaticFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StaticFieldList();
        }
    }
    
    /**
     * Gets array of all "staticField" elements
     */
    public java.lang.String[] getStaticFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATICFIELD$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "staticField" element
     */
    public java.lang.String getStaticFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATICFIELD$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "staticField" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetStaticFieldList()
    {
        final class StaticFieldList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return OOSOrderConstructionTypeImpl.this.xgetStaticFieldArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderConstructionTypeImpl.this.xgetStaticFieldArray(i);
                OOSOrderConstructionTypeImpl.this.xsetStaticFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { OOSOrderConstructionTypeImpl.this.insertNewStaticField(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderConstructionTypeImpl.this.xgetStaticFieldArray(i);
                OOSOrderConstructionTypeImpl.this.removeStaticField(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfStaticFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StaticFieldList();
        }
    }
    
    /**
     * Gets (as xml) array of all "staticField" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStaticFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATICFIELD$18, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "staticField" element
     */
    public org.apache.xmlbeans.XmlString xgetStaticFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATICFIELD$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "staticField" element
     */
    public int sizeOfStaticFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATICFIELD$18);
        }
    }
    
    /**
     * Sets array of all "staticField" element
     */
    public void setStaticFieldArray(java.lang.String[] staticFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(staticFieldArray, STATICFIELD$18);
        }
    }
    
    /**
     * Sets ith "staticField" element
     */
    public void setStaticFieldArray(int i, java.lang.String staticField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATICFIELD$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(staticField);
        }
    }
    
    /**
     * Sets (as xml) array of all "staticField" element
     */
    public void xsetStaticFieldArray(org.apache.xmlbeans.XmlString[]staticFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(staticFieldArray, STATICFIELD$18);
        }
    }
    
    /**
     * Sets (as xml) ith "staticField" element
     */
    public void xsetStaticFieldArray(int i, org.apache.xmlbeans.XmlString staticField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATICFIELD$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(staticField);
        }
    }
    
    /**
     * Inserts the value as the ith "staticField" element
     */
    public void insertStaticField(int i, java.lang.String staticField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATICFIELD$18, i);
            target.setStringValue(staticField);
        }
    }
    
    /**
     * Appends the value as the last "staticField" element
     */
    public void addStaticField(java.lang.String staticField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATICFIELD$18);
            target.setStringValue(staticField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "staticField" element
     */
    public org.apache.xmlbeans.XmlString insertNewStaticField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STATICFIELD$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "staticField" element
     */
    public org.apache.xmlbeans.XmlString addNewStaticField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATICFIELD$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "staticField" element
     */
    public void removeStaticField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATICFIELD$18, i);
        }
    }
    
    /**
     * Gets the "ignoreError" element
     */
    public boolean getIgnoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IGNOREERROR$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ignoreError" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIgnoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IGNOREERROR$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ignoreError" element
     */
    public void setIgnoreError(boolean ignoreError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IGNOREERROR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IGNOREERROR$20);
            }
            target.setBooleanValue(ignoreError);
        }
    }
    
    /**
     * Sets (as xml) the "ignoreError" element
     */
    public void xsetIgnoreError(org.apache.xmlbeans.XmlBoolean ignoreError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IGNOREERROR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(IGNOREERROR$20);
            }
            target.set(ignoreError);
        }
    }
    
    /**
     * Gets a List of "fetchOutput" elements
     */
    public java.util.List<java.lang.String> getFetchOutputList()
    {
        final class FetchOutputList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return OOSOrderConstructionTypeImpl.this.getFetchOutputArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = OOSOrderConstructionTypeImpl.this.getFetchOutputArray(i);
                OOSOrderConstructionTypeImpl.this.setFetchOutputArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { OOSOrderConstructionTypeImpl.this.insertFetchOutput(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = OOSOrderConstructionTypeImpl.this.getFetchOutputArray(i);
                OOSOrderConstructionTypeImpl.this.removeFetchOutput(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfFetchOutputArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FetchOutputList();
        }
    }
    
    /**
     * Gets array of all "fetchOutput" elements
     */
    public java.lang.String[] getFetchOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FETCHOUTPUT$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "fetchOutput" element
     */
    public java.lang.String getFetchOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHOUTPUT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "fetchOutput" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFetchOutputList()
    {
        final class FetchOutputList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return OOSOrderConstructionTypeImpl.this.xgetFetchOutputArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderConstructionTypeImpl.this.xgetFetchOutputArray(i);
                OOSOrderConstructionTypeImpl.this.xsetFetchOutputArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { OOSOrderConstructionTypeImpl.this.insertNewFetchOutput(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = OOSOrderConstructionTypeImpl.this.xgetFetchOutputArray(i);
                OOSOrderConstructionTypeImpl.this.removeFetchOutput(i);
                return old;
            }
            
            public int size()
                { return OOSOrderConstructionTypeImpl.this.sizeOfFetchOutputArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FetchOutputList();
        }
    }
    
    /**
     * Gets (as xml) array of all "fetchOutput" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFetchOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FETCHOUTPUT$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "fetchOutput" element
     */
    public org.apache.xmlbeans.XmlString xgetFetchOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHOUTPUT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "fetchOutput" element
     */
    public int sizeOfFetchOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FETCHOUTPUT$22);
        }
    }
    
    /**
     * Sets array of all "fetchOutput" element
     */
    public void setFetchOutputArray(java.lang.String[] fetchOutputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fetchOutputArray, FETCHOUTPUT$22);
        }
    }
    
    /**
     * Sets ith "fetchOutput" element
     */
    public void setFetchOutputArray(int i, java.lang.String fetchOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHOUTPUT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fetchOutput);
        }
    }
    
    /**
     * Sets (as xml) array of all "fetchOutput" element
     */
    public void xsetFetchOutputArray(org.apache.xmlbeans.XmlString[]fetchOutputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fetchOutputArray, FETCHOUTPUT$22);
        }
    }
    
    /**
     * Sets (as xml) ith "fetchOutput" element
     */
    public void xsetFetchOutputArray(int i, org.apache.xmlbeans.XmlString fetchOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHOUTPUT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fetchOutput);
        }
    }
    
    /**
     * Inserts the value as the ith "fetchOutput" element
     */
    public void insertFetchOutput(int i, java.lang.String fetchOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FETCHOUTPUT$22, i);
            target.setStringValue(fetchOutput);
        }
    }
    
    /**
     * Appends the value as the last "fetchOutput" element
     */
    public void addFetchOutput(java.lang.String fetchOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHOUTPUT$22);
            target.setStringValue(fetchOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fetchOutput" element
     */
    public org.apache.xmlbeans.XmlString insertNewFetchOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FETCHOUTPUT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fetchOutput" element
     */
    public org.apache.xmlbeans.XmlString addNewFetchOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FETCHOUTPUT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "fetchOutput" element
     */
    public void removeFetchOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FETCHOUTPUT$22, i);
        }
    }
}
