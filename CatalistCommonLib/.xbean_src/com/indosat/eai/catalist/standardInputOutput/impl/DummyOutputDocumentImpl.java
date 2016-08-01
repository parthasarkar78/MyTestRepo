/*
 * An XML document type.
 * Localname: DummyOutput
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput.impl;
/**
 * A document containing one DummyOutput(@http://catalist.eai.indosat.com/StandardInputOutput) element.
 *
 * This is a complex type.
 */
public class DummyOutputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument
{
    
    public DummyOutputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUMMYOUTPUT$0 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "DummyOutput");
    
    
    /**
     * Gets the "DummyOutput" element
     */
    public com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput getDummyOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput)get_store().find_element_user(DUMMYOUTPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DummyOutput" element
     */
    public void setDummyOutput(com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput dummyOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput)get_store().find_element_user(DUMMYOUTPUT$0, 0);
            if (target == null)
            {
                target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput)get_store().add_element_user(DUMMYOUTPUT$0);
            }
            target.set(dummyOutput);
        }
    }
    
    /**
     * Appends and returns a new empty "DummyOutput" element
     */
    public com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput addNewDummyOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput)get_store().add_element_user(DUMMYOUTPUT$0);
            return target;
        }
    }
    /**
     * An XML DummyOutput(@http://catalist.eai.indosat.com/StandardInputOutput).
     *
     * This is a complex type.
     */
    public static class DummyOutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.DummyOutputDocument.DummyOutput
    {
        
        public DummyOutputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "Status");
        private static final javax.xml.namespace.QName OUTPUT$2 = 
            new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "Output");
        
        
        /**
         * Gets the "Status" element
         */
        public com.indosat.eai.catalist.standardInputOutput.StatusType getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.StatusType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.indosat.eai.catalist.standardInputOutput.StatusType status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.StatusType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
        
        /**
         * Appends and returns a new empty "Status" element
         */
        public com.indosat.eai.catalist.standardInputOutput.StatusType addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.StatusType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().add_element_user(STATUS$0);
                return target;
            }
        }
        
        /**
         * Gets the "Output" element
         */
        public com.indosat.eai.catalist.standardInputOutput.DummyOutputType getOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.DummyOutputType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputType)get_store().find_element_user(OUTPUT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Output" element
         */
        public void setOutput(com.indosat.eai.catalist.standardInputOutput.DummyOutputType output)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.DummyOutputType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputType)get_store().find_element_user(OUTPUT$2, 0);
                if (target == null)
                {
                    target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputType)get_store().add_element_user(OUTPUT$2);
                }
                target.set(output);
            }
        }
        
        /**
         * Appends and returns a new empty "Output" element
         */
        public com.indosat.eai.catalist.standardInputOutput.DummyOutputType addNewOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.DummyOutputType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.DummyOutputType)get_store().add_element_user(OUTPUT$2);
                return target;
            }
        }
    }
}
