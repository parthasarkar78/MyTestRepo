/*
 * An XML document type.
 * Localname: OLIResponse
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OLIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order;


/**
 * A document containing one OLIResponse(@http://oms.catalist.isat.com/order) element.
 *
 * This is a complex type.
 */
public interface OLIResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OLIResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oliresponse4315doctype");
    
    /**
     * Gets the "OLIResponse" element
     */
    com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse getOLIResponse();
    
    /**
     * Sets the "OLIResponse" element
     */
    void setOLIResponse(com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse oliResponse);
    
    /**
     * Appends and returns a new empty "OLIResponse" element
     */
    com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse addNewOLIResponse();
    
    /**
     * An XML OLIResponse(@http://oms.catalist.isat.com/order).
     *
     * This is a complex type.
     */
    public interface OLIResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OLIResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oliresponsecd5celemtype");
        
        /**
         * Gets the "OrderID" element
         */
        java.lang.String getOrderID();
        
        /**
         * Gets (as xml) the "OrderID" element
         */
        org.apache.xmlbeans.XmlString xgetOrderID();
        
        /**
         * True if has "OrderID" element
         */
        boolean isSetOrderID();
        
        /**
         * Sets the "OrderID" element
         */
        void setOrderID(java.lang.String orderID);
        
        /**
         * Sets (as xml) the "OrderID" element
         */
        void xsetOrderID(org.apache.xmlbeans.XmlString orderID);
        
        /**
         * Unsets the "OrderID" element
         */
        void unsetOrderID();
        
        /**
         * Gets the "LineID" element
         */
        java.lang.String getLineID();
        
        /**
         * Gets (as xml) the "LineID" element
         */
        org.apache.xmlbeans.XmlString xgetLineID();
        
        /**
         * True if has "LineID" element
         */
        boolean isSetLineID();
        
        /**
         * Sets the "LineID" element
         */
        void setLineID(java.lang.String lineID);
        
        /**
         * Sets (as xml) the "LineID" element
         */
        void xsetLineID(org.apache.xmlbeans.XmlString lineID);
        
        /**
         * Unsets the "LineID" element
         */
        void unsetLineID();
        
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
         * Gets the "ExtTransactionID" element
         */
        java.lang.String getExtTransactionID();
        
        /**
         * Gets (as xml) the "ExtTransactionID" element
         */
        org.apache.xmlbeans.XmlString xgetExtTransactionID();
        
        /**
         * True if has "ExtTransactionID" element
         */
        boolean isSetExtTransactionID();
        
        /**
         * Sets the "ExtTransactionID" element
         */
        void setExtTransactionID(java.lang.String extTransactionID);
        
        /**
         * Sets (as xml) the "ExtTransactionID" element
         */
        void xsetExtTransactionID(org.apache.xmlbeans.XmlString extTransactionID);
        
        /**
         * Unsets the "ExtTransactionID" element
         */
        void unsetExtTransactionID();
        
        /**
         * Gets a List of "Parameter" elements
         */
        java.util.List<com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter> getParameterList();
        
        /**
         * Gets array of all "Parameter" elements
         * @deprecated
         */
        com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter[] getParameterArray();
        
        /**
         * Gets ith "Parameter" element
         */
        com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter getParameterArray(int i);
        
        /**
         * Returns number of "Parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "Parameter" element
         */
        void setParameterArray(com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter[] parameterArray);
        
        /**
         * Sets ith "Parameter" element
         */
        void setParameterArray(int i, com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter addNewParameter();
        
        /**
         * Removes the ith "Parameter" element
         */
        void removeParameter(int i);
        
        /**
         * An XML Parameter(@http://oms.catalist.isat.com/order).
         *
         * This is a complex type.
         */
        public interface Parameter extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("parameterecc7elemtype");
            
            /**
             * Gets the "Name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "Name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "Name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "Name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "Value" element
             */
            java.lang.String getValue();
            
            /**
             * Gets (as xml) the "Value" element
             */
            org.apache.xmlbeans.XmlString xgetValue();
            
            /**
             * Sets the "Value" element
             */
            void setValue(java.lang.String value);
            
            /**
             * Sets (as xml) the "Value" element
             */
            void xsetValue(org.apache.xmlbeans.XmlString value);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter newInstance() {
                  return (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse newInstance() {
              return (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.isat.catalist.oms.order.OLIResponseDocument newInstance() {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OLIResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OLIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
