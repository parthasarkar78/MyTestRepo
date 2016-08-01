/*
 * XML Type:  ListOfServiceElementsComplexType
 * Namespace: com/icare/eai/schema/om/evSORequest
 * Java type: com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSORequest;


/**
 * An XML ListOfServiceElementsComplexType(@com/icare/eai/schema/om/evSORequest).
 *
 * This is a complex type.
 */
public interface ListOfServiceElementsComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfServiceElementsComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("listofserviceelementscomplextypeaab6type");
    
    /**
     * Gets a List of "ServiceElement" elements
     */
    java.util.List<com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement> getServiceElementList();
    
    /**
     * Gets array of all "ServiceElement" elements
     * @deprecated
     */
    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement[] getServiceElementArray();
    
    /**
     * Gets ith "ServiceElement" element
     */
    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement getServiceElementArray(int i);
    
    /**
     * Returns number of "ServiceElement" element
     */
    int sizeOfServiceElementArray();
    
    /**
     * Sets array of all "ServiceElement" element
     */
    void setServiceElementArray(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement[] serviceElementArray);
    
    /**
     * Sets ith "ServiceElement" element
     */
    void setServiceElementArray(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement serviceElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ServiceElement" element
     */
    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement insertNewServiceElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ServiceElement" element
     */
    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement addNewServiceElement();
    
    /**
     * Removes the ith "ServiceElement" element
     */
    void removeServiceElement(int i);
    
    /**
     * An XML ServiceElement(@com/icare/eai/schema/om/evSORequest).
     *
     * This is a complex type.
     */
    public interface ServiceElement extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("serviceelement8c13elemtype");
        
        /**
         * Gets the "ServiceElementName" element
         */
        java.lang.String getServiceElementName();
        
        /**
         * Gets (as xml) the "ServiceElementName" element
         */
        org.apache.xmlbeans.XmlString xgetServiceElementName();
        
        /**
         * True if has "ServiceElementName" element
         */
        boolean isSetServiceElementName();
        
        /**
         * Sets the "ServiceElementName" element
         */
        void setServiceElementName(java.lang.String serviceElementName);
        
        /**
         * Sets (as xml) the "ServiceElementName" element
         */
        void xsetServiceElementName(org.apache.xmlbeans.XmlString serviceElementName);
        
        /**
         * Unsets the "ServiceElementName" element
         */
        void unsetServiceElementName();
        
        /**
         * Gets the "ListOfAttribute" element
         */
        com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute getListOfAttribute();
        
        /**
         * True if has "ListOfAttribute" element
         */
        boolean isSetListOfAttribute();
        
        /**
         * Sets the "ListOfAttribute" element
         */
        void setListOfAttribute(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute listOfAttribute);
        
        /**
         * Appends and returns a new empty "ListOfAttribute" element
         */
        com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute addNewListOfAttribute();
        
        /**
         * Unsets the "ListOfAttribute" element
         */
        void unsetListOfAttribute();
        
        /**
         * An XML ListOfAttribute(@com/icare/eai/schema/om/evSORequest).
         *
         * This is a complex type.
         */
        public interface ListOfAttribute extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("listofattribute3e66elemtype");
            
            /**
             * Gets a List of "Attribute" elements
             */
            java.util.List<com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute> getAttributeList();
            
            /**
             * Gets array of all "Attribute" elements
             * @deprecated
             */
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute[] getAttributeArray();
            
            /**
             * Gets ith "Attribute" element
             */
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute getAttributeArray(int i);
            
            /**
             * Returns number of "Attribute" element
             */
            int sizeOfAttributeArray();
            
            /**
             * Sets array of all "Attribute" element
             */
            void setAttributeArray(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute[] attributeArray);
            
            /**
             * Sets ith "Attribute" element
             */
            void setAttributeArray(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute attribute);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
             */
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute insertNewAttribute(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Attribute" element
             */
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute addNewAttribute();
            
            /**
             * Removes the ith "Attribute" element
             */
            void removeAttribute(int i);
            
            /**
             * An XML Attribute(@com/icare/eai/schema/om/evSORequest).
             *
             * This is a complex type.
             */
            public interface Attribute extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("attribute494eelemtype");
                
                /**
                 * Gets the "Name" element
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "Name" element
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * True if has "Name" element
                 */
                boolean isSetName();
                
                /**
                 * Sets the "Name" element
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "Name" element
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * Unsets the "Name" element
                 */
                void unsetName();
                
                /**
                 * Gets the "Value" element
                 */
                java.lang.String getValue();
                
                /**
                 * Gets (as xml) the "Value" element
                 */
                org.apache.xmlbeans.XmlString xgetValue();
                
                /**
                 * True if has "Value" element
                 */
                boolean isSetValue();
                
                /**
                 * Sets the "Value" element
                 */
                void setValue(java.lang.String value);
                
                /**
                 * Sets (as xml) the "Value" element
                 */
                void xsetValue(org.apache.xmlbeans.XmlString value);
                
                /**
                 * Unsets the "Value" element
                 */
                void unsetValue();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute newInstance() {
                      return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute newInstance() {
                  return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement newInstance() {
              return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType newInstance() {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
