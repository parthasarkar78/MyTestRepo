/*
 * XML Type:  DummyInputType
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyInputType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput;


/**
 * An XML DummyInputType(@http://catalist.eai.indosat.com/StandardInputOutput).
 *
 * This is a complex type.
 */
public interface DummyInputType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DummyInputType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("dummyinputtypec019type");
    
    /**
     * Gets the "MSISDN" element
     */
    java.lang.String getMSISDN();
    
    /**
     * Gets (as xml) the "MSISDN" element
     */
    org.apache.xmlbeans.XmlString xgetMSISDN();
    
    /**
     * Sets the "MSISDN" element
     */
    void setMSISDN(java.lang.String msisdn);
    
    /**
     * Sets (as xml) the "MSISDN" element
     */
    void xsetMSISDN(org.apache.xmlbeans.XmlString msisdn);
    
    /**
     * Gets the "ICCID" element
     */
    java.lang.String getICCID();
    
    /**
     * Gets (as xml) the "ICCID" element
     */
    org.apache.xmlbeans.XmlString xgetICCID();
    
    /**
     * Sets the "ICCID" element
     */
    void setICCID(java.lang.String iccid);
    
    /**
     * Sets (as xml) the "ICCID" element
     */
    void xsetICCID(org.apache.xmlbeans.XmlString iccid);
    
    /**
     * Gets the "IMSI" element
     */
    java.lang.String getIMSI();
    
    /**
     * Gets (as xml) the "IMSI" element
     */
    org.apache.xmlbeans.XmlString xgetIMSI();
    
    /**
     * Sets the "IMSI" element
     */
    void setIMSI(java.lang.String imsi);
    
    /**
     * Sets (as xml) the "IMSI" element
     */
    void xsetIMSI(org.apache.xmlbeans.XmlString imsi);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType newInstance() {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.eai.catalist.standardInputOutput.DummyInputType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.eai.catalist.standardInputOutput.DummyInputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
