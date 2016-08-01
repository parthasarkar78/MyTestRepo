/*
 * An XML document type.
 * Localname: OLIResponse
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OLIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order.impl;
/**
 * A document containing one OLIResponse(@http://oms.catalist.isat.com/order) element.
 *
 * This is a complex type.
 */
public class OLIResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OLIResponseDocument
{
    
    public OLIResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLIRESPONSE$0 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "OLIResponse");
    
    
    /**
     * Gets the "OLIResponse" element
     */
    public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse getOLIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse target = null;
            target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse)get_store().find_element_user(OLIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OLIResponse" element
     */
    public void setOLIResponse(com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse oliResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse target = null;
            target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse)get_store().find_element_user(OLIRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse)get_store().add_element_user(OLIRESPONSE$0);
            }
            target.set(oliResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "OLIResponse" element
     */
    public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse addNewOLIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse target = null;
            target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse)get_store().add_element_user(OLIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML OLIResponse(@http://oms.catalist.isat.com/order).
     *
     * This is a complex type.
     */
    public static class OLIResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse
    {
        
        public OLIResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERID$0 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "OrderID");
        private static final javax.xml.namespace.QName LINEID$2 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "LineID");
        private static final javax.xml.namespace.QName STATUS$4 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "Status");
        private static final javax.xml.namespace.QName EXTTRANSACTIONID$6 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "ExtTransactionID");
        private static final javax.xml.namespace.QName PARAMETER$8 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "Parameter");
        
        
        /**
         * Gets the "OrderID" element
         */
        public java.lang.String getOrderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrderID" element
         */
        public org.apache.xmlbeans.XmlString xgetOrderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrderID" element
         */
        public boolean isSetOrderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERID$0) != 0;
            }
        }
        
        /**
         * Sets the "OrderID" element
         */
        public void setOrderID(java.lang.String orderID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$0);
                }
                target.setStringValue(orderID);
            }
        }
        
        /**
         * Sets (as xml) the "OrderID" element
         */
        public void xsetOrderID(org.apache.xmlbeans.XmlString orderID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERID$0);
                }
                target.set(orderID);
            }
        }
        
        /**
         * Unsets the "OrderID" element
         */
        public void unsetOrderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERID$0, 0);
            }
        }
        
        /**
         * Gets the "LineID" element
         */
        public java.lang.String getLineID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LineID" element
         */
        public org.apache.xmlbeans.XmlString xgetLineID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINEID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "LineID" element
         */
        public boolean isSetLineID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINEID$2) != 0;
            }
        }
        
        /**
         * Sets the "LineID" element
         */
        public void setLineID(java.lang.String lineID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINEID$2);
                }
                target.setStringValue(lineID);
            }
        }
        
        /**
         * Sets (as xml) the "LineID" element
         */
        public void xsetLineID(org.apache.xmlbeans.XmlString lineID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINEID$2);
                }
                target.set(lineID);
            }
        }
        
        /**
         * Unsets the "LineID" element
         */
        public void unsetLineID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINEID$2, 0);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.indosat.eai.catalist.standardInputOutput.StatusType getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.indosat.eai.catalist.standardInputOutput.StatusType target = null;
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().find_element_user(STATUS$4, 0);
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
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().add_element_user(STATUS$4);
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
                target = (com.indosat.eai.catalist.standardInputOutput.StatusType)get_store().add_element_user(STATUS$4);
                return target;
            }
        }
        
        /**
         * Gets the "ExtTransactionID" element
         */
        public java.lang.String getExtTransactionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTTRANSACTIONID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtTransactionID" element
         */
        public org.apache.xmlbeans.XmlString xgetExtTransactionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTTRANSACTIONID$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ExtTransactionID" element
         */
        public boolean isSetExtTransactionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTTRANSACTIONID$6) != 0;
            }
        }
        
        /**
         * Sets the "ExtTransactionID" element
         */
        public void setExtTransactionID(java.lang.String extTransactionID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTTRANSACTIONID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTTRANSACTIONID$6);
                }
                target.setStringValue(extTransactionID);
            }
        }
        
        /**
         * Sets (as xml) the "ExtTransactionID" element
         */
        public void xsetExtTransactionID(org.apache.xmlbeans.XmlString extTransactionID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTTRANSACTIONID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTTRANSACTIONID$6);
                }
                target.set(extTransactionID);
            }
        }
        
        /**
         * Unsets the "ExtTransactionID" element
         */
        public void unsetExtTransactionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTTRANSACTIONID$6, 0);
            }
        }
        
        /**
         * Gets a List of "Parameter" elements
         */
        public java.util.List<com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter> getParameterList()
        {
            final class ParameterList extends java.util.AbstractList<com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter>
            {
                public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter get(int i)
                    { return OLIResponseImpl.this.getParameterArray(i); }
                
                public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter set(int i, com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter o)
                {
                    com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter old = OLIResponseImpl.this.getParameterArray(i);
                    OLIResponseImpl.this.setParameterArray(i, o);
                    return old;
                }
                
                public void add(int i, com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter o)
                    { OLIResponseImpl.this.insertNewParameter(i).set(o); }
                
                public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter remove(int i)
                {
                    com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter old = OLIResponseImpl.this.getParameterArray(i);
                    OLIResponseImpl.this.removeParameter(i);
                    return old;
                }
                
                public int size()
                    { return OLIResponseImpl.this.sizeOfParameterArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ParameterList();
            }
        }
        
        /**
         * Gets array of all "Parameter" elements
         */
        public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$8, targetList);
                com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter[] result = new com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parameter" element
         */
        public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter target = null;
                target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter)get_store().find_element_user(PARAMETER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Parameter" element
         */
        public int sizeOfParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMETER$8);
            }
        }
        
        /**
         * Sets array of all "Parameter" element
         */
        public void setParameterArray(com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter[] parameterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(parameterArray, PARAMETER$8);
            }
        }
        
        /**
         * Sets ith "Parameter" element
         */
        public void setParameterArray(int i, com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter parameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter target = null;
                target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter)get_store().find_element_user(PARAMETER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(parameter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter target = null;
                target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter)get_store().insert_element_user(PARAMETER$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        public com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter target = null;
                target = (com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter)get_store().add_element_user(PARAMETER$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Parameter" element
         */
        public void removeParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMETER$8, i);
            }
        }
        /**
         * An XML Parameter(@http://oms.catalist.isat.com/order).
         *
         * This is a complex type.
         */
        public static class ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OLIResponseDocument.OLIResponse.Parameter
        {
            
            public ParameterImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "Name");
            private static final javax.xml.namespace.QName VALUE$2 = 
                new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "Value");
            
            
            /**
             * Gets the "Name" element
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Name" element
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Name" element
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "Name" element
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "Value" element
             */
            public java.lang.String getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Value" element
             */
            public org.apache.xmlbeans.XmlString xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Value" element
             */
            public void setValue(java.lang.String value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                    }
                    target.setStringValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "Value" element
             */
            public void xsetValue(org.apache.xmlbeans.XmlString value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                    }
                    target.set(value);
                }
            }
        }
    }
}
