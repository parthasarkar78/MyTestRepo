/*
 * XML Type:  KeyValuesComplexType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13;


/**
 * An XML KeyValuesComplexType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public interface KeyValuesComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyValuesComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("keyvaluescomplextype9bd6type");
    
    /**
     * Gets a List of "Key" elements
     */
    java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key> getKeyList();
    
    /**
     * Gets array of all "Key" elements
     * @deprecated
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key[] getKeyArray();
    
    /**
     * Gets ith "Key" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key getKeyArray(int i);
    
    /**
     * Returns number of "Key" element
     */
    int sizeOfKeyArray();
    
    /**
     * Sets array of all "Key" element
     */
    void setKeyArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key[] keyArray);
    
    /**
     * Sets ith "Key" element
     */
    void setKeyArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key key);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key insertNewKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key addNewKey();
    
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Key.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("keyaac1elemtype");
        
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
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key newInstance() {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType newInstance() {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.KeyValuesComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
