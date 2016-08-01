/*
 * An XML document type.
 * Localname: evSORequest
 * Namespace: com/icare/eai/schema/om/evSORequest
 * Java type: com.icare.eai.schema.om.evSORequest.EvSORequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSORequest;


/**
 * A document containing one evSORequest(@com/icare/eai/schema/om/evSORequest) element.
 *
 * This is a complex type.
 */
public interface EvSORequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvSORequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("evsorequest6a03doctype");
    
    /**
     * Gets the "evSORequest" element
     */
    com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest getEvSORequest();
    
    /**
     * Sets the "evSORequest" element
     */
    void setEvSORequest(com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest evSORequest);
    
    /**
     * Appends and returns a new empty "evSORequest" element
     */
    com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest addNewEvSORequest();
    
    /**
     * An XML evSORequest(@com/icare/eai/schema/om/evSORequest).
     *
     * This is a complex type.
     */
    public interface EvSORequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvSORequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("evsorequesta5f1elemtype");
        
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
         * Gets a List of "Key" elements
         */
        java.util.List<com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key> getKeyList();
        
        /**
         * Gets array of all "Key" elements
         * @deprecated
         */
        com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key[] getKeyArray();
        
        /**
         * Gets ith "Key" element
         */
        com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key getKeyArray(int i);
        
        /**
         * Returns number of "Key" element
         */
        int sizeOfKeyArray();
        
        /**
         * Sets array of all "Key" element
         */
        void setKeyArray(com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key[] keyArray);
        
        /**
         * Sets ith "Key" element
         */
        void setKeyArray(int i, com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key key);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Key" element
         */
        com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key insertNewKey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Key" element
         */
        com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key addNewKey();
        
        /**
         * Removes the ith "Key" element
         */
        void removeKey(int i);
        
        /**
         * Gets the "ListOfServiceElements" element
         */
        com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType getListOfServiceElements();
        
        /**
         * True if has "ListOfServiceElements" element
         */
        boolean isSetListOfServiceElements();
        
        /**
         * Sets the "ListOfServiceElements" element
         */
        void setListOfServiceElements(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType listOfServiceElements);
        
        /**
         * Appends and returns a new empty "ListOfServiceElements" element
         */
        com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType addNewListOfServiceElements();
        
        /**
         * Unsets the "ListOfServiceElements" element
         */
        void unsetListOfServiceElements();
        
        /**
         * An XML Key(@com/icare/eai/schema/om/evSORequest).
         *
         * This is a complex type.
         */
        public interface Key extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Key.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("key049celemtype");
            
            /**
             * Gets the "Name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "Name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * True if has "Name" element
             */
            boolean isSetName();
            
            /**
             * Sets the "Name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "Name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Unsets the "Name" element
             */
            void unsetName();
            
            /**
             * Gets the "Value" element
             */
            java.lang.String getValue();
            
            /**
             * Gets (as xml) the "Value" element
             */
            org.apache.xmlbeans.XmlString xgetValue();
            
            /**
             * True if has "Value" element
             */
            boolean isSetValue();
            
            /**
             * Sets the "Value" element
             */
            void setValue(java.lang.String value);
            
            /**
             * Sets (as xml) the "Value" element
             */
            void xsetValue(org.apache.xmlbeans.XmlString value);
            
            /**
             * Unsets the "Value" element
             */
            void unsetValue();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key newInstance() {
                  return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest newInstance() {
              return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument.EvSORequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument newInstance() {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSORequest.EvSORequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSORequest.EvSORequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
