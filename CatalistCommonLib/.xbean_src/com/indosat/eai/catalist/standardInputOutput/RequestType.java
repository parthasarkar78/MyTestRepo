/*
 * XML Type:  RequestType
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.RequestType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput;


/**
 * An XML RequestType(@http://catalist.eai.indosat.com/StandardInputOutput).
 *
 * This is a complex type.
 */
public interface RequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("requesttype17b4type");
    
    /**
     * Gets the "RequestID" element
     */
    java.lang.String getRequestID();
    
    /**
     * Gets (as xml) the "RequestID" element
     */
    org.apache.xmlbeans.XmlString xgetRequestID();
    
    /**
     * Sets the "RequestID" element
     */
    void setRequestID(java.lang.String requestID);
    
    /**
     * Sets (as xml) the "RequestID" element
     */
    void xsetRequestID(org.apache.xmlbeans.XmlString requestID);
    
    /**
     * Gets the "RequestSource" element
     */
    java.lang.String getRequestSource();
    
    /**
     * Gets (as xml) the "RequestSource" element
     */
    org.apache.xmlbeans.XmlString xgetRequestSource();
    
    /**
     * Sets the "RequestSource" element
     */
    void setRequestSource(java.lang.String requestSource);
    
    /**
     * Sets (as xml) the "RequestSource" element
     */
    void xsetRequestSource(org.apache.xmlbeans.XmlString requestSource);
    
    /**
     * Gets the "RequestDate" element
     */
    java.lang.String getRequestDate();
    
    /**
     * Gets (as xml) the "RequestDate" element
     */
    org.apache.xmlbeans.XmlString xgetRequestDate();
    
    /**
     * Sets the "RequestDate" element
     */
    void setRequestDate(java.lang.String requestDate);
    
    /**
     * Sets (as xml) the "RequestDate" element
     */
    void xsetRequestDate(org.apache.xmlbeans.XmlString requestDate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.eai.catalist.standardInputOutput.RequestType newInstance() {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
