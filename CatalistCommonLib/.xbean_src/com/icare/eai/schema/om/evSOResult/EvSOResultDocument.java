/*
 * An XML document type.
 * Localname: evSOResult
 * Namespace: com/icare/eai/schema/om/evSOResult
 * Java type: com.icare.eai.schema.om.evSOResult.EvSOResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSOResult;


/**
 * A document containing one evSOResult(@com/icare/eai/schema/om/evSOResult) element.
 *
 * This is a complex type.
 */
public interface EvSOResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvSOResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("evsoresultae4fdoctype");
    
    /**
     * Gets the "evSOResult" element
     */
    com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult getEvSOResult();
    
    /**
     * Sets the "evSOResult" element
     */
    void setEvSOResult(com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult evSOResult);
    
    /**
     * Appends and returns a new empty "evSOResult" element
     */
    com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult addNewEvSOResult();
    
    /**
     * An XML evSOResult(@com/icare/eai/schema/om/evSOResult).
     *
     * This is a complex type.
     */
    public interface EvSOResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvSOResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("evsoresult8a35elemtype");
        
        /**
         * Gets the "SOID" element
         */
        java.lang.String getSOID();
        
        /**
         * Gets (as xml) the "SOID" element
         */
        org.apache.xmlbeans.XmlString xgetSOID();
        
        /**
         * True if has "SOID" element
         */
        boolean isSetSOID();
        
        /**
         * Sets the "SOID" element
         */
        void setSOID(java.lang.String soid);
        
        /**
         * Sets (as xml) the "SOID" element
         */
        void xsetSOID(org.apache.xmlbeans.XmlString soid);
        
        /**
         * Unsets the "SOID" element
         */
        void unsetSOID();
        
        /**
         * Gets the "SO_Result_Code" element
         */
        java.lang.String getSOResultCode();
        
        /**
         * Gets (as xml) the "SO_Result_Code" element
         */
        org.apache.xmlbeans.XmlString xgetSOResultCode();
        
        /**
         * True if has "SO_Result_Code" element
         */
        boolean isSetSOResultCode();
        
        /**
         * Sets the "SO_Result_Code" element
         */
        void setSOResultCode(java.lang.String soResultCode);
        
        /**
         * Sets (as xml) the "SO_Result_Code" element
         */
        void xsetSOResultCode(org.apache.xmlbeans.XmlString soResultCode);
        
        /**
         * Unsets the "SO_Result_Code" element
         */
        void unsetSOResultCode();
        
        /**
         * Gets the "SOErrDesc" element
         */
        java.lang.String getSOErrDesc();
        
        /**
         * Gets (as xml) the "SOErrDesc" element
         */
        org.apache.xmlbeans.XmlString xgetSOErrDesc();
        
        /**
         * True if has "SOErrDesc" element
         */
        boolean isSetSOErrDesc();
        
        /**
         * Sets the "SOErrDesc" element
         */
        void setSOErrDesc(java.lang.String soErrDesc);
        
        /**
         * Sets (as xml) the "SOErrDesc" element
         */
        void xsetSOErrDesc(org.apache.xmlbeans.XmlString soErrDesc);
        
        /**
         * Unsets the "SOErrDesc" element
         */
        void unsetSOErrDesc();
        
        /**
         * Gets a List of "ServiceElementResult" elements
         */
        java.util.List<com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult> getServiceElementResultList();
        
        /**
         * Gets array of all "ServiceElementResult" elements
         * @deprecated
         */
        com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult[] getServiceElementResultArray();
        
        /**
         * Gets ith "ServiceElementResult" element
         */
        com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult getServiceElementResultArray(int i);
        
        /**
         * Returns number of "ServiceElementResult" element
         */
        int sizeOfServiceElementResultArray();
        
        /**
         * Sets array of all "ServiceElementResult" element
         */
        void setServiceElementResultArray(com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult[] serviceElementResultArray);
        
        /**
         * Sets ith "ServiceElementResult" element
         */
        void setServiceElementResultArray(int i, com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult serviceElementResult);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ServiceElementResult" element
         */
        com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult insertNewServiceElementResult(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ServiceElementResult" element
         */
        com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult addNewServiceElementResult();
        
        /**
         * Removes the ith "ServiceElementResult" element
         */
        void removeServiceElementResult(int i);
        
        /**
         * An XML ServiceElementResult(@com/icare/eai/schema/om/evSOResult).
         *
         * This is a complex type.
         */
        public interface ServiceElementResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceElementResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("serviceelementresultd3f5elemtype");
            
            /**
             * Gets the "ServiceElement" element
             */
            java.lang.String getServiceElement();
            
            /**
             * Gets (as xml) the "ServiceElement" element
             */
            org.apache.xmlbeans.XmlString xgetServiceElement();
            
            /**
             * True if has "ServiceElement" element
             */
            boolean isSetServiceElement();
            
            /**
             * Sets the "ServiceElement" element
             */
            void setServiceElement(java.lang.String serviceElement);
            
            /**
             * Sets (as xml) the "ServiceElement" element
             */
            void xsetServiceElement(org.apache.xmlbeans.XmlString serviceElement);
            
            /**
             * Unsets the "ServiceElement" element
             */
            void unsetServiceElement();
            
            /**
             * Gets the "SEID" element
             */
            java.lang.String getSEID();
            
            /**
             * Gets (as xml) the "SEID" element
             */
            org.apache.xmlbeans.XmlString xgetSEID();
            
            /**
             * True if has "SEID" element
             */
            boolean isSetSEID();
            
            /**
             * Sets the "SEID" element
             */
            void setSEID(java.lang.String seid);
            
            /**
             * Sets (as xml) the "SEID" element
             */
            void xsetSEID(org.apache.xmlbeans.XmlString seid);
            
            /**
             * Unsets the "SEID" element
             */
            void unsetSEID();
            
            /**
             * Gets the "SEProvDate" element
             */
            java.lang.String getSEProvDate();
            
            /**
             * Gets (as xml) the "SEProvDate" element
             */
            org.apache.xmlbeans.XmlString xgetSEProvDate();
            
            /**
             * True if has "SEProvDate" element
             */
            boolean isSetSEProvDate();
            
            /**
             * Sets the "SEProvDate" element
             */
            void setSEProvDate(java.lang.String seProvDate);
            
            /**
             * Sets (as xml) the "SEProvDate" element
             */
            void xsetSEProvDate(org.apache.xmlbeans.XmlString seProvDate);
            
            /**
             * Unsets the "SEProvDate" element
             */
            void unsetSEProvDate();
            
            /**
             * Gets the "SEResultCode" element
             */
            java.lang.String getSEResultCode();
            
            /**
             * Gets (as xml) the "SEResultCode" element
             */
            org.apache.xmlbeans.XmlString xgetSEResultCode();
            
            /**
             * True if has "SEResultCode" element
             */
            boolean isSetSEResultCode();
            
            /**
             * Sets the "SEResultCode" element
             */
            void setSEResultCode(java.lang.String seResultCode);
            
            /**
             * Sets (as xml) the "SEResultCode" element
             */
            void xsetSEResultCode(org.apache.xmlbeans.XmlString seResultCode);
            
            /**
             * Unsets the "SEResultCode" element
             */
            void unsetSEResultCode();
            
            /**
             * Gets the "SEErrDesc" element
             */
            java.lang.String getSEErrDesc();
            
            /**
             * Gets (as xml) the "SEErrDesc" element
             */
            org.apache.xmlbeans.XmlString xgetSEErrDesc();
            
            /**
             * True if has "SEErrDesc" element
             */
            boolean isSetSEErrDesc();
            
            /**
             * Sets the "SEErrDesc" element
             */
            void setSEErrDesc(java.lang.String seErrDesc);
            
            /**
             * Sets (as xml) the "SEErrDesc" element
             */
            void xsetSEErrDesc(org.apache.xmlbeans.XmlString seErrDesc);
            
            /**
             * Unsets the "SEErrDesc" element
             */
            void unsetSEErrDesc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult newInstance() {
                  return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult.ServiceElementResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult newInstance() {
              return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument.EvSOResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument newInstance() {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSOResult.EvSOResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSOResult.EvSOResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
