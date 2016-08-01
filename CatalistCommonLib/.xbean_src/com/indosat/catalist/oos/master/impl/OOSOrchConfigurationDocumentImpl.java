/*
 * An XML document type.
 * Localname: OOSOrchConfiguration
 * Namespace: http://oos.catalist.indosat.com/Master
 * Java type: com.indosat.catalist.oos.master.OOSOrchConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.indosat.catalist.oos.master.impl;
/**
 * A document containing one OOSOrchConfiguration(@http://oos.catalist.indosat.com/Master) element.
 *
 * This is a complex type.
 */
public class OOSOrchConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.catalist.oos.master.OOSOrchConfigurationDocument
{
    
    public OOSOrchConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OOSORCHCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "OOSOrchConfiguration");
    
    
    /**
     * Gets the "OOSOrchConfiguration" element
     */
    public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration getOOSOrchConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration target = null;
            target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration)get_store().find_element_user(OOSORCHCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OOSOrchConfiguration" element
     */
    public void setOOSOrchConfiguration(com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration oosOrchConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration target = null;
            target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration)get_store().find_element_user(OOSORCHCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration)get_store().add_element_user(OOSORCHCONFIGURATION$0);
            }
            target.set(oosOrchConfiguration);
        }
    }
    
    /**
     * Appends and returns a new empty "OOSOrchConfiguration" element
     */
    public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration addNewOOSOrchConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration target = null;
            target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration)get_store().add_element_user(OOSORCHCONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML OOSOrchConfiguration(@http://oos.catalist.indosat.com/Master).
     *
     * This is a complex type.
     */
    public static class OOSOrchConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration
    {
        
        public OOSOrchConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "Source");
        private static final javax.xml.namespace.QName ORDERTYPE$2 = 
            new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "OrderType");
        private static final javax.xml.namespace.QName SERVICES$4 = 
            new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "Services");
        
        
        /**
         * Gets the "Source" element
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
         * Gets (as xml) the "Source" element
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
         * Sets the "Source" element
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
         * Sets (as xml) the "Source" element
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
         * Gets the "OrderType" element
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
         * Gets (as xml) the "OrderType" element
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
         * Sets the "OrderType" element
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
         * Sets (as xml) the "OrderType" element
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
         * Gets a List of "Services" elements
         */
        public java.util.List<com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services> getServicesList()
        {
            final class ServicesList extends java.util.AbstractList<com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services>
            {
                public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services get(int i)
                    { return OOSOrchConfigurationImpl.this.getServicesArray(i); }
                
                public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services set(int i, com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services o)
                {
                    com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services old = OOSOrchConfigurationImpl.this.getServicesArray(i);
                    OOSOrchConfigurationImpl.this.setServicesArray(i, o);
                    return old;
                }
                
                public void add(int i, com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services o)
                    { OOSOrchConfigurationImpl.this.insertNewServices(i).set(o); }
                
                public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services remove(int i)
                {
                    com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services old = OOSOrchConfigurationImpl.this.getServicesArray(i);
                    OOSOrchConfigurationImpl.this.removeServices(i);
                    return old;
                }
                
                public int size()
                    { return OOSOrchConfigurationImpl.this.sizeOfServicesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ServicesList();
            }
        }
        
        /**
         * Gets array of all "Services" elements
         */
        public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services[] getServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICES$4, targetList);
                com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services[] result = new com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Services" element
         */
        public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services getServicesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services target = null;
                target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services)get_store().find_element_user(SERVICES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Services" element
         */
        public int sizeOfServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICES$4);
            }
        }
        
        /**
         * Sets array of all "Services" element
         */
        public void setServicesArray(com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services[] servicesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(servicesArray, SERVICES$4);
            }
        }
        
        /**
         * Sets ith "Services" element
         */
        public void setServicesArray(int i, com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services services)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services target = null;
                target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services)get_store().find_element_user(SERVICES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(services);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Services" element
         */
        public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services insertNewServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services target = null;
                target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services)get_store().insert_element_user(SERVICES$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Services" element
         */
        public com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services addNewServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services target = null;
                target = (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services)get_store().add_element_user(SERVICES$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Services" element
         */
        public void removeServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICES$4, i);
            }
        }
        /**
         * An XML Services(@http://oos.catalist.indosat.com/Master).
         *
         * This is a complex type.
         */
        public static class ServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services
        {
            
            public ServicesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SERVICE$0 = 
                new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "service");
            private static final javax.xml.namespace.QName EXECUTION$2 = 
                new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "execution");
            private static final javax.xml.namespace.QName HASOUTPUT$4 = 
                new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "hasOutput");
            private static final javax.xml.namespace.QName DEPENDSEQID$6 = 
                new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "dependSeqID");
            private static final javax.xml.namespace.QName SEQID$8 = 
                new javax.xml.namespace.QName("http://oos.catalist.indosat.com/Master", "seqID");
            
            
            /**
             * Gets the "service" element
             */
            public java.lang.String getService()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "service" element
             */
            public org.apache.xmlbeans.XmlString xgetService()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "service" element
             */
            public void setService(java.lang.String service)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$0);
                    }
                    target.setStringValue(service);
                }
            }
            
            /**
             * Sets (as xml) the "service" element
             */
            public void xsetService(org.apache.xmlbeans.XmlString service)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICE$0);
                    }
                    target.set(service);
                }
            }
            
            /**
             * Gets the "execution" element
             */
            public int getExecution()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTION$2, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "execution" element
             */
            public org.apache.xmlbeans.XmlInt xgetExecution()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXECUTION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "execution" element
             */
            public void setExecution(int execution)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECUTION$2);
                    }
                    target.setIntValue(execution);
                }
            }
            
            /**
             * Sets (as xml) the "execution" element
             */
            public void xsetExecution(org.apache.xmlbeans.XmlInt execution)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXECUTION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EXECUTION$2);
                    }
                    target.set(execution);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$4, 0);
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
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$4, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASOUTPUT$4);
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
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASOUTPUT$4);
                    }
                    target.set(hasOutput);
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
                        { return ServicesImpl.this.getDependSeqIDArray(i); }
                    
                    public java.lang.Integer set(int i, java.lang.Integer o)
                    {
                      java.lang.Integer old = ServicesImpl.this.getDependSeqIDArray(i);
                      ServicesImpl.this.setDependSeqIDArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, java.lang.Integer o)
                        { ServicesImpl.this.insertDependSeqID(i, o); }
                    
                    public java.lang.Integer remove(int i)
                    {
                      java.lang.Integer old = ServicesImpl.this.getDependSeqIDArray(i);
                      ServicesImpl.this.removeDependSeqID(i);
                      return old;
                    }
                    
                    public int size()
                        { return ServicesImpl.this.sizeOfDependSeqIDArray(); }
                    
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
                    get_store().find_all_element_users(DEPENDSEQID$6, targetList);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDSEQID$6, i);
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
                        { return ServicesImpl.this.xgetDependSeqIDArray(i); }
                    
                    public org.apache.xmlbeans.XmlInt set(int i, org.apache.xmlbeans.XmlInt o)
                    {
                      org.apache.xmlbeans.XmlInt old = ServicesImpl.this.xgetDependSeqIDArray(i);
                      ServicesImpl.this.xsetDependSeqIDArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, org.apache.xmlbeans.XmlInt o)
                        { ServicesImpl.this.insertNewDependSeqID(i).set(o); }
                    
                    public org.apache.xmlbeans.XmlInt remove(int i)
                    {
                      org.apache.xmlbeans.XmlInt old = ServicesImpl.this.xgetDependSeqIDArray(i);
                      ServicesImpl.this.removeDependSeqID(i);
                      return old;
                    }
                    
                    public int size()
                        { return ServicesImpl.this.sizeOfDependSeqIDArray(); }
                    
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
                    get_store().find_all_element_users(DEPENDSEQID$6, targetList);
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
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPENDSEQID$6, i);
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
                    return get_store().count_elements(DEPENDSEQID$6);
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
                    arraySetterHelper(dependSeqIDArray, DEPENDSEQID$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDSEQID$6, i);
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
                    arraySetterHelper(dependSeqIDArray, DEPENDSEQID$6);
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
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPENDSEQID$6, i);
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
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DEPENDSEQID$6, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPENDSEQID$6);
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
                    target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(DEPENDSEQID$6, i);
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
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPENDSEQID$6);
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
                    get_store().remove_element(DEPENDSEQID$6, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$8, 0);
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
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQID$8, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQID$8);
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
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQID$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQID$8);
                    }
                    target.set(seqID);
                }
            }
        }
    }
}
