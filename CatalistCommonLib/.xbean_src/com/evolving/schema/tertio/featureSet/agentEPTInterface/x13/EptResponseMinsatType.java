/*
 * XML Type:  EptResponseMinsatType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13;


/**
 * An XML EptResponseMinsatType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public interface EptResponseMinsatType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EptResponseMinsatType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("eptresponseminsattypeacb9type");
    
    /**
     * Gets the "EptResponse" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse getEptResponse();
    
    /**
     * Sets the "EptResponse" element
     */
    void setEptResponse(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse eptResponse);
    
    /**
     * Appends and returns a new empty "EptResponse" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse addNewEptResponse();
    
    /**
     * An XML EptResponse(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public interface EptResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EptResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("eptresponseee23elemtype");
        
        /**
         * Gets the "AuxiliaryData" element
         */
        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData getAuxiliaryData();
        
        /**
         * Sets the "AuxiliaryData" element
         */
        void setAuxiliaryData(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData auxiliaryData);
        
        /**
         * Appends and returns a new empty "AuxiliaryData" element
         */
        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData addNewAuxiliaryData();
        
        /**
         * An XML AuxiliaryData(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
         *
         * This is a complex type.
         */
        public interface AuxiliaryData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuxiliaryData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("auxiliarydata95c7elemtype");
            
            /**
             * Gets the "FeatureSet" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet getFeatureSet();
            
            /**
             * Sets the "FeatureSet" element
             */
            void setFeatureSet(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet featureSet);
            
            /**
             * Appends and returns a new empty "FeatureSet" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet addNewFeatureSet();
            
            /**
             * An XML FeatureSet(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
             *
             * This is a complex type.
             */
            public interface FeatureSet extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("featureset727felemtype");
                
                /**
                 * Gets the "KeyValues" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues getKeyValues();
                
                /**
                 * Sets the "KeyValues" element
                 */
                void setKeyValues(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues keyValues);
                
                /**
                 * Appends and returns a new empty "KeyValues" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues addNewKeyValues();
                
                /**
                 * Gets the "ParsedResponse" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse getParsedResponse();
                
                /**
                 * True if has "ParsedResponse" element
                 */
                boolean isSetParsedResponse();
                
                /**
                 * Sets the "ParsedResponse" element
                 */
                void setParsedResponse(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse parsedResponse);
                
                /**
                 * Appends and returns a new empty "ParsedResponse" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse addNewParsedResponse();
                
                /**
                 * Unsets the "ParsedResponse" element
                 */
                void unsetParsedResponse();
                
                /**
                 * An XML KeyValues(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                 *
                 * This is a complex type.
                 */
                public interface KeyValues extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("keyvalues136celemtype");
                    
                    /**
                     * Gets a List of "Key" elements
                     */
                    java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key> getKeyList();
                    
                    /**
                     * Gets array of all "Key" elements
                     * @deprecated
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key[] getKeyArray();
                    
                    /**
                     * Gets ith "Key" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key getKeyArray(int i);
                    
                    /**
                     * Returns number of "Key" element
                     */
                    int sizeOfKeyArray();
                    
                    /**
                     * Sets array of all "Key" element
                     */
                    void setKeyArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key[] keyArray);
                    
                    /**
                     * Sets ith "Key" element
                     */
                    void setKeyArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key key);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Key" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key insertNewKey(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Key" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key addNewKey();
                    
                    /**
                     * Removes the ith "Key" element
                     */
                    void removeKey(int i);
                    
                    /**
                     * An XML Key(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                     *
                     * This is a complex type.
                     */
                    public interface Key extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Key.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("key6557elemtype");
                      
                      /**
                       * Gets the "KeyName" attribute
                       */
                      java.lang.String getKeyName();
                      
                      /**
                       * Gets (as xml) the "KeyName" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetKeyName();
                      
                      /**
                       * True if has "KeyName" attribute
                       */
                      boolean isSetKeyName();
                      
                      /**
                       * Sets the "KeyName" attribute
                       */
                      void setKeyName(java.lang.String keyName);
                      
                      /**
                       * Sets (as xml) the "KeyName" attribute
                       */
                      void xsetKeyName(org.apache.xmlbeans.XmlString keyName);
                      
                      /**
                       * Unsets the "KeyName" attribute
                       */
                      void unsetKeyName();
                      
                      /**
                       * Gets the "KeyValue" attribute
                       */
                      java.lang.String getKeyValue();
                      
                      /**
                       * Gets (as xml) the "KeyValue" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetKeyValue();
                      
                      /**
                       * True if has "KeyValue" attribute
                       */
                      boolean isSetKeyValue();
                      
                      /**
                       * Sets the "KeyValue" attribute
                       */
                      void setKeyValue(java.lang.String keyValue);
                      
                      /**
                       * Sets (as xml) the "KeyValue" attribute
                       */
                      void xsetKeyValue(org.apache.xmlbeans.XmlString keyValue);
                      
                      /**
                       * Unsets the "KeyValue" attribute
                       */
                      void unsetKeyValue();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key newInstance() {
                          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues newInstance() {
                        return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.KeyValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML ParsedResponse(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                 *
                 * This is a complex type.
                 */
                public interface ParsedResponse extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParsedResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("parsedresponseb62delemtype");
                    
                    /**
                     * Gets a List of "Attribute" elements
                     */
                    java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute> getAttributeList();
                    
                    /**
                     * Gets array of all "Attribute" elements
                     * @deprecated
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute[] getAttributeArray();
                    
                    /**
                     * Gets ith "Attribute" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute getAttributeArray(int i);
                    
                    /**
                     * Returns number of "Attribute" element
                     */
                    int sizeOfAttributeArray();
                    
                    /**
                     * Sets array of all "Attribute" element
                     */
                    void setAttributeArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute[] attributeArray);
                    
                    /**
                     * Sets ith "Attribute" element
                     */
                    void setAttributeArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute attribute);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute insertNewAttribute(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Attribute" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute addNewAttribute();
                    
                    /**
                     * Removes the ith "Attribute" element
                     */
                    void removeAttribute(int i);
                    
                    /**
                     * An XML Attribute(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                     *
                     * This is a complex type.
                     */
                    public interface Attribute extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("attribute4445elemtype");
                      
                      /**
                       * Gets the "Name" attribute
                       */
                      java.lang.String getName();
                      
                      /**
                       * Gets (as xml) the "Name" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetName();
                      
                      /**
                       * True if has "Name" attribute
                       */
                      boolean isSetName();
                      
                      /**
                       * Sets the "Name" attribute
                       */
                      void setName(java.lang.String name);
                      
                      /**
                       * Sets (as xml) the "Name" attribute
                       */
                      void xsetName(org.apache.xmlbeans.XmlString name);
                      
                      /**
                       * Unsets the "Name" attribute
                       */
                      void unsetName();
                      
                      /**
                       * Gets the "Value" attribute
                       */
                      java.lang.String getValue();
                      
                      /**
                       * Gets (as xml) the "Value" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetValue();
                      
                      /**
                       * True if has "Value" attribute
                       */
                      boolean isSetValue();
                      
                      /**
                       * Sets the "Value" attribute
                       */
                      void setValue(java.lang.String value);
                      
                      /**
                       * Sets (as xml) the "Value" attribute
                       */
                      void xsetValue(org.apache.xmlbeans.XmlString value);
                      
                      /**
                       * Unsets the "Value" attribute
                       */
                      void unsetValue();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute newInstance() {
                          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse newInstance() {
                        return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet.ParsedResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet newInstance() {
                      return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData.FeatureSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData newInstance() {
                  return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse.AuxiliaryData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse newInstance() {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType.EptResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType newInstance() {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseMinsatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
