/*
 * An XML document type.
 * Localname: evSORequest
 * Namespace: com/icare/eai/schema/om/evSORequest
 * Java type: com.icare.eai.schema.om.evSORequest.EvSORequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSORequest.impl;
/**
 * A document containing one evSORequest(@com/icare/eai/schema/om/evSORequest) element.
 *
 * This is a complex type.
 */
public class EvSORequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.EvSORequestDocument
{
    
    public EvSORequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVSOREQUEST$0 = 
        new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "evSORequest");
    
    
    /**
     * Gets the "evSORequest" element
     */
    public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest getEvSORequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest target = null;
            target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest)get_store().find_element_user(EVSOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "evSORequest" element
     */
    public void setEvSORequest(com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest evSORequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest target = null;
            target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest)get_store().find_element_user(EVSOREQUEST$0, 0);
            if (target == null)
            {
                target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest)get_store().add_element_user(EVSOREQUEST$0);
            }
            target.set(evSORequest);
        }
    }
    
    /**
     * Appends and returns a new empty "evSORequest" element
     */
    public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest addNewEvSORequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest target = null;
            target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest)get_store().add_element_user(EVSOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML evSORequest(@com/icare/eai/schema/om/evSORequest).
     *
     * This is a complex type.
     */
    public static class EvSORequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest
    {
        
        public EvSORequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOID$0 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "SOID");
        private static final javax.xml.namespace.QName KEY$2 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "Key");
        private static final javax.xml.namespace.QName LISTOFSERVICEELEMENTS$4 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "ListOfServiceElements");
        
        
        /**
         * Gets the "SOID" element
         */
        public java.lang.String getSOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SOID" element
         */
        public org.apache.xmlbeans.XmlString xgetSOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "SOID" element
         */
        public boolean isSetSOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOID$0) != 0;
            }
        }
        
        /**
         * Sets the "SOID" element
         */
        public void setSOID(java.lang.String soid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOID$0);
                }
                target.setStringValue(soid);
            }
        }
        
        /**
         * Sets (as xml) the "SOID" element
         */
        public void xsetSOID(org.apache.xmlbeans.XmlString soid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOID$0);
                }
                target.set(soid);
            }
        }
        
        /**
         * Unsets the "SOID" element
         */
        public void unsetSOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOID$0, 0);
            }
        }
        
        /**
         * Gets a List of "Key" elements
         */
        public java.util.List<com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key> getKeyList()
        {
            final class KeyList extends java.util.AbstractList<com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key>
            {
                public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key get(int i)
                    { return EvSORequestImpl.this.getKeyArray(i); }
                
                public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key set(int i, com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key o)
                {
                    com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key old = EvSORequestImpl.this.getKeyArray(i);
                    EvSORequestImpl.this.setKeyArray(i, o);
                    return old;
                }
                
                public void add(int i, com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key o)
                    { EvSORequestImpl.this.insertNewKey(i).set(o); }
                
                public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key remove(int i)
                {
                    com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key old = EvSORequestImpl.this.getKeyArray(i);
                    EvSORequestImpl.this.removeKey(i);
                    return old;
                }
                
                public int size()
                    { return EvSORequestImpl.this.sizeOfKeyArray(); }
                
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
        public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key[] getKeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEY$2, targetList);
                com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key[] result = new com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Key" element
         */
        public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key getKeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key target = null;
                target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key)get_store().find_element_user(KEY$2, i);
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
                return get_store().count_elements(KEY$2);
            }
        }
        
        /**
         * Sets array of all "Key" element
         */
        public void setKeyArray(com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key[] keyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keyArray, KEY$2);
            }
        }
        
        /**
         * Sets ith "Key" element
         */
        public void setKeyArray(int i, com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key target = null;
                target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key)get_store().find_element_user(KEY$2, i);
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
        public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key insertNewKey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key target = null;
                target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key)get_store().insert_element_user(KEY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Key" element
         */
        public com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key addNewKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key target = null;
                target = (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key)get_store().add_element_user(KEY$2);
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
                get_store().remove_element(KEY$2, i);
            }
        }
        
        /**
         * Gets the "ListOfServiceElements" element
         */
        public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType getListOfServiceElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().find_element_user(LISTOFSERVICEELEMENTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ListOfServiceElements" element
         */
        public boolean isSetListOfServiceElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTOFSERVICEELEMENTS$4) != 0;
            }
        }
        
        /**
         * Sets the "ListOfServiceElements" element
         */
        public void setListOfServiceElements(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType listOfServiceElements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().find_element_user(LISTOFSERVICEELEMENTS$4, 0);
                if (target == null)
                {
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().add_element_user(LISTOFSERVICEELEMENTS$4);
                }
                target.set(listOfServiceElements);
            }
        }
        
        /**
         * Appends and returns a new empty "ListOfServiceElements" element
         */
        public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType addNewListOfServiceElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().add_element_user(LISTOFSERVICEELEMENTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ListOfServiceElements" element
         */
        public void unsetListOfServiceElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTOFSERVICEELEMENTS$4, 0);
            }
        }
        /**
         * An XML Key(@com/icare/eai/schema/om/evSORequest).
         *
         * This is a complex type.
         */
        public static class KeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key
        {
            
            public KeyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "Name");
            private static final javax.xml.namespace.QName VALUE$2 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "Value");
            
            
            /**
             * Gets the "Name" element
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Name" element
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Name" element
             */
            public boolean isSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAME$0) != 0;
                }
            }
            
            /**
             * Sets the "Name" element
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "Name" element
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Unsets the "Name" element
             */
            public void unsetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAME$0, 0);
                }
            }
            
            /**
             * Gets the "Value" element
             */
            public java.lang.String getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Value" element
             */
            public org.apache.xmlbeans.XmlString xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Value" element
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(VALUE$2) != 0;
                }
            }
            
            /**
             * Sets the "Value" element
             */
            public void setValue(java.lang.String value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                    }
                    target.setStringValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "Value" element
             */
            public void xsetValue(org.apache.xmlbeans.XmlString value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "Value" element
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(VALUE$2, 0);
                }
            }
        }
    }
}
