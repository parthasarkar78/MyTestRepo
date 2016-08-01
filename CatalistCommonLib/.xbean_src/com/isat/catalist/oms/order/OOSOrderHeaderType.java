/*
 * XML Type:  OOSOrderHeaderType
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OOSOrderHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order;


/**
 * An XML OOSOrderHeaderType(@http://oms.catalist.isat.com/order).
 *
 * This is a complex type.
 */
public interface OOSOrderHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OOSOrderHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oosorderheadertype5b7etype");
    
    /**
     * Gets the "ID" element
     */
    int getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlInt xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(int id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlInt id);
    
    /**
     * Gets the "orderType" element
     */
    java.lang.String getOrderType();
    
    /**
     * Gets (as xml) the "orderType" element
     */
    org.apache.xmlbeans.XmlString xgetOrderType();
    
    /**
     * Sets the "orderType" element
     */
    void setOrderType(java.lang.String orderType);
    
    /**
     * Sets (as xml) the "orderType" element
     */
    void xsetOrderType(org.apache.xmlbeans.XmlString orderType);
    
    /**
     * Gets the "channel" element
     */
    java.lang.String getChannel();
    
    /**
     * Gets (as xml) the "channel" element
     */
    org.apache.xmlbeans.XmlString xgetChannel();
    
    /**
     * Sets the "channel" element
     */
    void setChannel(java.lang.String channel);
    
    /**
     * Sets (as xml) the "channel" element
     */
    void xsetChannel(org.apache.xmlbeans.XmlString channel);
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Gets the "userCreate" element
     */
    java.lang.String getUserCreate();
    
    /**
     * Gets (as xml) the "userCreate" element
     */
    org.apache.xmlbeans.XmlString xgetUserCreate();
    
    /**
     * Sets the "userCreate" element
     */
    void setUserCreate(java.lang.String userCreate);
    
    /**
     * Sets (as xml) the "userCreate" element
     */
    void xsetUserCreate(org.apache.xmlbeans.XmlString userCreate);
    
    /**
     * Gets the "key1" element
     */
    java.lang.String getKey1();
    
    /**
     * Gets (as xml) the "key1" element
     */
    org.apache.xmlbeans.XmlString xgetKey1();
    
    /**
     * Sets the "key1" element
     */
    void setKey1(java.lang.String key1);
    
    /**
     * Sets (as xml) the "key1" element
     */
    void xsetKey1(org.apache.xmlbeans.XmlString key1);
    
    /**
     * Gets the "key2" element
     */
    java.lang.String getKey2();
    
    /**
     * Gets (as xml) the "key2" element
     */
    org.apache.xmlbeans.XmlString xgetKey2();
    
    /**
     * Sets the "key2" element
     */
    void setKey2(java.lang.String key2);
    
    /**
     * Sets (as xml) the "key2" element
     */
    void xsetKey2(org.apache.xmlbeans.XmlString key2);
    
    /**
     * Gets the "key3" element
     */
    java.lang.String getKey3();
    
    /**
     * Gets (as xml) the "key3" element
     */
    org.apache.xmlbeans.XmlString xgetKey3();
    
    /**
     * Sets the "key3" element
     */
    void setKey3(java.lang.String key3);
    
    /**
     * Sets (as xml) the "key3" element
     */
    void xsetKey3(org.apache.xmlbeans.XmlString key3);
    
    /**
     * Gets the "refID" element
     */
    java.lang.String getRefID();
    
    /**
     * Gets (as xml) the "refID" element
     */
    org.apache.xmlbeans.XmlString xgetRefID();
    
    /**
     * Sets the "refID" element
     */
    void setRefID(java.lang.String refID);
    
    /**
     * Sets (as xml) the "refID" element
     */
    void xsetRefID(org.apache.xmlbeans.XmlString refID);
    
    /**
     * Gets the "execDate" element
     */
    java.util.Calendar getExecDate();
    
    /**
     * Gets (as xml) the "execDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExecDate();
    
    /**
     * Sets the "execDate" element
     */
    void setExecDate(java.util.Calendar execDate);
    
    /**
     * Sets (as xml) the "execDate" element
     */
    void xsetExecDate(org.apache.xmlbeans.XmlDateTime execDate);
    
    /**
     * Gets the "startExecDate" element
     */
    java.util.Calendar getStartExecDate();
    
    /**
     * Gets (as xml) the "startExecDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartExecDate();
    
    /**
     * Sets the "startExecDate" element
     */
    void setStartExecDate(java.util.Calendar startExecDate);
    
    /**
     * Sets (as xml) the "startExecDate" element
     */
    void xsetStartExecDate(org.apache.xmlbeans.XmlDateTime startExecDate);
    
    /**
     * Gets the "endExecDate" element
     */
    java.util.Calendar getEndExecDate();
    
    /**
     * Gets (as xml) the "endExecDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndExecDate();
    
    /**
     * Sets the "endExecDate" element
     */
    void setEndExecDate(java.util.Calendar endExecDate);
    
    /**
     * Sets (as xml) the "endExecDate" element
     */
    void xsetEndExecDate(org.apache.xmlbeans.XmlDateTime endExecDate);
    
    /**
     * Gets the "responded" element
     */
    boolean getResponded();
    
    /**
     * Gets (as xml) the "responded" element
     */
    org.apache.xmlbeans.XmlBoolean xgetResponded();
    
    /**
     * Sets the "responded" element
     */
    void setResponded(boolean responded);
    
    /**
     * Sets (as xml) the "responded" element
     */
    void xsetResponded(org.apache.xmlbeans.XmlBoolean responded);
    
    /**
     * Gets the "status" element
     */
    int getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.xmlbeans.XmlInt xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(int status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlInt status);
    
    /**
     * Gets the "statusErrorCode" element
     */
    java.lang.String getStatusErrorCode();
    
    /**
     * Gets (as xml) the "statusErrorCode" element
     */
    org.apache.xmlbeans.XmlString xgetStatusErrorCode();
    
    /**
     * Sets the "statusErrorCode" element
     */
    void setStatusErrorCode(java.lang.String statusErrorCode);
    
    /**
     * Sets (as xml) the "statusErrorCode" element
     */
    void xsetStatusErrorCode(org.apache.xmlbeans.XmlString statusErrorCode);
    
    /**
     * Gets the "statusErrorDescription" element
     */
    java.lang.String getStatusErrorDescription();
    
    /**
     * Gets (as xml) the "statusErrorDescription" element
     */
    org.apache.xmlbeans.XmlString xgetStatusErrorDescription();
    
    /**
     * Sets the "statusErrorDescription" element
     */
    void setStatusErrorDescription(java.lang.String statusErrorDescription);
    
    /**
     * Sets (as xml) the "statusErrorDescription" element
     */
    void xsetStatusErrorDescription(org.apache.xmlbeans.XmlString statusErrorDescription);
    
    /**
     * Gets the "dpdOrderID" element
     */
    int getDpdOrderID();
    
    /**
     * Gets (as xml) the "dpdOrderID" element
     */
    org.apache.xmlbeans.XmlInt xgetDpdOrderID();
    
    /**
     * Sets the "dpdOrderID" element
     */
    void setDpdOrderID(int dpdOrderID);
    
    /**
     * Sets (as xml) the "dpdOrderID" element
     */
    void xsetDpdOrderID(org.apache.xmlbeans.XmlInt dpdOrderID);
    
    /**
     * Gets the "resubmitAttempt" element
     */
    int getResubmitAttempt();
    
    /**
     * Gets (as xml) the "resubmitAttempt" element
     */
    org.apache.xmlbeans.XmlInt xgetResubmitAttempt();
    
    /**
     * Sets the "resubmitAttempt" element
     */
    void setResubmitAttempt(int resubmitAttempt);
    
    /**
     * Sets (as xml) the "resubmitAttempt" element
     */
    void xsetResubmitAttempt(org.apache.xmlbeans.XmlInt resubmitAttempt);
    
    /**
     * Gets the "additionalField1" element
     */
    java.lang.String getAdditionalField1();
    
    /**
     * Gets (as xml) the "additionalField1" element
     */
    org.apache.xmlbeans.XmlString xgetAdditionalField1();
    
    /**
     * Sets the "additionalField1" element
     */
    void setAdditionalField1(java.lang.String additionalField1);
    
    /**
     * Sets (as xml) the "additionalField1" element
     */
    void xsetAdditionalField1(org.apache.xmlbeans.XmlString additionalField1);
    
    /**
     * Gets the "additionalField2" element
     */
    java.lang.String getAdditionalField2();
    
    /**
     * Gets (as xml) the "additionalField2" element
     */
    org.apache.xmlbeans.XmlString xgetAdditionalField2();
    
    /**
     * Sets the "additionalField2" element
     */
    void setAdditionalField2(java.lang.String additionalField2);
    
    /**
     * Sets (as xml) the "additionalField2" element
     */
    void xsetAdditionalField2(org.apache.xmlbeans.XmlString additionalField2);
    
    /**
     * Gets the "additionalField3" element
     */
    java.lang.String getAdditionalField3();
    
    /**
     * Gets (as xml) the "additionalField3" element
     */
    org.apache.xmlbeans.XmlString xgetAdditionalField3();
    
    /**
     * Sets the "additionalField3" element
     */
    void setAdditionalField3(java.lang.String additionalField3);
    
    /**
     * Sets (as xml) the "additionalField3" element
     */
    void xsetAdditionalField3(org.apache.xmlbeans.XmlString additionalField3);
    
    /**
     * Gets the "orderDate" element
     */
    java.util.Calendar getOrderDate();
    
    /**
     * Gets (as xml) the "orderDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetOrderDate();
    
    /**
     * Sets the "orderDate" element
     */
    void setOrderDate(java.util.Calendar orderDate);
    
    /**
     * Sets (as xml) the "orderDate" element
     */
    void xsetOrderDate(org.apache.xmlbeans.XmlDateTime orderDate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.isat.catalist.oms.order.OOSOrderHeaderType newInstance() {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OOSOrderHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OOSOrderHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
