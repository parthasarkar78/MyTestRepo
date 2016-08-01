/*
 * XML Type:  OOSOrderLineItemParamType
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OOSOrderLineItemParamType
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order;


/**
 * An XML OOSOrderLineItemParamType(@http://oms.catalist.isat.com/order).
 *
 * This is a complex type.
 */
public interface OOSOrderLineItemParamType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OOSOrderLineItemParamType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oosorderlineitemparamtypec00dtype");
    
    /**
     * Gets the "lineID" element
     */
    int getLineID();
    
    /**
     * Gets (as xml) the "lineID" element
     */
    org.apache.xmlbeans.XmlInt xgetLineID();
    
    /**
     * Sets the "lineID" element
     */
    void setLineID(int lineID);
    
    /**
     * Sets (as xml) the "lineID" element
     */
    void xsetLineID(org.apache.xmlbeans.XmlInt lineID);
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "value" element
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType newInstance() {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OOSOrderLineItemParamType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemParamType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
