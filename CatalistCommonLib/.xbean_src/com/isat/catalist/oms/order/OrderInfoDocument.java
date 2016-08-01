/*
 * An XML document type.
 * Localname: OrderInfo
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OrderInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order;


/**
 * A document containing one OrderInfo(@http://oms.catalist.isat.com/order) element.
 *
 * This is a complex type.
 */
public interface OrderInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("orderinfo1066doctype");
    
    /**
     * Gets the "OrderInfo" element
     */
    com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo getOrderInfo();
    
    /**
     * Sets the "OrderInfo" element
     */
    void setOrderInfo(com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo orderInfo);
    
    /**
     * Appends and returns a new empty "OrderInfo" element
     */
    com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo addNewOrderInfo();
    
    /**
     * An XML OrderInfo(@http://oms.catalist.isat.com/order).
     *
     * This is a complex type.
     */
    public interface OrderInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("orderinfo27feelemtype");
        
        /**
         * Gets the "header" element
         */
        com.isat.catalist.oms.order.OOSOrderHeaderType getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(com.isat.catalist.oms.order.OOSOrderHeaderType header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        com.isat.catalist.oms.order.OOSOrderHeaderType addNewHeader();
        
        /**
         * Gets a List of "items" elements
         */
        java.util.List<com.isat.catalist.oms.order.OOSOrderLineItemType> getItemsList();
        
        /**
         * Gets array of all "items" elements
         * @deprecated
         */
        com.isat.catalist.oms.order.OOSOrderLineItemType[] getItemsArray();
        
        /**
         * Gets ith "items" element
         */
        com.isat.catalist.oms.order.OOSOrderLineItemType getItemsArray(int i);
        
        /**
         * Returns number of "items" element
         */
        int sizeOfItemsArray();
        
        /**
         * Sets array of all "items" element
         */
        void setItemsArray(com.isat.catalist.oms.order.OOSOrderLineItemType[] itemsArray);
        
        /**
         * Sets ith "items" element
         */
        void setItemsArray(int i, com.isat.catalist.oms.order.OOSOrderLineItemType items);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "items" element
         */
        com.isat.catalist.oms.order.OOSOrderLineItemType insertNewItems(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "items" element
         */
        com.isat.catalist.oms.order.OOSOrderLineItemType addNewItems();
        
        /**
         * Removes the ith "items" element
         */
        void removeItems(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo newInstance() {
              return (com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.isat.catalist.oms.order.OrderInfoDocument newInstance() {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OrderInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OrderInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
