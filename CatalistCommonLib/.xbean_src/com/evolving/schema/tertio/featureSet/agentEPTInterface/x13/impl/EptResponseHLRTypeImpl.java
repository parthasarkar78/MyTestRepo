/*
 * XML Type:  EptResponseHLRType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.impl;
/**
 * An XML EptResponseHLRType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public class EptResponseHLRTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType
{
    
    public EptResponseHLRTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EPTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "EptResponse");
    
    
    /**
     * Gets the "EptResponse" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse getEptResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse)get_store().find_element_user(EPTRESPONSE$0, 0);
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
    public void setEptResponse(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse eptResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse)get_store().find_element_user(EPTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse)get_store().add_element_user(EPTRESPONSE$0);
            }
            target.set(eptResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "EptResponse" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse addNewEptResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse)get_store().add_element_user(EPTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EptResponse(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public static class EptResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse
    {
        
        public EptResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYFEATURESET$0 = 
            new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "QueryFeatureSet");
        
        
        /**
         * Gets the "QueryFeatureSet" element
         */
        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet getQueryFeatureSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet target = null;
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet)get_store().find_element_user(QUERYFEATURESET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "QueryFeatureSet" element
         */
        public boolean isSetQueryFeatureSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYFEATURESET$0) != 0;
            }
        }
        
        /**
         * Sets the "QueryFeatureSet" element
         */
        public void setQueryFeatureSet(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet queryFeatureSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet target = null;
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet)get_store().find_element_user(QUERYFEATURESET$0, 0);
                if (target == null)
                {
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet)get_store().add_element_user(QUERYFEATURESET$0);
                }
                target.set(queryFeatureSet);
            }
        }
        
        /**
         * Appends and returns a new empty "QueryFeatureSet" element
         */
        public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet addNewQueryFeatureSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet target = null;
                target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet)get_store().add_element_user(QUERYFEATURESET$0);
                return target;
            }
        }
        
        /**
         * Unsets the "QueryFeatureSet" element
         */
        public void unsetQueryFeatureSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYFEATURESET$0, 0);
            }
        }
        /**
         * An XML QueryFeatureSet(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
         *
         * This is a complex type.
         */
        public static class QueryFeatureSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet
        {
            
            public QueryFeatureSetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName KEYVALUES$0 = 
                new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "KeyValues");
            private static final javax.xml.namespace.QName ADDFEATURES$2 = 
                new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "AddFeatures");
            private static final javax.xml.namespace.QName PERSONALISATIONS$4 = 
                new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Personalisations");
            private static final javax.xml.namespace.QName NESTEDFEATUREACTIONS$6 = 
                new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "NestedFeatureActions");
            private static final javax.xml.namespace.QName FEATURESETNAME$8 = 
                new javax.xml.namespace.QName("", "FeatureSetName");
            private static final javax.xml.namespace.QName ACTION$10 = 
                new javax.xml.namespace.QName("", "Action");
            private static final javax.xml.namespace.QName MODE$12 = 
                new javax.xml.namespace.QName("", "Mode");
            private static final javax.xml.namespace.QName NETYPE$14 = 
                new javax.xml.namespace.QName("", "NeType");
            
            
            /**
             * Gets the "KeyValues" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType getKeyValues()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().find_element_user(KEYVALUES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "KeyValues" element
             */
            public boolean isSetKeyValues()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(KEYVALUES$0) != 0;
                }
            }
            
            /**
             * Sets the "KeyValues" element
             */
            public void setKeyValues(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType keyValues)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().find_element_user(KEYVALUES$0, 0);
                    if (target == null)
                    {
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().add_element_user(KEYVALUES$0);
                    }
                    target.set(keyValues);
                }
            }
            
            /**
             * Appends and returns a new empty "KeyValues" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType addNewKeyValues()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().add_element_user(KEYVALUES$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "KeyValues" element
             */
            public void unsetKeyValues()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(KEYVALUES$0, 0);
                }
            }
            
            /**
             * Gets the "AddFeatures" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType getAddFeatures()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().find_element_user(ADDFEATURES$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "AddFeatures" element
             */
            public boolean isSetAddFeatures()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADDFEATURES$2) != 0;
                }
            }
            
            /**
             * Sets the "AddFeatures" element
             */
            public void setAddFeatures(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addFeatures)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().find_element_user(ADDFEATURES$2, 0);
                    if (target == null)
                    {
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().add_element_user(ADDFEATURES$2);
                    }
                    target.set(addFeatures);
                }
            }
            
            /**
             * Appends and returns a new empty "AddFeatures" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addNewAddFeatures()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().add_element_user(ADDFEATURES$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "AddFeatures" element
             */
            public void unsetAddFeatures()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADDFEATURES$2, 0);
                }
            }
            
            /**
             * Gets the "Personalisations" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType getPersonalisations()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().find_element_user(PERSONALISATIONS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Personalisations" element
             */
            public boolean isSetPersonalisations()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PERSONALISATIONS$4) != 0;
                }
            }
            
            /**
             * Sets the "Personalisations" element
             */
            public void setPersonalisations(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType personalisations)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().find_element_user(PERSONALISATIONS$4, 0);
                    if (target == null)
                    {
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().add_element_user(PERSONALISATIONS$4);
                    }
                    target.set(personalisations);
                }
            }
            
            /**
             * Appends and returns a new empty "Personalisations" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType addNewPersonalisations()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().add_element_user(PERSONALISATIONS$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "Personalisations" element
             */
            public void unsetPersonalisations()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PERSONALISATIONS$4, 0);
                }
            }
            
            /**
             * Gets the "NestedFeatureActions" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions getNestedFeatureActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions)get_store().find_element_user(NESTEDFEATUREACTIONS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "NestedFeatureActions" element
             */
            public boolean isSetNestedFeatureActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NESTEDFEATUREACTIONS$6) != 0;
                }
            }
            
            /**
             * Sets the "NestedFeatureActions" element
             */
            public void setNestedFeatureActions(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions nestedFeatureActions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions)get_store().find_element_user(NESTEDFEATUREACTIONS$6, 0);
                    if (target == null)
                    {
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions)get_store().add_element_user(NESTEDFEATUREACTIONS$6);
                    }
                    target.set(nestedFeatureActions);
                }
            }
            
            /**
             * Appends and returns a new empty "NestedFeatureActions" element
             */
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions addNewNestedFeatureActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions target = null;
                    target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions)get_store().add_element_user(NESTEDFEATUREACTIONS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "NestedFeatureActions" element
             */
            public void unsetNestedFeatureActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NESTEDFEATUREACTIONS$6, 0);
                }
            }
            
            /**
             * Gets the "FeatureSetName" attribute
             */
            public java.lang.String getFeatureSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURESETNAME$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "FeatureSetName" attribute
             */
            public org.apache.xmlbeans.XmlString xgetFeatureSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURESETNAME$8);
                    return target;
                }
            }
            
            /**
             * True if has "FeatureSetName" attribute
             */
            public boolean isSetFeatureSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(FEATURESETNAME$8) != null;
                }
            }
            
            /**
             * Sets the "FeatureSetName" attribute
             */
            public void setFeatureSetName(java.lang.String featureSetName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURESETNAME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATURESETNAME$8);
                    }
                    target.setStringValue(featureSetName);
                }
            }
            
            /**
             * Sets (as xml) the "FeatureSetName" attribute
             */
            public void xsetFeatureSetName(org.apache.xmlbeans.XmlString featureSetName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURESETNAME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FEATURESETNAME$8);
                    }
                    target.set(featureSetName);
                }
            }
            
            /**
             * Unsets the "FeatureSetName" attribute
             */
            public void unsetFeatureSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(FEATURESETNAME$8);
                }
            }
            
            /**
             * Gets the "Action" attribute
             */
            public java.lang.String getAction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Action" attribute
             */
            public org.apache.xmlbeans.XmlString xgetAction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$10);
                    return target;
                }
            }
            
            /**
             * True if has "Action" attribute
             */
            public boolean isSetAction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ACTION$10) != null;
                }
            }
            
            /**
             * Sets the "Action" attribute
             */
            public void setAction(java.lang.String action)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$10);
                    }
                    target.setStringValue(action);
                }
            }
            
            /**
             * Sets (as xml) the "Action" attribute
             */
            public void xsetAction(org.apache.xmlbeans.XmlString action)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$10);
                    }
                    target.set(action);
                }
            }
            
            /**
             * Unsets the "Action" attribute
             */
            public void unsetAction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ACTION$10);
                }
            }
            
            /**
             * Gets the "Mode" attribute
             */
            public java.lang.String getMode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Mode" attribute
             */
            public org.apache.xmlbeans.XmlString xgetMode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODE$12);
                    return target;
                }
            }
            
            /**
             * True if has "Mode" attribute
             */
            public boolean isSetMode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MODE$12) != null;
                }
            }
            
            /**
             * Sets the "Mode" attribute
             */
            public void setMode(java.lang.String mode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODE$12);
                    }
                    target.setStringValue(mode);
                }
            }
            
            /**
             * Sets (as xml) the "Mode" attribute
             */
            public void xsetMode(org.apache.xmlbeans.XmlString mode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODE$12);
                    }
                    target.set(mode);
                }
            }
            
            /**
             * Unsets the "Mode" attribute
             */
            public void unsetMode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MODE$12);
                }
            }
            
            /**
             * Gets the "NeType" attribute
             */
            public java.lang.String getNeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETYPE$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NeType" attribute
             */
            public org.apache.xmlbeans.XmlString xgetNeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NETYPE$14);
                    return target;
                }
            }
            
            /**
             * True if has "NeType" attribute
             */
            public boolean isSetNeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NETYPE$14) != null;
                }
            }
            
            /**
             * Sets the "NeType" attribute
             */
            public void setNeType(java.lang.String neType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETYPE$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NETYPE$14);
                    }
                    target.setStringValue(neType);
                }
            }
            
            /**
             * Sets (as xml) the "NeType" attribute
             */
            public void xsetNeType(org.apache.xmlbeans.XmlString neType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NETYPE$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NETYPE$14);
                    }
                    target.set(neType);
                }
            }
            
            /**
             * Unsets the "NeType" attribute
             */
            public void unsetNeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NETYPE$14);
                }
            }
            /**
             * An XML NestedFeatureActions(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
             *
             * This is a complex type.
             */
            public static class NestedFeatureActionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions
            {
                
                public NestedFeatureActionsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NESTEDFEATURE$0 = 
                    new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "NestedFeature");
                
                
                /**
                 * Gets a List of "NestedFeature" elements
                 */
                public java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature> getNestedFeatureList()
                {
                    final class NestedFeatureList extends java.util.AbstractList<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature>
                    {
                      public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature get(int i)
                          { return NestedFeatureActionsImpl.this.getNestedFeatureArray(i); }
                      
                      public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature set(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature o)
                      {
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature old = NestedFeatureActionsImpl.this.getNestedFeatureArray(i);
                        NestedFeatureActionsImpl.this.setNestedFeatureArray(i, o);
                        return old;
                      }
                      
                      public void add(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature o)
                          { NestedFeatureActionsImpl.this.insertNewNestedFeature(i).set(o); }
                      
                      public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature remove(int i)
                      {
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature old = NestedFeatureActionsImpl.this.getNestedFeatureArray(i);
                        NestedFeatureActionsImpl.this.removeNestedFeature(i);
                        return old;
                      }
                      
                      public int size()
                          { return NestedFeatureActionsImpl.this.sizeOfNestedFeatureArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new NestedFeatureList();
                    }
                }
                
                /**
                 * Gets array of all "NestedFeature" elements
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature[] getNestedFeatureArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(NESTEDFEATURE$0, targetList);
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature[] result = new com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "NestedFeature" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature getNestedFeatureArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature)get_store().find_element_user(NESTEDFEATURE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "NestedFeature" element
                 */
                public int sizeOfNestedFeatureArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NESTEDFEATURE$0);
                    }
                }
                
                /**
                 * Sets array of all "NestedFeature" element
                 */
                public void setNestedFeatureArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature[] nestedFeatureArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(nestedFeatureArray, NESTEDFEATURE$0);
                    }
                }
                
                /**
                 * Sets ith "NestedFeature" element
                 */
                public void setNestedFeatureArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature nestedFeature)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature)get_store().find_element_user(NESTEDFEATURE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(nestedFeature);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "NestedFeature" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature insertNewNestedFeature(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature)get_store().insert_element_user(NESTEDFEATURE$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "NestedFeature" element
                 */
                public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature addNewNestedFeature()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature target = null;
                      target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature)get_store().add_element_user(NESTEDFEATURE$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "NestedFeature" element
                 */
                public void removeNestedFeature(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NESTEDFEATURE$0, i);
                    }
                }
                /**
                 * An XML NestedFeature(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                 *
                 * This is a complex type.
                 */
                public static class NestedFeatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature
                {
                    
                    public NestedFeatureImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName PERSONALISATIONS$0 = 
                      new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Personalisations");
                    private static final javax.xml.namespace.QName KEYVALUES$2 = 
                      new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "KeyValues");
                    private static final javax.xml.namespace.QName ADDFEATURES$4 = 
                      new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "AddFeatures");
                    private static final javax.xml.namespace.QName FEATURESETNAME$6 = 
                      new javax.xml.namespace.QName("", "FeatureSetName");
                    private static final javax.xml.namespace.QName ACTION$8 = 
                      new javax.xml.namespace.QName("", "Action");
                    
                    
                    /**
                     * Gets the "Personalisations" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType getPersonalisations()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().find_element_user(PERSONALISATIONS$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Personalisations" element
                     */
                    public boolean isSetPersonalisations()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PERSONALISATIONS$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Personalisations" element
                     */
                    public void setPersonalisations(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType personalisations)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().find_element_user(PERSONALISATIONS$0, 0);
                        if (target == null)
                        {
                          target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().add_element_user(PERSONALISATIONS$0);
                        }
                        target.set(personalisations);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "Personalisations" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType addNewPersonalisations()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType)get_store().add_element_user(PERSONALISATIONS$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "Personalisations" element
                     */
                    public void unsetPersonalisations()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PERSONALISATIONS$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "KeyValues" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType getKeyValues()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().find_element_user(KEYVALUES$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "KeyValues" element
                     */
                    public boolean isSetKeyValues()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(KEYVALUES$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "KeyValues" element
                     */
                    public void setKeyValues(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType keyValues)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().find_element_user(KEYVALUES$2, 0);
                        if (target == null)
                        {
                          target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().add_element_user(KEYVALUES$2);
                        }
                        target.set(keyValues);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "KeyValues" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType addNewKeyValues()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType)get_store().add_element_user(KEYVALUES$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "KeyValues" element
                     */
                    public void unsetKeyValues()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(KEYVALUES$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "AddFeatures" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType getAddFeatures()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().find_element_user(ADDFEATURES$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "AddFeatures" element
                     */
                    public boolean isSetAddFeatures()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADDFEATURES$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "AddFeatures" element
                     */
                    public void setAddFeatures(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addFeatures)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().find_element_user(ADDFEATURES$4, 0);
                        if (target == null)
                        {
                          target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().add_element_user(ADDFEATURES$4);
                        }
                        target.set(addFeatures);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "AddFeatures" element
                     */
                    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addNewAddFeatures()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType target = null;
                        target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType)get_store().add_element_user(ADDFEATURES$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "AddFeatures" element
                     */
                    public void unsetAddFeatures()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADDFEATURES$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "FeatureSetName" attribute
                     */
                    public java.lang.String getFeatureSetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURESETNAME$6);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "FeatureSetName" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetFeatureSetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURESETNAME$6);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "FeatureSetName" attribute
                     */
                    public boolean isSetFeatureSetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(FEATURESETNAME$6) != null;
                      }
                    }
                    
                    /**
                     * Sets the "FeatureSetName" attribute
                     */
                    public void setFeatureSetName(java.lang.String featureSetName)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURESETNAME$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATURESETNAME$6);
                        }
                        target.setStringValue(featureSetName);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "FeatureSetName" attribute
                     */
                    public void xsetFeatureSetName(org.apache.xmlbeans.XmlString featureSetName)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURESETNAME$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FEATURESETNAME$6);
                        }
                        target.set(featureSetName);
                      }
                    }
                    
                    /**
                     * Unsets the "FeatureSetName" attribute
                     */
                    public void unsetFeatureSetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(FEATURESETNAME$6);
                      }
                    }
                    
                    /**
                     * Gets the "Action" attribute
                     */
                    public java.lang.String getAction()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$8);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Action" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetAction()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$8);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Action" attribute
                     */
                    public boolean isSetAction()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(ACTION$8) != null;
                      }
                    }
                    
                    /**
                     * Sets the "Action" attribute
                     */
                    public void setAction(java.lang.String action)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$8);
                        }
                        target.setStringValue(action);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Action" attribute
                     */
                    public void xsetAction(org.apache.xmlbeans.XmlString action)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$8);
                        }
                        target.set(action);
                      }
                    }
                    
                    /**
                     * Unsets the "Action" attribute
                     */
                    public void unsetAction()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(ACTION$8);
                      }
                    }
                }
            }
        }
    }
}
