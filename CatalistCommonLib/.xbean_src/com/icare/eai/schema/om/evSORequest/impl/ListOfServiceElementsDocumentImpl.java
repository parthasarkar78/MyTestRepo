/*
 * An XML document type.
 * Localname: ListOfServiceElements
 * Namespace: com/icare/eai/schema/om/evSORequest
 * Java type: com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSORequest.impl;
/**
 * A document containing one ListOfServiceElements(@com/icare/eai/schema/om/evSORequest) element.
 *
 * This is a complex type.
 */
public class ListOfServiceElementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument
{
    
    public ListOfServiceElementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFSERVICEELEMENTS$0 = 
        new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "ListOfServiceElements");
    
    
    /**
     * Gets the "ListOfServiceElements" element
     */
    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements getListOfServiceElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements)get_store().find_element_user(LISTOFSERVICEELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfServiceElements" element
     */
    public void setListOfServiceElements(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements listOfServiceElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements)get_store().find_element_user(LISTOFSERVICEELEMENTS$0, 0);
            if (target == null)
            {
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements)get_store().add_element_user(LISTOFSERVICEELEMENTS$0);
            }
            target.set(listOfServiceElements);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfServiceElements" element
     */
    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements addNewListOfServiceElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements)get_store().add_element_user(LISTOFSERVICEELEMENTS$0);
            return target;
        }
    }
    /**
     * An XML ListOfServiceElements(@com/icare/eai/schema/om/evSORequest).
     *
     * This is a complex type.
     */
    public static class ListOfServiceElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.ListOfServiceElementsDocument.ListOfServiceElements
    {
        
        public ListOfServiceElementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFELEMENTS$0 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "ListOfElements");
        
        
        /**
         * Gets the "ListOfElements" element
         */
        public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType getListOfElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().find_element_user(LISTOFELEMENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ListOfElements" element
         */
        public boolean isSetListOfElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTOFELEMENTS$0) != 0;
            }
        }
        
        /**
         * Sets the "ListOfElements" element
         */
        public void setListOfElements(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType listOfElements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().find_element_user(LISTOFELEMENTS$0, 0);
                if (target == null)
                {
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().add_element_user(LISTOFELEMENTS$0);
                }
                target.set(listOfElements);
            }
        }
        
        /**
         * Appends and returns a new empty "ListOfElements" element
         */
        public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType addNewListOfElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType)get_store().add_element_user(LISTOFELEMENTS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "ListOfElements" element
         */
        public void unsetListOfElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTOFELEMENTS$0, 0);
            }
        }
    }
}
