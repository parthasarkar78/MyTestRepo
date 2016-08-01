/*
 * XML Type:  EptResponseMinsatType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.impl;
/**
 * An XML EptResponseMinsatType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public class EptResponseMinsatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType
{
    
    public EptResponseMinsatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EPTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "EptResponse");
    
    
    /**
     * Gets the "EptResponse" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse getEptResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse)get_store().find_element_user(EPTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EptResponse" element
     */
    public void setEptResponse(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse eptResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse)get_store().find_element_user(EPTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse)get_store().add_element_user(EPTRESPONSE$0);
            }
            target.set(eptResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "EptResponse" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse addNewEptResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse)get_store().add_element_user(EPTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EptResponse(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public static class EptResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse
    {
        
        public EptResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUXILIARYDATA$0 = 
            new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "AuxiliaryData");
        
        
        /**
         * Gets the "AuxiliaryData" element
         */
        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData getAuxiliaryData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData target = null;
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData)get_store().find_element_user(AUXILIARYDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AuxiliaryData" element
         */
        public void setAuxiliaryData(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData auxiliaryData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData target = null;
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData)get_store().find_element_user(AUXILIARYDATA$0, 0);
                if (target == null)
                {
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData)get_store().add_element_user(AUXILIARYDATA$0);
                }
                target.set(auxiliaryData);
            }
        }
        
        /**
         * Appends and returns a new empty "AuxiliaryData" element
         */
        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData addNewAuxiliaryData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData target = null;
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData)get_store().add_element_user(AUXILIARYDATA$0);
                return target;
            }
        }
        /**
         * An XML AuxiliaryData(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
         *
         * This is a complex type.
         */
        public static class AuxiliaryDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData
        {
            
            public AuxiliaryDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FEATURESET$0 = 
                new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "FeatureSet");
            
            
            /**
             * Gets the "FeatureSet" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet getFeatureSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet)get_store().find_element_user(FEATURESET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "FeatureSet" element
             */
            public void setFeatureSet(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet featureSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet)get_store().find_element_user(FEATURESET$0, 0);
                    if (target == null)
                    {
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet)get_store().add_element_user(FEATURESET$0);
                    }
                    target.set(featureSet);
                }
            }
            
            /**
             * Appends and returns a new empty "FeatureSet" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet addNewFeatureSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet)get_store().add_element_user(FEATURESET$0);
                    return target;
                }
            }
            /**
             * An XML FeatureSet(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
             *
             * This is a complex type.
             */
            public static class FeatureSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet
            {
                
                public FeatureSetImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName KEYVALUES$0 = 
                    new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "KeyValues");
                private static final javax.xml.namespace.QName PARSEDRESPONSE$2 = 
                    new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "ParsedResponse");
                
                
                /**
                 * Gets the "KeyValues" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues getKeyValues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues)get_store().find_element_user(KEYVALUES$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "KeyValues" element
                 */
                public void setKeyValues(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues keyValues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues)get_store().find_element_user(KEYVALUES$0, 0);
                      if (target == null)
                      {
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues)get_store().add_element_user(KEYVALUES$0);
                      }
                      target.set(keyValues);
                    }
                }
                
                /**
                 * Appends and returns a new empty "KeyValues" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues addNewKeyValues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues)get_store().add_element_user(KEYVALUES$0);
                      return target;
                    }
                }
                
                /**
                 * Gets the "ParsedResponse" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse getParsedResponse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse)get_store().find_element_user(PARSEDRESPONSE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "ParsedResponse" element
                 */
                public boolean isSetParsedResponse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PARSEDRESPONSE$2) != 0;
                    }
                }
                
                /**
                 * Sets the "ParsedResponse" element
                 */
                public void setParsedResponse(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse parsedResponse)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse)get_store().find_element_user(PARSEDRESPONSE$2, 0);
                      if (target == null)
                      {
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse)get_store().add_element_user(PARSEDRESPONSE$2);
                      }
                      target.set(parsedResponse);
                    }
                }
                
                /**
                 * Appends and returns a new empty "ParsedResponse" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse addNewParsedResponse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse)get_store().add_element_user(PARSEDRESPONSE$2);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "ParsedResponse" element
                 */
                public void unsetParsedResponse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PARSEDRESPONSE$2, 0);
                    }
                }
                /**
                 * An XML KeyValues(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                 *
                 * This is a complex type.
                 */
                public static class KeyValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues
                {
                    
                    public KeyValuesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName KEY$0 = 
                      new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Key");
                    
                    
                    /**
                     * Gets a List of "Key" elements
                     */
                    public java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key> getKeyList()
                    {
                      final class KeyList extends java.util.AbstractList<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key>
                      {
                        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key get(int i)
                            { return KeyValuesImpl.this.getKeyArray(i); }
                        
                        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key set(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key o)
                        {
                          com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key old = KeyValuesImpl.this.getKeyArray(i);
                          KeyValuesImpl.this.setKeyArray(i, o);
                          return old;
                        }
                        
                        public void add(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key o)
                            { KeyValuesImpl.this.insertNewKey(i).set(o); }
                        
                        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key remove(int i)
                        {
                          com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key old = KeyValuesImpl.this.getKeyArray(i);
                          KeyValuesImpl.this.removeKey(i);
                          return old;
                        }
                        
                        public int size()
                            { return KeyValuesImpl.this.sizeOfKeyArray(); }
                        
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
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key[] getKeyArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(KEY$0, targetList);
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key[] result = new com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "Key" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key getKeyArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key)get_store().find_element_user(KEY$0, i);
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
                    public void setKeyArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key[] keyArray)
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
                    public void setKeyArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key key)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key)get_store().find_element_user(KEY$0, i);
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
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key insertNewKey(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key)get_store().insert_element_user(KEY$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Key" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key addNewKey()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key)get_store().add_element_user(KEY$0);
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
                    public static class KeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key
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
                /**
                 * An XML ParsedResponse(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                 *
                 * This is a complex type.
                 */
                public static class ParsedResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse
                {
                    
                    public ParsedResponseImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
                      new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Attribute");
                    
                    
                    /**
                     * Gets a List of "Attribute" elements
                     */
                    public java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute> getAttributeList()
                    {
                      final class AttributeList extends java.util.AbstractList<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute>
                      {
                        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute get(int i)
                            { return ParsedResponseImpl.this.getAttributeArray(i); }
                        
                        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute set(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute o)
                        {
                          com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute old = ParsedResponseImpl.this.getAttributeArray(i);
                          ParsedResponseImpl.this.setAttributeArray(i, o);
                          return old;
                        }
                        
                        public void add(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute o)
                            { ParsedResponseImpl.this.insertNewAttribute(i).set(o); }
                        
                        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute remove(int i)
                        {
                          com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute old = ParsedResponseImpl.this.getAttributeArray(i);
                          ParsedResponseImpl.this.removeAttribute(i);
                          return old;
                        }
                        
                        public int size()
                            { return ParsedResponseImpl.this.sizeOfAttributeArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new AttributeList();
                      }
                    }
                    
                    /**
                     * Gets array of all "Attribute" elements
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute[] getAttributeArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(ATTRIBUTE$0, targetList);
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute[] result = new com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "Attribute" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute getAttributeArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "Attribute" element
                     */
                    public int sizeOfAttributeArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ATTRIBUTE$0);
                      }
                    }
                    
                    /**
                     * Sets array of all "Attribute" element
                     */
                    public void setAttributeArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute[] attributeArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(attributeArray, ATTRIBUTE$0);
                      }
                    }
                    
                    /**
                     * Sets ith "Attribute" element
                     */
                    public void setAttributeArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute attribute)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(attribute);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute insertNewAttribute(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute)get_store().insert_element_user(ATTRIBUTE$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Attribute" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute addNewAttribute()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute)get_store().add_element_user(ATTRIBUTE$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "Attribute" element
                     */
                    public void removeAttribute(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ATTRIBUTE$0, i);
                      }
                    }
                    /**
                     * An XML Attribute(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                     *
                     * This is a complex type.
                     */
                    public static class AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute
                    {
                      
                      public AttributeImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName NAME$0 = 
                        new javax.xml.namespace.QName("", "Name");
                      private static final javax.xml.namespace.QName VALUE$2 = 
                        new javax.xml.namespace.QName("", "Value");
                      
                      
                      /**
                       * Gets the "Name" attribute
                       */
                      public java.lang.String getName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "Name" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "Name" attribute
                       */
                      public boolean isSetName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().find_attribute_user(NAME$0) != null;
                        }
                      }
                      
                      /**
                       * Sets the "Name" attribute
                       */
                      public void setName(java.lang.String name)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                          }
                          target.setStringValue(name);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "Name" attribute
                       */
                      public void xsetName(org.apache.xmlbeans.XmlString name)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                          }
                          target.set(name);
                        }
                      }
                      
                      /**
                       * Unsets the "Name" attribute
                       */
                      public void unsetName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_attribute(NAME$0);
                        }
                      }
                      
                      /**
                       * Gets the "Value" attribute
                       */
                      public java.lang.String getValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "Value" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "Value" attribute
                       */
                      public boolean isSetValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().find_attribute_user(VALUE$2) != null;
                        }
                      }
                      
                      /**
                       * Sets the "Value" attribute
                       */
                      public void setValue(java.lang.String value)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                          }
                          target.setStringValue(value);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "Value" attribute
                       */
                      public void xsetValue(org.apache.xmlbeans.XmlString value)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                          }
                          target.set(value);
                        }
                      }
                      
                      /**
                       * Unsets the "Value" attribute
                       */
                      public void unsetValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_attribute(VALUE$2);
                        }
                      }
                    }
                }
            }
        }
    }
}
