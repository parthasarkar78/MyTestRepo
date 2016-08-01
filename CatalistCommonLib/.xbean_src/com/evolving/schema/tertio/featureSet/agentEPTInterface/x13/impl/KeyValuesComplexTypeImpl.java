/*
 * XML Type:  KeyValuesComplexType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.impl;
/**
 * An XML KeyValuesComplexType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public class KeyValuesComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType
{
    
    public KeyValuesComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Key");
    
    
    /**
     * Gets a List of "Key" elements
     */
    public java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key> getKeyList()
    {
        final class KeyList extends java.util.AbstractList<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key>
        {
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key get(int i)
                { return KeyValuesComplexTypeImpl.this.getKeyArray(i); }
            
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key set(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key o)
            {
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key old = KeyValuesComplexTypeImpl.this.getKeyArray(i);
                KeyValuesComplexTypeImpl.this.setKeyArray(i, o);
                return old;
            }
            
            public void add(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key o)
                { KeyValuesComplexTypeImpl.this.insertNewKey(i).set(o); }
            
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key remove(int i)
            {
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key old = KeyValuesComplexTypeImpl.this.getKeyArray(i);
                KeyValuesComplexTypeImpl.this.removeKey(i);
                return old;
            }
            
            public int size()
                { return KeyValuesComplexTypeImpl.this.sizeOfKeyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new KeyList();
        }
    }
    
    /**
     * Gets array of all "Key" elements
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key[] getKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEY$0, targetList);
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key[] result = new com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Key" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key getKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key)get_store().find_element_user(KEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Key" element
     */
    public int sizeOfKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEY$0);
        }
    }
    
    /**
     * Sets array of all "Key" element
     */
    public void setKeyArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key[] keyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyArray, KEY$0);
        }
    }
    
    /**
     * Sets ith "Key" element
     */
    public void setKeyArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key)get_store().find_element_user(KEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(key);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key insertNewKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key)get_store().insert_element_user(KEY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key)get_store().add_element_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Key" element
     */
    public void removeKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEY$0, i);
        }
    }
    /**
     * An XML Key(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public static class KeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key
    {
        
        public KeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYNAME$0 = 
            new javax.xml.namespace.QName("", "KeyName");
        private static final javax.xml.namespace.QName KEYVALUE$2 = 
            new javax.xml.namespace.QName("", "KeyValue");
        
        
        /**
         * Gets the "KeyName" attribute
         */
        public java.lang.String getKeyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KeyName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKeyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYNAME$0);
                return target;
            }
        }
        
        /**
         * True if has "KeyName" attribute
         */
        public boolean isSetKeyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEYNAME$0) != null;
            }
        }
        
        /**
         * Sets the "KeyName" attribute
         */
        public void setKeyName(java.lang.String keyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYNAME$0);
                }
                target.setStringValue(keyName);
            }
        }
        
        /**
         * Sets (as xml) the "KeyName" attribute
         */
        public void xsetKeyName(org.apache.xmlbeans.XmlString keyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEYNAME$0);
                }
                target.set(keyName);
            }
        }
        
        /**
         * Unsets the "KeyName" attribute
         */
        public void unsetKeyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEYNAME$0);
            }
        }
        
        /**
         * Gets the "KeyValue" attribute
         */
        public java.lang.String getKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYVALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KeyValue" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYVALUE$2);
                return target;
            }
        }
        
        /**
         * True if has "KeyValue" attribute
         */
        public boolean isSetKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEYVALUE$2) != null;
            }
        }
        
        /**
         * Sets the "KeyValue" attribute
         */
        public void setKeyValue(java.lang.String keyValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYVALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYVALUE$2);
                }
                target.setStringValue(keyValue);
            }
        }
        
        /**
         * Sets (as xml) the "KeyValue" attribute
         */
        public void xsetKeyValue(org.apache.xmlbeans.XmlString keyValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYVALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEYVALUE$2);
                }
                target.set(keyValue);
            }
        }
        
        /**
         * Unsets the "KeyValue" attribute
         */
        public void unsetKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEYVALUE$2);
            }
        }
    }
}
