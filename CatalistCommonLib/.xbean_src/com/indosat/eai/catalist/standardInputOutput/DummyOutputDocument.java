/*
 * An XML document type.
 * Localname: DummyOutput
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput;


/**
 * A document containing one DummyOutput(@http://catalist.eai.indosat.com/StandardInputOutput) element.
 *
 * This is a complex type.
 */
public interface DummyOutputDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DummyOutputDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("dummyoutput7d04doctype");
    
    /**
     * Gets the "DummyOutput" element
     */
    com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput getDummyOutput();
    
    /**
     * Sets the "DummyOutput" element
     */
    void setDummyOutput(com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput dummyOutput);
    
    /**
     * Appends and returns a new empty "DummyOutput" element
     */
    com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput addNewDummyOutput();
    
    /**
     * An XML DummyOutput(@http://catalist.eai.indosat.com/StandardInputOutput).
     *
     * This is a complex type.
     */
    public interface DummyOutput extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DummyOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("dummyoutput5fd9elemtype");
        
        /**
         * Gets the "Status" element
         */
        com.indosat.eai.catalist.standardInputOutput.StatusType getStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.indosat.eai.catalist.standardInputOutput.StatusType status);
        
        /**
         * Appends and returns a new empty "Status" element
         */
        com.indosat.eai.catalist.standardInputOutput.StatusType addNewStatus();
        
        /**
         * Gets the "Output" element
         */
        com.indosat.eai.catalist.standardInputOutput.DummyOutputType getOutput();
        
        /**
         * Sets the "Output" element
         */
        void setOutput(com.indosat.eai.catalist.standardInputOutput.DummyOutputType output);
        
        /**
         * Appends and returns a new empty "Output" element
         */
        com.indosat.eai.catalist.standardInputOutput.DummyOutputType addNewOutput();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput newInstance() {
              return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument newInstance() {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
