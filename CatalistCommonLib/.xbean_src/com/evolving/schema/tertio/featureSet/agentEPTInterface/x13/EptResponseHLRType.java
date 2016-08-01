/*
 * XML Type:  EptResponseHLRType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13;


/**
 * An XML EptResponseHLRType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public interface EptResponseHLRType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EptResponseHLRType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("eptresponsehlrtype4e01type");
    
    /**
     * Gets the "EptResponse" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse getEptResponse();
    
    /**
     * Sets the "EptResponse" element
     */
    void setEptResponse(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse eptResponse);
    
    /**
     * Appends and returns a new empty "EptResponse" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse addNewEptResponse();
    
    /**
     * An XML EptResponse(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public interface EptResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EptResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("eptresponse94d7elemtype");
        
        /**
         * Gets the "QueryFeatureSet" element
         */
        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet getQueryFeatureSet();
        
        /**
         * True if has "QueryFeatureSet" element
         */
        boolean isSetQueryFeatureSet();
        
        /**
         * Sets the "QueryFeatureSet" element
         */
        void setQueryFeatureSet(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet queryFeatureSet);
        
        /**
         * Appends and returns a new empty "QueryFeatureSet" element
         */
        com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet addNewQueryFeatureSet();
        
        /**
         * Unsets the "QueryFeatureSet" element
         */
        void unsetQueryFeatureSet();
        
        /**
         * An XML QueryFeatureSet(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
         *
         * This is a complex type.
         */
        public interface QueryFeatureSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryFeatureSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("queryfeatureset6997elemtype");
            
            /**
             * Gets the "KeyValues" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType getKeyValues();
            
            /**
             * True if has "KeyValues" element
             */
            boolean isSetKeyValues();
            
            /**
             * Sets the "KeyValues" element
             */
            void setKeyValues(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType keyValues);
            
            /**
             * Appends and returns a new empty "KeyValues" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType addNewKeyValues();
            
            /**
             * Unsets the "KeyValues" element
             */
            void unsetKeyValues();
            
            /**
             * Gets the "AddFeatures" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType getAddFeatures();
            
            /**
             * True if has "AddFeatures" element
             */
            boolean isSetAddFeatures();
            
            /**
             * Sets the "AddFeatures" element
             */
            void setAddFeatures(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addFeatures);
            
            /**
             * Appends and returns a new empty "AddFeatures" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addNewAddFeatures();
            
            /**
             * Unsets the "AddFeatures" element
             */
            void unsetAddFeatures();
            
            /**
             * Gets the "Personalisations" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType getPersonalisations();
            
            /**
             * True if has "Personalisations" element
             */
            boolean isSetPersonalisations();
            
            /**
             * Sets the "Personalisations" element
             */
            void setPersonalisations(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType personalisations);
            
            /**
             * Appends and returns a new empty "Personalisations" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType addNewPersonalisations();
            
            /**
             * Unsets the "Personalisations" element
             */
            void unsetPersonalisations();
            
            /**
             * Gets the "NestedFeatureActions" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions getNestedFeatureActions();
            
            /**
             * True if has "NestedFeatureActions" element
             */
            boolean isSetNestedFeatureActions();
            
            /**
             * Sets the "NestedFeatureActions" element
             */
            void setNestedFeatureActions(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions nestedFeatureActions);
            
            /**
             * Appends and returns a new empty "NestedFeatureActions" element
             */
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions addNewNestedFeatureActions();
            
            /**
             * Unsets the "NestedFeatureActions" element
             */
            void unsetNestedFeatureActions();
            
            /**
             * Gets the "FeatureSetName" attribute
             */
            java.lang.String getFeatureSetName();
            
            /**
             * Gets (as xml) the "FeatureSetName" attribute
             */
            org.apache.xmlbeans.XmlString xgetFeatureSetName();
            
            /**
             * True if has "FeatureSetName" attribute
             */
            boolean isSetFeatureSetName();
            
            /**
             * Sets the "FeatureSetName" attribute
             */
            void setFeatureSetName(java.lang.String featureSetName);
            
            /**
             * Sets (as xml) the "FeatureSetName" attribute
             */
            void xsetFeatureSetName(org.apache.xmlbeans.XmlString featureSetName);
            
            /**
             * Unsets the "FeatureSetName" attribute
             */
            void unsetFeatureSetName();
            
            /**
             * Gets the "Action" attribute
             */
            java.lang.String getAction();
            
            /**
             * Gets (as xml) the "Action" attribute
             */
            org.apache.xmlbeans.XmlString xgetAction();
            
            /**
             * True if has "Action" attribute
             */
            boolean isSetAction();
            
            /**
             * Sets the "Action" attribute
             */
            void setAction(java.lang.String action);
            
            /**
             * Sets (as xml) the "Action" attribute
             */
            void xsetAction(org.apache.xmlbeans.XmlString action);
            
            /**
             * Unsets the "Action" attribute
             */
            void unsetAction();
            
            /**
             * Gets the "Mode" attribute
             */
            java.lang.String getMode();
            
            /**
             * Gets (as xml) the "Mode" attribute
             */
            org.apache.xmlbeans.XmlString xgetMode();
            
            /**
             * True if has "Mode" attribute
             */
            boolean isSetMode();
            
            /**
             * Sets the "Mode" attribute
             */
            void setMode(java.lang.String mode);
            
            /**
             * Sets (as xml) the "Mode" attribute
             */
            void xsetMode(org.apache.xmlbeans.XmlString mode);
            
            /**
             * Unsets the "Mode" attribute
             */
            void unsetMode();
            
            /**
             * Gets the "NeType" attribute
             */
            java.lang.String getNeType();
            
            /**
             * Gets (as xml) the "NeType" attribute
             */
            org.apache.xmlbeans.XmlString xgetNeType();
            
            /**
             * True if has "NeType" attribute
             */
            boolean isSetNeType();
            
            /**
             * Sets the "NeType" attribute
             */
            void setNeType(java.lang.String neType);
            
            /**
             * Sets (as xml) the "NeType" attribute
             */
            void xsetNeType(org.apache.xmlbeans.XmlString neType);
            
            /**
             * Unsets the "NeType" attribute
             */
            void unsetNeType();
            
            /**
             * An XML NestedFeatureActions(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
             *
             * This is a complex type.
             */
            public interface NestedFeatureActions extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NestedFeatureActions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("nestedfeatureactions1a51elemtype");
                
                /**
                 * Gets a List of "NestedFeature" elements
                 */
                java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature> getNestedFeatureList();
                
                /**
                 * Gets array of all "NestedFeature" elements
                 * @deprecated
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature[] getNestedFeatureArray();
                
                /**
                 * Gets ith "NestedFeature" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature getNestedFeatureArray(int i);
                
                /**
                 * Returns number of "NestedFeature" element
                 */
                int sizeOfNestedFeatureArray();
                
                /**
                 * Sets array of all "NestedFeature" element
                 */
                void setNestedFeatureArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature[] nestedFeatureArray);
                
                /**
                 * Sets ith "NestedFeature" element
                 */
                void setNestedFeatureArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature nestedFeature);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "NestedFeature" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature insertNewNestedFeature(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "NestedFeature" element
                 */
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature addNewNestedFeature();
                
                /**
                 * Removes the ith "NestedFeature" element
                 */
                void removeNestedFeature(int i);
                
                /**
                 * An XML NestedFeature(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
                 *
                 * This is a complex type.
                 */
                public interface NestedFeature extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NestedFeature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("nestedfeature6ea6elemtype");
                    
                    /**
                     * Gets the "Personalisations" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType getPersonalisations();
                    
                    /**
                     * True if has "Personalisations" element
                     */
                    boolean isSetPersonalisations();
                    
                    /**
                     * Sets the "Personalisations" element
                     */
                    void setPersonalisations(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType personalisations);
                    
                    /**
                     * Appends and returns a new empty "Personalisations" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType addNewPersonalisations();
                    
                    /**
                     * Unsets the "Personalisations" element
                     */
                    void unsetPersonalisations();
                    
                    /**
                     * Gets the "KeyValues" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType getKeyValues();
                    
                    /**
                     * True if has "KeyValues" element
                     */
                    boolean isSetKeyValues();
                    
                    /**
                     * Sets the "KeyValues" element
                     */
                    void setKeyValues(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType keyValues);
                    
                    /**
                     * Appends and returns a new empty "KeyValues" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType addNewKeyValues();
                    
                    /**
                     * Unsets the "KeyValues" element
                     */
                    void unsetKeyValues();
                    
                    /**
                     * Gets the "AddFeatures" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType getAddFeatures();
                    
                    /**
                     * True if has "AddFeatures" element
                     */
                    boolean isSetAddFeatures();
                    
                    /**
                     * Sets the "AddFeatures" element
                     */
                    void setAddFeatures(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addFeatures);
                    
                    /**
                     * Appends and returns a new empty "AddFeatures" element
                     */
                    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType addNewAddFeatures();
                    
                    /**
                     * Unsets the "AddFeatures" element
                     */
                    void unsetAddFeatures();
                    
                    /**
                     * Gets the "FeatureSetName" attribute
                     */
                    java.lang.String getFeatureSetName();
                    
                    /**
                     * Gets (as xml) the "FeatureSetName" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetFeatureSetName();
                    
                    /**
                     * True if has "FeatureSetName" attribute
                     */
                    boolean isSetFeatureSetName();
                    
                    /**
                     * Sets the "FeatureSetName" attribute
                     */
                    void setFeatureSetName(java.lang.String featureSetName);
                    
                    /**
                     * Sets (as xml) the "FeatureSetName" attribute
                     */
                    void xsetFeatureSetName(org.apache.xmlbeans.XmlString featureSetName);
                    
                    /**
                     * Unsets the "FeatureSetName" attribute
                     */
                    void unsetFeatureSetName();
                    
                    /**
                     * Gets the "Action" attribute
                     */
                    java.lang.String getAction();
                    
                    /**
                     * Gets (as xml) the "Action" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetAction();
                    
                    /**
                     * True if has "Action" attribute
                     */
                    boolean isSetAction();
                    
                    /**
                     * Sets the "Action" attribute
                     */
                    void setAction(java.lang.String action);
                    
                    /**
                     * Sets (as xml) the "Action" attribute
                     */
                    void xsetAction(org.apache.xmlbeans.XmlString action);
                    
                    /**
                     * Unsets the "Action" attribute
                     */
                    void unsetAction();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature newInstance() {
                        return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions.NestedFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions newInstance() {
                      return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet.NestedFeatureActions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet newInstance() {
                  return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse.QueryFeatureSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse newInstance() {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType.EptResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType newInstance() {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.EptResponseHLRType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
