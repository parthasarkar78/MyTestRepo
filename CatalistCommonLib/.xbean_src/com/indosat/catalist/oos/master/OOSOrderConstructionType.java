/*
 * XML Type:  OOSOrderConstructionType
 * Namespace: http://oos.catalist.indosat.com/Master
 * Java type: com.indosat.catalist.oos.master.OOSOrderConstructionType
 *
 * Automatically generated - do not modify.
 */
package com.indosat.catalist.oos.master;


/**
 * An XML OOSOrderConstructionType(@http://oos.catalist.indosat.com/Master).
 *
 * This is a complex type.
 */
public interface OOSOrderConstructionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OOSOrderConstructionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.CatalistCommonLibTypeSystem").resolveHandle("oosorderconstructiontype5451type");
    
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
     * Gets the "exec" element
     */
    int getExec();
    
    /**
     * Gets (as xml) the "exec" element
     */
    org.apache.xmlbeans.XmlInt xgetExec();
    
    /**
     * Sets the "exec" element
     */
    void setExec(int exec);
    
    /**
     * Sets (as xml) the "exec" element
     */
    void xsetExec(org.apache.xmlbeans.XmlInt exec);
    
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
     * Gets the "className" element
     */
    java.lang.String getClassName();
    
    /**
     * Gets (as xml) the "className" element
     */
    org.apache.xmlbeans.XmlString xgetClassName();
    
    /**
     * Sets the "className" element
     */
    void setClassName(java.lang.String className);
    
    /**
     * Sets (as xml) the "className" element
     */
    void xsetClassName(org.apache.xmlbeans.XmlString className);
    
    /**
     * Gets a List of "dependSeqID" elements
     */
    java.util.List<java.lang.Integer> getDependSeqIDList();
    
    /**
     * Gets array of all "dependSeqID" elements
     * @deprecated
     */
    int[] getDependSeqIDArray();
    
    /**
     * Gets ith "dependSeqID" element
     */
    int getDependSeqIDArray(int i);
    
    /**
     * Gets (as xml) a List of "dependSeqID" elements
     */
    java.util.List<org.apache.xmlbeans.XmlInt> xgetDependSeqIDList();
    
    /**
     * Gets (as xml) array of all "dependSeqID" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlInt[] xgetDependSeqIDArray();
    
    /**
     * Gets (as xml) ith "dependSeqID" element
     */
    org.apache.xmlbeans.XmlInt xgetDependSeqIDArray(int i);
    
    /**
     * Returns number of "dependSeqID" element
     */
    int sizeOfDependSeqIDArray();
    
    /**
     * Sets array of all "dependSeqID" element
     */
    void setDependSeqIDArray(int[] dependSeqIDArray);
    
    /**
     * Sets ith "dependSeqID" element
     */
    void setDependSeqIDArray(int i, int dependSeqID);
    
    /**
     * Sets (as xml) array of all "dependSeqID" element
     */
    void xsetDependSeqIDArray(org.apache.xmlbeans.XmlInt[] dependSeqIDArray);
    
    /**
     * Sets (as xml) ith "dependSeqID" element
     */
    void xsetDependSeqIDArray(int i, org.apache.xmlbeans.XmlInt dependSeqID);
    
    /**
     * Inserts the value as the ith "dependSeqID" element
     */
    void insertDependSeqID(int i, int dependSeqID);
    
    /**
     * Appends the value as the last "dependSeqID" element
     */
    void addDependSeqID(int dependSeqID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependSeqID" element
     */
    org.apache.xmlbeans.XmlInt insertNewDependSeqID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependSeqID" element
     */
    org.apache.xmlbeans.XmlInt addNewDependSeqID();
    
    /**
     * Removes the ith "dependSeqID" element
     */
    void removeDependSeqID(int i);
    
    /**
     * Gets the "seqID" element
     */
    int getSeqID();
    
    /**
     * Gets (as xml) the "seqID" element
     */
    org.apache.xmlbeans.XmlInt xgetSeqID();
    
    /**
     * Sets the "seqID" element
     */
    void setSeqID(int seqID);
    
    /**
     * Sets (as xml) the "seqID" element
     */
    void xsetSeqID(org.apache.xmlbeans.XmlInt seqID);
    
    /**
     * Gets a List of "fieldMapping" elements
     */
    java.util.List<java.lang.String> getFieldMappingList();
    
    /**
     * Gets array of all "fieldMapping" elements
     * @deprecated
     */
    java.lang.String[] getFieldMappingArray();
    
    /**
     * Gets ith "fieldMapping" element
     */
    java.lang.String getFieldMappingArray(int i);
    
    /**
     * Gets (as xml) a List of "fieldMapping" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetFieldMappingList();
    
    /**
     * Gets (as xml) array of all "fieldMapping" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetFieldMappingArray();
    
    /**
     * Gets (as xml) ith "fieldMapping" element
     */
    org.apache.xmlbeans.XmlString xgetFieldMappingArray(int i);
    
    /**
     * Returns number of "fieldMapping" element
     */
    int sizeOfFieldMappingArray();
    
    /**
     * Sets array of all "fieldMapping" element
     */
    void setFieldMappingArray(java.lang.String[] fieldMappingArray);
    
    /**
     * Sets ith "fieldMapping" element
     */
    void setFieldMappingArray(int i, java.lang.String fieldMapping);
    
    /**
     * Sets (as xml) array of all "fieldMapping" element
     */
    void xsetFieldMappingArray(org.apache.xmlbeans.XmlString[] fieldMappingArray);
    
    /**
     * Sets (as xml) ith "fieldMapping" element
     */
    void xsetFieldMappingArray(int i, org.apache.xmlbeans.XmlString fieldMapping);
    
    /**
     * Inserts the value as the ith "fieldMapping" element
     */
    void insertFieldMapping(int i, java.lang.String fieldMapping);
    
    /**
     * Appends the value as the last "fieldMapping" element
     */
    void addFieldMapping(java.lang.String fieldMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fieldMapping" element
     */
    org.apache.xmlbeans.XmlString insertNewFieldMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fieldMapping" element
     */
    org.apache.xmlbeans.XmlString addNewFieldMapping();
    
    /**
     * Removes the ith "fieldMapping" element
     */
    void removeFieldMapping(int i);
    
    /**
     * Gets a List of "staticField" elements
     */
    java.util.List<java.lang.String> getStaticFieldList();
    
    /**
     * Gets array of all "staticField" elements
     * @deprecated
     */
    java.lang.String[] getStaticFieldArray();
    
    /**
     * Gets ith "staticField" element
     */
    java.lang.String getStaticFieldArray(int i);
    
    /**
     * Gets (as xml) a List of "staticField" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetStaticFieldList();
    
    /**
     * Gets (as xml) array of all "staticField" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetStaticFieldArray();
    
    /**
     * Gets (as xml) ith "staticField" element
     */
    org.apache.xmlbeans.XmlString xgetStaticFieldArray(int i);
    
    /**
     * Returns number of "staticField" element
     */
    int sizeOfStaticFieldArray();
    
    /**
     * Sets array of all "staticField" element
     */
    void setStaticFieldArray(java.lang.String[] staticFieldArray);
    
    /**
     * Sets ith "staticField" element
     */
    void setStaticFieldArray(int i, java.lang.String staticField);
    
    /**
     * Sets (as xml) array of all "staticField" element
     */
    void xsetStaticFieldArray(org.apache.xmlbeans.XmlString[] staticFieldArray);
    
    /**
     * Sets (as xml) ith "staticField" element
     */
    void xsetStaticFieldArray(int i, org.apache.xmlbeans.XmlString staticField);
    
    /**
     * Inserts the value as the ith "staticField" element
     */
    void insertStaticField(int i, java.lang.String staticField);
    
    /**
     * Appends the value as the last "staticField" element
     */
    void addStaticField(java.lang.String staticField);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "staticField" element
     */
    org.apache.xmlbeans.XmlString insertNewStaticField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "staticField" element
     */
    org.apache.xmlbeans.XmlString addNewStaticField();
    
    /**
     * Removes the ith "staticField" element
     */
    void removeStaticField(int i);
    
    /**
     * Gets the "ignoreError" element
     */
    boolean getIgnoreError();
    
    /**
     * Gets (as xml) the "ignoreError" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIgnoreError();
    
    /**
     * Sets the "ignoreError" element
     */
    void setIgnoreError(boolean ignoreError);
    
    /**
     * Sets (as xml) the "ignoreError" element
     */
    void xsetIgnoreError(org.apache.xmlbeans.XmlBoolean ignoreError);
    
    /**
     * Gets a List of "fetchOutput" elements
     */
    java.util.List<java.lang.String> getFetchOutputList();
    
    /**
     * Gets array of all "fetchOutput" elements
     * @deprecated
     */
    java.lang.String[] getFetchOutputArray();
    
    /**
     * Gets ith "fetchOutput" element
     */
    java.lang.String getFetchOutputArray(int i);
    
    /**
     * Gets (as xml) a List of "fetchOutput" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetFetchOutputList();
    
    /**
     * Gets (as xml) array of all "fetchOutput" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetFetchOutputArray();
    
    /**
     * Gets (as xml) ith "fetchOutput" element
     */
    org.apache.xmlbeans.XmlString xgetFetchOutputArray(int i);
    
    /**
     * Returns number of "fetchOutput" element
     */
    int sizeOfFetchOutputArray();
    
    /**
     * Sets array of all "fetchOutput" element
     */
    void setFetchOutputArray(java.lang.String[] fetchOutputArray);
    
    /**
     * Sets ith "fetchOutput" element
     */
    void setFetchOutputArray(int i, java.lang.String fetchOutput);
    
    /**
     * Sets (as xml) array of all "fetchOutput" element
     */
    void xsetFetchOutputArray(org.apache.xmlbeans.XmlString[] fetchOutputArray);
    
    /**
     * Sets (as xml) ith "fetchOutput" element
     */
    void xsetFetchOutputArray(int i, org.apache.xmlbeans.XmlString fetchOutput);
    
    /**
     * Inserts the value as the ith "fetchOutput" element
     */
    void insertFetchOutput(int i, java.lang.String fetchOutput);
    
    /**
     * Appends the value as the last "fetchOutput" element
     */
    void addFetchOutput(java.lang.String fetchOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fetchOutput" element
     */
    org.apache.xmlbeans.XmlString insertNewFetchOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fetchOutput" element
     */
    org.apache.xmlbeans.XmlString addNewFetchOutput();
    
    /**
     * Removes the ith "fetchOutput" element
     */
    void removeFetchOutput(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType newInstance() {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.indosat.catalist.oos.master.OOSOrderConstructionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.indosat.catalist.oos.master.OOSOrderConstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
