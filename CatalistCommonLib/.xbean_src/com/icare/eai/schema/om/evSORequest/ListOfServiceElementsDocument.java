/*
 * An XML document type.
 * Localname: ListOfServiceElements
 * Namespace: com/icare/eai/schema/om/evSORequest
 * Java type: com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSORequest;


/**
 * A document containing one ListOfServiceElements(@com/icare/eai/schema/om/evSORequest) element.
 *
 * This is a complex type.
 */
public interface ListOfServiceElementsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfServiceElementsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("listofserviceelements7a98doctype");
    
    /**
     * Gets the "ListOfServiceElements" element
     */
    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements getListOfServiceElements();
    
    /**
     * Sets the "ListOfServiceElements" element
     */
    void setListOfServiceElements(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements listOfServiceElements);
    
    /**
     * Appends and returns a new empty "ListOfServiceElements" element
     */
    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements addNewListOfServiceElements();
    
    /**
     * An XML ListOfServiceElements(@com/icare/eai/schema/om/evSORequest).
     *
     * This is a complex type.
     */
    public interface ListOfServiceElements extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfServiceElements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("listofserviceelementsf95belemtype");
        
        /**
         * Gets the "ListOfElements" element
         */
        com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType getListOfElements();
        
        /**
         * True if has "ListOfElements" element
         */
        boolean isSetListOfElements();
        
        /**
         * Sets the "ListOfElements" element
         */
        void setListOfElements(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType listOfElements);
        
        /**
         * Appends and returns a new empty "ListOfElements" element
         */
        com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType addNewListOfElements();
        
        /**
         * Unsets the "ListOfElements" element
         */
        void unsetListOfElements();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements newInstance() {
              return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument newInstance() {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
