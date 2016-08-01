/*
 * XML Type:  OOSOrderLineItemType
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OOSOrderLineItemType
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order;


/**
 * An XML OOSOrderLineItemType(@http://oms.catalist.isat.com/order).
 *
 * This is a complex type.
 */
public interface OOSOrderLineItemType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OOSOrderLineItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oosorderlineitemtypeb8a4type");
    
    /**
     * Gets the "orderID" element
     */
    int getOrderID();
    
    /**
     * Gets (as xml) the "orderID" element
     */
    org.apache.xmlbeans.XmlInt xgetOrderID();
    
    /**
     * Sets the "orderID" element
     */
    void setOrderID(int orderID);
    
    /**
     * Sets (as xml) the "orderID" element
     */
    void xsetOrderID(org.apache.xmlbeans.XmlInt orderID);
    
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
     * Gets the "serviceID" element
     */
    java.lang.String getServiceID();
    
    /**
     * Gets (as xml) the "serviceID" element
     */
    org.apache.xmlbeans.XmlString xgetServiceID();
    
    /**
     * Sets the "serviceID" element
     */
    void setServiceID(java.lang.String serviceID);
    
    /**
     * Sets (as xml) the "serviceID" element
     */
    void xsetServiceID(org.apache.xmlbeans.XmlString serviceID);
    
    /**
     * Gets the "startExecDate" element
     */
    java.util.Calendar getStartExecDate();
    
    /**
     * Gets (as xml) the "startExecDate" element
     */
    org.apache.xmlbeans.XmlDate xgetStartExecDate();
    
    /**
     * Sets the "startExecDate" element
     */
    void setStartExecDate(java.util.Calendar startExecDate);
    
    /**
     * Sets (as xml) the "startExecDate" element
     */
    void xsetStartExecDate(org.apache.xmlbeans.XmlDate startExecDate);
    
    /**
     * Gets the "endExecDate" element
     */
    java.util.Calendar getEndExecDate();
    
    /**
     * Gets (as xml) the "endExecDate" element
     */
    org.apache.xmlbeans.XmlDate xgetEndExecDate();
    
    /**
     * Sets the "endExecDate" element
     */
    void setEndExecDate(java.util.Calendar endExecDate);
    
    /**
     * Sets (as xml) the "endExecDate" element
     */
    void xsetEndExecDate(org.apache.xmlbeans.XmlDate endExecDate);
    
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
     * Gets the "notes" element
     */
    java.lang.String getNotes();
    
    /**
     * Gets (as xml) the "notes" element
     */
    org.apache.xmlbeans.XmlString xgetNotes();
    
    /**
     * Sets the "notes" element
     */
    void setNotes(java.lang.String notes);
    
    /**
     * Sets (as xml) the "notes" element
     */
    void xsetNotes(org.apache.xmlbeans.XmlString notes);
    
    /**
     * Gets a List of "parameters" elements
     */
    java.util.List<com.isat.catalist.oms.order.OOSOrderLineItemParamType> getParametersList();
    
    /**
     * Gets array of all "parameters" elements
     * @deprecated
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType[] getParametersArray();
    
    /**
     * Gets ith "parameters" element
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType getParametersArray(int i);
    
    /**
     * Returns number of "parameters" element
     */
    int sizeOfParametersArray();
    
    /**
     * Sets array of all "parameters" element
     */
    void setParametersArray(com.isat.catalist.oms.order.OOSOrderLineItemParamType[] parametersArray);
    
    /**
     * Sets ith "parameters" element
     */
    void setParametersArray(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType parameters);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameters" element
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType insertNewParameters(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameters" element
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType addNewParameters();
    
    /**
     * Removes the ith "parameters" element
     */
    void removeParameters(int i);
    
    /**
     * Gets the "hasOutput" element
     */
    boolean getHasOutput();
    
    /**
     * Gets (as xml) the "hasOutput" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasOutput();
    
    /**
     * Sets the "hasOutput" element
     */
    void setHasOutput(boolean hasOutput);
    
    /**
     * Sets (as xml) the "hasOutput" element
     */
    void xsetHasOutput(org.apache.xmlbeans.XmlBoolean hasOutput);
    
    /**
     * Gets a List of "rParameters" elements
     */
    java.util.List<com.isat.catalist.oms.order.OOSOrderLineItemParamType> getRParametersList();
    
    /**
     * Gets array of all "rParameters" elements
     * @deprecated
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType[] getRParametersArray();
    
    /**
     * Gets ith "rParameters" element
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType getRParametersArray(int i);
    
    /**
     * Returns number of "rParameters" element
     */
    int sizeOfRParametersArray();
    
    /**
     * Sets array of all "rParameters" element
     */
    void setRParametersArray(com.isat.catalist.oms.order.OOSOrderLineItemParamType[] rParametersArray);
    
    /**
     * Sets ith "rParameters" element
     */
    void setRParametersArray(int i, com.isat.catalist.oms.order.OOSOrderLineItemParamType rParameters);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rParameters" element
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType insertNewRParameters(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rParameters" element
     */
    com.isat.catalist.oms.order.OOSOrderLineItemParamType addNewRParameters();
    
    /**
     * Removes the ith "rParameters" element
     */
    void removeRParameters(int i);
    
    /**
     * Gets the "autoGenerate" element
     */
    boolean getAutoGenerate();
    
    /**
     * Gets (as xml) the "autoGenerate" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoGenerate();
    
    /**
     * Sets the "autoGenerate" element
     */
    void setAutoGenerate(boolean autoGenerate);
    
    /**
     * Sets (as xml) the "autoGenerate" element
     */
    void xsetAutoGenerate(org.apache.xmlbeans.XmlBoolean autoGenerate);
    
    /**
     * Gets the "retryAttempt" element
     */
    int getRetryAttempt();
    
    /**
     * Gets (as xml) the "retryAttempt" element
     */
    org.apache.xmlbeans.XmlInt xgetRetryAttempt();
    
    /**
     * Sets the "retryAttempt" element
     */
    void setRetryAttempt(int retryAttempt);
    
    /**
     * Sets (as xml) the "retryAttempt" element
     */
    void xsetRetryAttempt(org.apache.xmlbeans.XmlInt retryAttempt);
    
    /**
     * Gets a List of "dependLineID" elements
     */
    java.util.List<java.lang.Integer> getDependLineIDList();
    
    /**
     * Gets array of all "dependLineID" elements
     * @deprecated
     */
    int[] getDependLineIDArray();
    
    /**
     * Gets ith "dependLineID" element
     */
    int getDependLineIDArray(int i);
    
    /**
     * Gets (as xml) a List of "dependLineID" elements
     */
    java.util.List<org.apache.xmlbeans.XmlInt> xgetDependLineIDList();
    
    /**
     * Gets (as xml) array of all "dependLineID" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlInt[] xgetDependLineIDArray();
    
    /**
     * Gets (as xml) ith "dependLineID" element
     */
    org.apache.xmlbeans.XmlInt xgetDependLineIDArray(int i);
    
    /**
     * Returns number of "dependLineID" element
     */
    int sizeOfDependLineIDArray();
    
    /**
     * Sets array of all "dependLineID" element
     */
    void setDependLineIDArray(int[] dependLineIDArray);
    
    /**
     * Sets ith "dependLineID" element
     */
    void setDependLineIDArray(int i, int dependLineID);
    
    /**
     * Sets (as xml) array of all "dependLineID" element
     */
    void xsetDependLineIDArray(org.apache.xmlbeans.XmlInt[] dependLineIDArray);
    
    /**
     * Sets (as xml) ith "dependLineID" element
     */
    void xsetDependLineIDArray(int i, org.apache.xmlbeans.XmlInt dependLineID);
    
    /**
     * Inserts the value as the ith "dependLineID" element
     */
    void insertDependLineID(int i, int dependLineID);
    
    /**
     * Appends the value as the last "dependLineID" element
     */
    void addDependLineID(int dependLineID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependLineID" element
     */
    org.apache.xmlbeans.XmlInt insertNewDependLineID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependLineID" element
     */
    org.apache.xmlbeans.XmlInt addNewDependLineID();
    
    /**
     * Removes the ith "dependLineID" element
     */
    void removeDependLineID(int i);
    
    /**
     * Gets a List of "mappingFields" elements
     */
    java.util.List<java.lang.String> getMappingFieldsList();
    
    /**
     * Gets array of all "mappingFields" elements
     * @deprecated
     */
    java.lang.String[] getMappingFieldsArray();
    
    /**
     * Gets ith "mappingFields" element
     */
    java.lang.String getMappingFieldsArray(int i);
    
    /**
     * Gets (as xml) a List of "mappingFields" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetMappingFieldsList();
    
    /**
     * Gets (as xml) array of all "mappingFields" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetMappingFieldsArray();
    
    /**
     * Gets (as xml) ith "mappingFields" element
     */
    org.apache.xmlbeans.XmlString xgetMappingFieldsArray(int i);
    
    /**
     * Returns number of "mappingFields" element
     */
    int sizeOfMappingFieldsArray();
    
    /**
     * Sets array of all "mappingFields" element
     */
    void setMappingFieldsArray(java.lang.String[] mappingFieldsArray);
    
    /**
     * Sets ith "mappingFields" element
     */
    void setMappingFieldsArray(int i, java.lang.String mappingFields);
    
    /**
     * Sets (as xml) array of all "mappingFields" element
     */
    void xsetMappingFieldsArray(org.apache.xmlbeans.XmlString[] mappingFieldsArray);
    
    /**
     * Sets (as xml) ith "mappingFields" element
     */
    void xsetMappingFieldsArray(int i, org.apache.xmlbeans.XmlString mappingFields);
    
    /**
     * Inserts the value as the ith "mappingFields" element
     */
    void insertMappingFields(int i, java.lang.String mappingFields);
    
    /**
     * Appends the value as the last "mappingFields" element
     */
    void addMappingFields(java.lang.String mappingFields);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mappingFields" element
     */
    org.apache.xmlbeans.XmlString insertNewMappingFields(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mappingFields" element
     */
    org.apache.xmlbeans.XmlString addNewMappingFields();
    
    /**
     * Removes the ith "mappingFields" element
     */
    void removeMappingFields(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.isat.catalist.oms.order.OOSOrderLineItemType newInstance() {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.isat.catalist.oms.order.OOSOrderLineItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.isat.catalist.oms.order.OOSOrderLineItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
