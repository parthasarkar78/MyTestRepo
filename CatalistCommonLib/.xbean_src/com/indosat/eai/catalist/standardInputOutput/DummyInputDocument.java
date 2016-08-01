/*
 * An XML document type.
 * Localname: DummyInput
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyInputDocument
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput;


/**
 * A document containing one DummyInput(@http://catalist.eai.indosat.com/StandardInputOutput) element.
 *
 * This is a complex type.
 */
public interface DummyInputDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DummyInputDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("dummyinput754fdoctype");
    
    /**
     * Gets the "DummyInput" element
     */
    com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput getDummyInput();
    
    /**
     * Sets the "DummyInput" element
     */
    void setDummyInput(com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput dummyInput);
    
    /**
     * Appends and returns a new empty "DummyInput" element
     */
    com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput addNewDummyInput();
    
    /**
     * An XML DummyInput(@http://catalist.eai.indosat.com/StandardInputOutput).
     *
     * This is a complex type.
     */
    public interface DummyInput extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DummyInput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("dummyinputaa51elemtype");
        
        /**
         * Gets the "Request" element
         */
        com.indosat.eai.catalist.standardInputOutput.RequestType getRequest();
        
        /**
         * Sets the "Request" element
         */
        void setRequest(com.indosat.eai.catalist.standardInputOutput.RequestType request);
        
        /**
         * Appends and returns a new empty "Request" element
         */
        com.indosat.eai.catalist.standardInputOutput.RequestType addNewRequest();
        
        /**
         * Gets the "Input" element
         */
        com.indosat.eai.catalist.standardInputOutput.DummyInputType getInput();
        
        /**
         * Sets the "Input" element
         */
        void setInput(com.indosat.eai.catalist.standardInputOutput.DummyInputType input);
        
        /**
         * Appends and returns a new empty "Input" element
         */
        com.indosat.eai.catalist.standardInputOutput.DummyInputType addNewInput();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput newInstance() {
              return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument newInstance() {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
