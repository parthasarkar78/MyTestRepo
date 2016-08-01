/*
 * An XML document type.
 * Localname: evSOResult
 * Namespace: com/icare/eai/schema/om/evSOResult
 * Java type: com.icare.eai.schema.om.evSOResult.EvSOResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSOResult.impl;
/**
 * A document containing one evSOResult(@com/icare/eai/schema/om/evSOResult) element.
 *
 * This is a complex type.
 */
public class EvSOResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSOResult.EvSOResultDocument
{
    
    public EvSOResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVSORESULT$0 = 
        new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "evSOResult");
    
    
    /**
     * Gets the "evSOResult" element
     */
    public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult getEvSOResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult target = null;
            target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult)get_store().find_element_user(EVSORESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "evSOResult" element
     */
    public void setEvSOResult(com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult evSOResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult target = null;
            target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult)get_store().find_element_user(EVSORESULT$0, 0);
            if (target == null)
            {
                target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult)get_store().add_element_user(EVSORESULT$0);
            }
            target.set(evSOResult);
        }
    }
    
    /**
     * Appends and returns a new empty "evSOResult" element
     */
    public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult addNewEvSOResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult target = null;
            target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult)get_store().add_element_user(EVSORESULT$0);
            return target;
        }
    }
    /**
     * An XML evSOResult(@com/icare/eai/schema/om/evSOResult).
     *
     * This is a complex type.
     */
    public static class EvSOResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult
    {
        
        public EvSOResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOID$0 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SOID");
        private static final javax.xml.namespace.QName SORESULTCODE$2 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SO_Result_Code");
        private static final javax.xml.namespace.QName SOERRDESC$4 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SOErrDesc");
        private static final javax.xml.namespace.QName SERVICEELEMENTRESULT$6 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "ServiceElementResult");
        
        
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
         * Gets the "SO_Result_Code" element
         */
        public java.lang.String getSOResultCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORESULTCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SO_Result_Code" element
         */
        public org.apache.xmlbeans.XmlString xgetSOResultCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SORESULTCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "SO_Result_Code" element
         */
        public boolean isSetSOResultCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SORESULTCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "SO_Result_Code" element
         */
        public void setSOResultCode(java.lang.String soResultCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORESULTCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SORESULTCODE$2);
                }
                target.setStringValue(soResultCode);
            }
        }
        
        /**
         * Sets (as xml) the "SO_Result_Code" element
         */
        public void xsetSOResultCode(org.apache.xmlbeans.XmlString soResultCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SORESULTCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SORESULTCODE$2);
                }
                target.set(soResultCode);
            }
        }
        
        /**
         * Unsets the "SO_Result_Code" element
         */
        public void unsetSOResultCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SORESULTCODE$2, 0);
            }
        }
        
        /**
         * Gets the "SOErrDesc" element
         */
        public java.lang.String getSOErrDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOERRDESC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SOErrDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetSOErrDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOERRDESC$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "SOErrDesc" element
         */
        public boolean isSetSOErrDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOERRDESC$4) != 0;
            }
        }
        
        /**
         * Sets the "SOErrDesc" element
         */
        public void setSOErrDesc(java.lang.String soErrDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOERRDESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOERRDESC$4);
                }
                target.setStringValue(soErrDesc);
            }
        }
        
        /**
         * Sets (as xml) the "SOErrDesc" element
         */
        public void xsetSOErrDesc(org.apache.xmlbeans.XmlString soErrDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOERRDESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOERRDESC$4);
                }
                target.set(soErrDesc);
            }
        }
        
        /**
         * Unsets the "SOErrDesc" element
         */
        public void unsetSOErrDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOERRDESC$4, 0);
            }
        }
        
        /**
         * Gets a List of "ServiceElementResult" elements
         */
        public java.util.List<com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult> getServiceElementResultList()
        {
            final class ServiceElementResultList extends java.util.AbstractList<com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult>
            {
                public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult get(int i)
                    { return EvSOResultImpl.this.getServiceElementResultArray(i); }
                
                public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult set(int i, com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult o)
                {
                    com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult old = EvSOResultImpl.this.getServiceElementResultArray(i);
                    EvSOResultImpl.this.setServiceElementResultArray(i, o);
                    return old;
                }
                
                public void add(int i, com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult o)
                    { EvSOResultImpl.this.insertNewServiceElementResult(i).set(o); }
                
                public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult remove(int i)
                {
                    com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult old = EvSOResultImpl.this.getServiceElementResultArray(i);
                    EvSOResultImpl.this.removeServiceElementResult(i);
                    return old;
                }
                
                public int size()
                    { return EvSOResultImpl.this.sizeOfServiceElementResultArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ServiceElementResultList();
            }
        }
        
        /**
         * Gets array of all "ServiceElementResult" elements
         */
        public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult[] getServiceElementResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICEELEMENTRESULT$6, targetList);
                com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult[] result = new com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ServiceElementResult" element
         */
        public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult getServiceElementResultArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult target = null;
                target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult)get_store().find_element_user(SERVICEELEMENTRESULT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ServiceElementResult" element
         */
        public int sizeOfServiceElementResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICEELEMENTRESULT$6);
            }
        }
        
        /**
         * Sets array of all "ServiceElementResult" element
         */
        public void setServiceElementResultArray(com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult[] serviceElementResultArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(serviceElementResultArray, SERVICEELEMENTRESULT$6);
            }
        }
        
        /**
         * Sets ith "ServiceElementResult" element
         */
        public void setServiceElementResultArray(int i, com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult serviceElementResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult target = null;
                target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult)get_store().find_element_user(SERVICEELEMENTRESULT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(serviceElementResult);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ServiceElementResult" element
         */
        public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult insertNewServiceElementResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult target = null;
                target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult)get_store().insert_element_user(SERVICEELEMENTRESULT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ServiceElementResult" element
         */
        public com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult addNewServiceElementResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult target = null;
                target = (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult)get_store().add_element_user(SERVICEELEMENTRESULT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ServiceElementResult" element
         */
        public void removeServiceElementResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICEELEMENTRESULT$6, i);
            }
        }
        /**
         * An XML ServiceElementResult(@com/icare/eai/schema/om/evSOResult).
         *
         * This is a complex type.
         */
        public static class ServiceElementResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult
        {
            
            public ServiceElementResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SERVICEELEMENT$0 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "ServiceElement");
            private static final javax.xml.namespace.QName SEID$2 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SEID");
            private static final javax.xml.namespace.QName SEPROVDATE$4 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SEProvDate");
            private static final javax.xml.namespace.QName SERESULTCODE$6 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SEResultCode");
            private static final javax.xml.namespace.QName SEERRDESC$8 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSOResult", "SEErrDesc");
            
            
            /**
             * Gets the "ServiceElement" element
             */
            public java.lang.String getServiceElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEELEMENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ServiceElement" element
             */
            public org.apache.xmlbeans.XmlString xgetServiceElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEELEMENT$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ServiceElement" element
             */
            public boolean isSetServiceElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SERVICEELEMENT$0) != 0;
                }
            }
            
            /**
             * Sets the "ServiceElement" element
             */
            public void setServiceElement(java.lang.String serviceElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEELEMENT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEELEMENT$0);
                    }
                    target.setStringValue(serviceElement);
                }
            }
            
            /**
             * Sets (as xml) the "ServiceElement" element
             */
            public void xsetServiceElement(org.apache.xmlbeans.XmlString serviceElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEELEMENT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEELEMENT$0);
                    }
                    target.set(serviceElement);
                }
            }
            
            /**
             * Unsets the "ServiceElement" element
             */
            public void unsetServiceElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SERVICEELEMENT$0, 0);
                }
            }
            
            /**
             * Gets the "SEID" element
             */
            public java.lang.String getSEID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEID$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SEID" element
             */
            public org.apache.xmlbeans.XmlString xgetSEID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEID$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SEID" element
             */
            public boolean isSetSEID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEID$2) != 0;
                }
            }
            
            /**
             * Sets the "SEID" element
             */
            public void setSEID(java.lang.String seid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEID$2);
                    }
                    target.setStringValue(seid);
                }
            }
            
            /**
             * Sets (as xml) the "SEID" element
             */
            public void xsetSEID(org.apache.xmlbeans.XmlString seid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEID$2);
                    }
                    target.set(seid);
                }
            }
            
            /**
             * Unsets the "SEID" element
             */
            public void unsetSEID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEID$2, 0);
                }
            }
            
            /**
             * Gets the "SEProvDate" element
             */
            public java.lang.String getSEProvDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEPROVDATE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SEProvDate" element
             */
            public org.apache.xmlbeans.XmlString xgetSEProvDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEPROVDATE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SEProvDate" element
             */
            public boolean isSetSEProvDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEPROVDATE$4) != 0;
                }
            }
            
            /**
             * Sets the "SEProvDate" element
             */
            public void setSEProvDate(java.lang.String seProvDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEPROVDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEPROVDATE$4);
                    }
                    target.setStringValue(seProvDate);
                }
            }
            
            /**
             * Sets (as xml) the "SEProvDate" element
             */
            public void xsetSEProvDate(org.apache.xmlbeans.XmlString seProvDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEPROVDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEPROVDATE$4);
                    }
                    target.set(seProvDate);
                }
            }
            
            /**
             * Unsets the "SEProvDate" element
             */
            public void unsetSEProvDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEPROVDATE$4, 0);
                }
            }
            
            /**
             * Gets the "SEResultCode" element
             */
            public java.lang.String getSEResultCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERESULTCODE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SEResultCode" element
             */
            public org.apache.xmlbeans.XmlString xgetSEResultCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERESULTCODE$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SEResultCode" element
             */
            public boolean isSetSEResultCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SERESULTCODE$6) != 0;
                }
            }
            
            /**
             * Sets the "SEResultCode" element
             */
            public void setSEResultCode(java.lang.String seResultCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERESULTCODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERESULTCODE$6);
                    }
                    target.setStringValue(seResultCode);
                }
            }
            
            /**
             * Sets (as xml) the "SEResultCode" element
             */
            public void xsetSEResultCode(org.apache.xmlbeans.XmlString seResultCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERESULTCODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERESULTCODE$6);
                    }
                    target.set(seResultCode);
                }
            }
            
            /**
             * Unsets the "SEResultCode" element
             */
            public void unsetSEResultCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SERESULTCODE$6, 0);
                }
            }
            
            /**
             * Gets the "SEErrDesc" element
             */
            public java.lang.String getSEErrDesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEERRDESC$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SEErrDesc" element
             */
            public org.apache.xmlbeans.XmlString xgetSEErrDesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEERRDESC$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SEErrDesc" element
             */
            public boolean isSetSEErrDesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEERRDESC$8) != 0;
                }
            }
            
            /**
             * Sets the "SEErrDesc" element
             */
            public void setSEErrDesc(java.lang.String seErrDesc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEERRDESC$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEERRDESC$8);
                    }
                    target.setStringValue(seErrDesc);
                }
            }
            
            /**
             * Sets (as xml) the "SEErrDesc" element
             */
            public void xsetSEErrDesc(org.apache.xmlbeans.XmlString seErrDesc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEERRDESC$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEERRDESC$8);
                    }
                    target.set(seErrDesc);
                }
            }
            
            /**
             * Unsets the "SEErrDesc" element
             */
            public void unsetSEErrDesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEERRDESC$8, 0);
                }
            }
        }
    }
}
