/*
 * An XML document type.
 * Localname: DummyInput
 * Namespace: http://catalist.eai.indosat.com/StandardInputOutput
 * Java type: com.indosat.eai.catalist.standardInputOutput.DummyInputDocument
 *
 * Automatically generated - do not modify.
 */
package com.indosat.eai.catalist.standardInputOutput.impl;
/**
 * A document containing one DummyInput(@http://catalist.eai.indosat.com/StandardInputOutput) element.
 *
 * This is a complex type.
 */
public class DummyInputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.DummyInputDocument
{
    
    public DummyInputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUMMYINPUT$0 = 
        new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "DummyInput");
    
    
    /**
     * Gets the "DummyInput" element
     */
    public com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput getDummyInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput)get_store().find_element_user(DUMMYINPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DummyInput" element
     */
    public void setDummyInput(com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput dummyInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput)get_store().find_element_user(DUMMYINPUT$0, 0);
            if (target == null)
            {
                target = (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput)get_store().add_element_user(DUMMYINPUT$0);
            }
            target.set(dummyInput);
        }
    }
    
    /**
     * Appends and returns a new empty "DummyInput" element
     */
    public com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput addNewDummyInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput target = null;
            target = (com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput)get_store().add_element_user(DUMMYINPUT$0);
            return target;
        }
    }
    /**
     * An XML DummyInput(@http://catalist.eai.indosat.com/StandardInputOutput).
     *
     * This is a complex type.
     */
    public static class DummyInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.indosat.eai.catalist.standardInputOutput.DummyInputDocument.DummyInput
    {
        
        public DummyInputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "Request");
        private static final javax.xml.namespace.QName INPUT$2 = 
            new javax.xml.namespace.QName("http://catalist.eai.indosat.com/StandardInputOutput", "Input");
        
        
        /**
         * Gets the "Request" element
         */
        public com.indosat.eai.catalist.standardInputOutput.RequestType getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.RequestType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.RequestType)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Request" element
         */
        public void setRequest(com.indosat.eai.catalist.standardInputOutput.RequestType request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.RequestType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.RequestType)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (com.indosat.eai.catalist.standardInputOutput.RequestType)get_store().add_element_user(REQUEST$0);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "Request" element
         */
        public com.indosat.eai.catalist.standardInputOutput.RequestType addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.RequestType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.RequestType)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Gets the "Input" element
         */
        public com.indosat.eai.catalist.standardInputOutput.DummyInputType getInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.DummyInputType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.DummyInputType)get_store().find_element_user(INPUT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Input" element
         */
        public void setInput(com.indosat.eai.catalist.standardInputOutput.DummyInputType input)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.DummyInputType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.DummyInputType)get_store().find_element_user(INPUT$2, 0);
                if (target == null)
                {
                    target = (com.indosat.eai.catalist.standardInputOutput.DummyInputType)get_store().add_element_user(INPUT$2);
                }
                target.set(input);
            }
        }
        
        /**
         * Appends and returns a new empty "Input" element
         */
        public com.indosat.eai.catalist.standardInputOutput.DummyInputType addNewInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.DummyInputType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.DummyInputType)get_store().add_element_user(INPUT$2);
                return target;
            }
        }
    }
}
