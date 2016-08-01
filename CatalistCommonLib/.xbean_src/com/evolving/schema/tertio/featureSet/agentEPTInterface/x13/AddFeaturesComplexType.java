/*
 * XML Type:  AddFeaturesComplexType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13;


/**
 * An XML AddFeaturesComplexType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public interface AddFeaturesComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddFeaturesComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("addfeaturescomplextype8ef3type");
    
    /**
     * Gets a List of "Feature" elements
     */
    java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature> getFeatureList();
    
    /**
     * Gets array of all "Feature" elements
     * @deprecated
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature[] getFeatureArray();
    
    /**
     * Gets ith "Feature" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature getFeatureArray(int i);
    
    /**
     * Returns number of "Feature" element
     */
    int sizeOfFeatureArray();
    
    /**
     * Sets array of all "Feature" element
     */
    void setFeatureArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature[] featureArray);
    
    /**
     * Sets ith "Feature" element
     */
    void setFeatureArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature feature);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Feature" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature insertNewFeature(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Feature" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature addNewFeature();
    
    /**
     * Removes the ith "Feature" element
     */
    void removeFeature(int i);
    
    /**
     * An XML Feature(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public interface Feature extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Feature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("feature9735elemtype");
        
        /**
         * Gets the "FeatureName" attribute
         */
        java.lang.String getFeatureName();
        
        /**
         * Gets (as xml) the "FeatureName" attribute
         */
        org.apache.xmlbeans.XmlString xgetFeatureName();
        
        /**
         * True if has "FeatureName" attribute
         */
        boolean isSetFeatureName();
        
        /**
         * Sets the "FeatureName" attribute
         */
        void setFeatureName(java.lang.String featureName);
        
        /**
         * Sets (as xml) the "FeatureName" attribute
         */
        void xsetFeatureName(org.apache.xmlbeans.XmlString featureName);
        
        /**
         * Unsets the "FeatureName" attribute
         */
        void unsetFeatureName();
        
        /**
         * Gets the "FeatureValue" attribute
         */
        java.lang.String getFeatureValue();
        
        /**
         * Gets (as xml) the "FeatureValue" attribute
         */
        org.apache.xmlbeans.XmlString xgetFeatureValue();
        
        /**
         * True if has "FeatureValue" attribute
         */
        boolean isSetFeatureValue();
        
        /**
         * Sets the "FeatureValue" attribute
         */
        void setFeatureValue(java.lang.String featureValue);
        
        /**
         * Sets (as xml) the "FeatureValue" attribute
         */
        void xsetFeatureValue(org.apache.xmlbeans.XmlString featureValue);
        
        /**
         * Unsets the "FeatureValue" attribute
         */
        void unsetFeatureValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature newInstance() {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType newInstance() {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
