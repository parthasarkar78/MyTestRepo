/*
 * An XML document type.
 * Localname: OOSOrchConfiguration
 * Namespace: http://oos.catalist.indosat.com/Master
 * Java type: com.indosat.catalist.oos.master.OOSOrchConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.indosat.catalist.oos.master;


/**
 * A document containing one OOSOrchConfiguration(@http://oos.catalist.indosat.com/Master) element.
 *
 * This is a complex type.
 */
public interface OOSOrchConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OOSOrchConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oosorchconfigurationde6cdoctype");
    
    /**
     * Gets the "OOSOrchConfiguration" element
     */
    com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration getOOSOrchConfiguration();
    
    /**
     * Sets the "OOSOrchConfiguration" element
     */
    void setOOSOrchConfiguration(com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration oosOrchConfiguration);
    
    /**
     * Appends and returns a new empty "OOSOrchConfiguration" element
     */
    com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration addNewOOSOrchConfiguration();
    
    /**
     * An XML OOSOrchConfiguration(@http://oos.catalist.indosat.com/Master).
     *
     * This is a complex type.
     */
    public interface OOSOrchConfiguration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OOSOrchConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oosorchconfiguration4ae3elemtype");
        
        /**
         * Gets the "Source" element
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "Source" element
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * Sets the "Source" element
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "Source" element
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Gets the "OrderType" element
         */
        java.lang.String getOrderType();
        
        /**
         * Gets (as xml) the "OrderType" element
         */
        org.apache.xmlbeans.XmlString xgetOrderType();
        
        /**
         * Sets the "OrderType" element
         */
        void setOrderType(java.lang.String orderType);
        
        /**
         * Sets (as xml) the "OrderType" element
         */
        void xsetOrderType(org.apache.xmlbeans.XmlString orderType);
        
        /**
         * Gets a List of "Services" elements
         */
        java.util.List<com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services> getServicesList();
        
        /**
         * Gets array of all "Services" elements
         * @deprecated
         */
        com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services[] getServicesArray();
        
        /**
         * Gets ith "Services" element
         */
        com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services getServicesArray(int i);
        
        /**
         * Returns number of "Services" element
         */
        int sizeOfServicesArray();
        
        /**
         * Sets array of all "Services" element
         */
        void setServicesArray(com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services[] servicesArray);
        
        /**
         * Sets ith "Services" element
         */
        void setServicesArray(int i, com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services services);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Services" element
         */
        com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services insertNewServices(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Services" element
         */
        com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services addNewServices();
        
        /**
         * Removes the ith "Services" element
         */
        void removeServices(int i);
        
        /**
         * An XML Services(@http://oos.catalist.indosat.com/Master).
         *
         * This is a complex type.
         */
        public interface Services extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Services.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("servicesca09elemtype");
            
            /**
             * Gets the "service" element
             */
            java.lang.String getService();
            
            /**
             * Gets (as xml) the "service" element
             */
            org.apache.xmlbeans.XmlString xgetService();
            
            /**
             * Sets the "service" element
             */
            void setService(java.lang.String service);
            
            /**
             * Sets (as xml) the "service" element
             */
            void xsetService(org.apache.xmlbeans.XmlString service);
            
            /**
             * Gets the "execution" element
             */
            int getExecution();
            
            /**
             * Gets (as xml) the "execution" element
             */
            org.apache.xmlbeans.XmlInt xgetExecution();
            
            /**
             * Sets the "execution" element
             */
            void setExecution(int execution);
            
            /**
             * Sets (as xml) the "execution" element
             */
            void xsetExecution(org.apache.xmlbeans.XmlInt execution);
            
            /**
             * Gets the "hasOutput" element
             */
            boolean getHasOutput();
            
            /**
             * Gets (as xml) the "hasOutput" element
             */
            org.apache.xmlbeans.XmlBoolean xgetHasOutput();
            
            /**
             * Sets the "hasOutput" element
             */
            void setHasOutput(boolean hasOutput);
            
            /**
             * Sets (as xml) the "hasOutput" element
             */
            void xsetHasOutput(org.apache.xmlbeans.XmlBoolean hasOutput);
            
            /**
             * Gets a List of "dependSeqID" elements
             */
            java.util.List<java.lang.Integer> getDependSeqIDList();
            
            /**
             * Gets array of all "dependSeqID" elements
             * @deprecated
             */
            int[] getDependSeqIDArray();
            
            /**
             * Gets ith "dependSeqID" element
             */
            int getDependSeqIDArray(int i);
            
            /**
             * Gets (as xml) a List of "dependSeqID" elements
             */
            java.util.List<org.apache.xmlbeans.XmlInt> xgetDependSeqIDList();
            
            /**
             * Gets (as xml) array of all "dependSeqID" elements
             * @deprecated
             */
            org.apache.xmlbeans.XmlInt[] xgetDependSeqIDArray();
            
            /**
             * Gets (as xml) ith "dependSeqID" element
             */
            org.apache.xmlbeans.XmlInt xgetDependSeqIDArray(int i);
            
            /**
             * Returns number of "dependSeqID" element
             */
            int sizeOfDependSeqIDArray();
            
            /**
             * Sets array of all "dependSeqID" element
             */
            void setDependSeqIDArray(int[] dependSeqIDArray);
            
            /**
             * Sets ith "dependSeqID" element
             */
            void setDependSeqIDArray(int i, int dependSeqID);
            
            /**
             * Sets (as xml) array of all "dependSeqID" element
             */
            void xsetDependSeqIDArray(org.apache.xmlbeans.XmlInt[] dependSeqIDArray);
            
            /**
             * Sets (as xml) ith "dependSeqID" element
             */
            void xsetDependSeqIDArray(int i, org.apache.xmlbeans.XmlInt dependSeqID);
            
            /**
             * Inserts the value as the ith "dependSeqID" element
             */
            void insertDependSeqID(int i, int dependSeqID);
            
            /**
             * Appends the value as the last "dependSeqID" element
             */
            void addDependSeqID(int dependSeqID);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dependSeqID" element
             */
            org.apache.xmlbeans.XmlInt insertNewDependSeqID(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dependSeqID" element
             */
            org.apache.xmlbeans.XmlInt addNewDependSeqID();
            
            /**
             * Removes the ith "dependSeqID" element
             */
            void removeDependSeqID(int i);
            
            /**
             * Gets the "seqID" element
             */
            int getSeqID();
            
            /**
             * Gets (as xml) the "seqID" element
             */
            org.apache.xmlbeans.XmlInt xgetSeqID();
            
            /**
             * Sets the "seqID" element
             */
            void setSeqID(int seqID);
            
            /**
             * Sets (as xml) the "seqID" element
             */
            void xsetSeqID(org.apache.xmlbeans.XmlInt seqID);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services newInstance() {
                  return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration.Services) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration newInstance() {
              return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument.OOSOrchConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument newInstance() {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.catalist.oos.master.OOSOrchConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.catalist.oos.master.OOSOrchConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
