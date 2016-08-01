/*
 * XML Type:  PersonalisationsComplexType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13;


/**
 * An XML PersonalisationsComplexType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public interface PersonalisationsComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonalisationsComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("personalisationscomplextypee0aftype");
    
    /**
     * Gets a List of "Personalisation" elements
     */
    java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation> getPersonalisationList();
    
    /**
     * Gets array of all "Personalisation" elements
     * @deprecated
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation[] getPersonalisationArray();
    
    /**
     * Gets ith "Personalisation" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation getPersonalisationArray(int i);
    
    /**
     * Returns number of "Personalisation" element
     */
    int sizeOfPersonalisationArray();
    
    /**
     * Sets array of all "Personalisation" element
     */
    void setPersonalisationArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation[] personalisationArray);
    
    /**
     * Sets ith "Personalisation" element
     */
    void setPersonalisationArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation personalisation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Personalisation" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation insertNewPersonalisation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Personalisation" element
     */
    com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation addNewPersonalisation();
    
    /**
     * Removes the ith "Personalisation" element
     */
    void removePersonalisation(int i);
    
    /**
     * An XML Personalisation(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public interface Personalisation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Personalisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("personalisatione178elemtype");
        
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
         * Gets the "PersonalisationName" attribute
         */
        java.lang.String getPersonalisationName();
        
        /**
         * Gets (as xml) the "PersonalisationName" attribute
         */
        org.apache.xmlbeans.XmlString xgetPersonalisationName();
        
        /**
         * True if has "PersonalisationName" attribute
         */
        boolean isSetPersonalisationName();
        
        /**
         * Sets the "PersonalisationName" attribute
         */
        void setPersonalisationName(java.lang.String personalisationName);
        
        /**
         * Sets (as xml) the "PersonalisationName" attribute
         */
        void xsetPersonalisationName(org.apache.xmlbeans.XmlString personalisationName);
        
        /**
         * Unsets the "PersonalisationName" attribute
         */
        void unsetPersonalisationName();
        
        /**
         * Gets the "PersonalisationAction" attribute
         */
        java.lang.String getPersonalisationAction();
        
        /**
         * Gets (as xml) the "PersonalisationAction" attribute
         */
        org.apache.xmlbeans.XmlString xgetPersonalisationAction();
        
        /**
         * True if has "PersonalisationAction" attribute
         */
        boolean isSetPersonalisationAction();
        
        /**
         * Sets the "PersonalisationAction" attribute
         */
        void setPersonalisationAction(java.lang.String personalisationAction);
        
        /**
         * Sets (as xml) the "PersonalisationAction" attribute
         */
        void xsetPersonalisationAction(org.apache.xmlbeans.XmlString personalisationAction);
        
        /**
         * Unsets the "PersonalisationAction" attribute
         */
        void unsetPersonalisationAction();
        
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
         * Gets the "Parameters" attribute
         */
        java.lang.String getParameters();
        
        /**
         * Gets (as xml) the "Parameters" attribute
         */
        org.apache.xmlbeans.XmlString xgetParameters();
        
        /**
         * True if has "Parameters" attribute
         */
        boolean isSetParameters();
        
        /**
         * Sets the "Parameters" attribute
         */
        void setParameters(java.lang.String parameters);
        
        /**
         * Sets (as xml) the "Parameters" attribute
         */
        void xsetParameters(org.apache.xmlbeans.XmlString parameters);
        
        /**
         * Unsets the "Parameters" attribute
         */
        void unsetParameters();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation newInstance() {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType newInstance() {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
