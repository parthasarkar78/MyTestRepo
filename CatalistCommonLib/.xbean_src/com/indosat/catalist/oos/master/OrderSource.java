/*
 * XML Type:  OrderSource
 * Namespace: http://oos.catalist.indosat.com/Master
 * Java type: com.indosat.catalist.oos.master.OrderSource
 *
 * Automatically generated - do not modify.
 */
package com.indosat.catalist.oos.master;


/**
 * An XML OrderSource(@http://oos.catalist.indosat.com/Master).
 *
 * This is a complex type.
 */
public interface OrderSource extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("ordersource5e20type");
    
    /**
     * Gets the "SourceName" element
     */
    java.lang.String getSourceName();
    
    /**
     * Gets (as xml) the "SourceName" element
     */
    org.apache.xmlbeans.XmlString xgetSourceName();
    
    /**
     * Sets the "SourceName" element
     */
    void setSourceName(java.lang.String sourceName);
    
    /**
     * Sets (as xml) the "SourceName" element
     */
    void xsetSourceName(org.apache.xmlbeans.XmlString sourceName);
    
    /**
     * Gets the "ClassName" element
     */
    java.lang.String getClassName();
    
    /**
     * Gets (as xml) the "ClassName" element
     */
    org.apache.xmlbeans.XmlString xgetClassName();
    
    /**
     * Sets the "ClassName" element
     */
    void setClassName(java.lang.String className);
    
    /**
     * Sets (as xml) the "ClassName" element
     */
    void xsetClassName(org.apache.xmlbeans.XmlString className);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.catalist.oos.master.OrderSource newInstance() {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.catalist.oos.master.OrderSource parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.catalist.oos.master.OrderSource parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.catalist.oos.master.OrderSource parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.catalist.oos.master.OrderSource parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.catalist.oos.master.OrderSource parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.catalist.oos.master.OrderSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
