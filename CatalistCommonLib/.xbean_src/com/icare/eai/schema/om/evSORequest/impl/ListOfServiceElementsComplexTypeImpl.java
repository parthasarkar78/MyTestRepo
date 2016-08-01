/*
 * XML Type:  ListOfServiceElementsComplexType
 * Namespace: com/icare/eai/schema/om/evSORequest
 * Java type: com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType
 *
 * Automatically generated - do not modify.
 */
package com.icare.eai.schema.om.evSORequest.impl;
/**
 * An XML ListOfServiceElementsComplexType(@com/icare/eai/schema/om/evSORequest).
 *
 * This is a complex type.
 */
public class ListOfServiceElementsComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType
{
    
    public ListOfServiceElementsComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEELEMENT$0 = 
        new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "ServiceElement");
    
    
    /**
     * Gets a List of "ServiceElement" elements
     */
    public java.util.List<com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement> getServiceElementList()
    {
        final class ServiceElementList extends java.util.AbstractList<com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement>
        {
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement get(int i)
                { return ListOfServiceElementsComplexTypeImpl.this.getServiceElementArray(i); }
            
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement set(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement o)
            {
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement old = ListOfServiceElementsComplexTypeImpl.this.getServiceElementArray(i);
                ListOfServiceElementsComplexTypeImpl.this.setServiceElementArray(i, o);
                return old;
            }
            
            public void add(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement o)
                { ListOfServiceElementsComplexTypeImpl.this.insertNewServiceElement(i).set(o); }
            
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement remove(int i)
            {
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement old = ListOfServiceElementsComplexTypeImpl.this.getServiceElementArray(i);
                ListOfServiceElementsComplexTypeImpl.this.removeServiceElement(i);
                return old;
            }
            
            public int size()
                { return ListOfServiceElementsComplexTypeImpl.this.sizeOfServiceElementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceElementList();
        }
    }
    
    /**
     * Gets array of all "ServiceElement" elements
     */
    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement[] getServiceElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICEELEMENT$0, targetList);
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement[] result = new com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ServiceElement" element
     */
    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement getServiceElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement)get_store().find_element_user(SERVICEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ServiceElement" element
     */
    public int sizeOfServiceElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "ServiceElement" element
     */
    public void setServiceElementArray(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement[] serviceElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceElementArray, SERVICEELEMENT$0);
        }
    }
    
    /**
     * Sets ith "ServiceElement" element
     */
    public void setServiceElementArray(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement serviceElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement)get_store().find_element_user(SERVICEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ServiceElement" element
     */
    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement insertNewServiceElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement)get_store().insert_element_user(SERVICEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ServiceElement" element
     */
    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement addNewServiceElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement target = null;
            target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement)get_store().add_element_user(SERVICEELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ServiceElement" element
     */
    public void removeServiceElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEELEMENT$0, i);
        }
    }
    /**
     * An XML ServiceElement(@com/icare/eai/schema/om/evSORequest).
     *
     * This is a complex type.
     */
    public static class ServiceElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement
    {
        
        public ServiceElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICEELEMENTNAME$0 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "ServiceElementName");
        private static final javax.xml.namespace.QName LISTOFATTRIBUTE$2 = 
            new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "ListOfAttribute");
        
        
        /**
         * Gets the "ServiceElementName" element
         */
        public java.lang.String getServiceElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEELEMENTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ServiceElementName" element
         */
        public org.apache.xmlbeans.XmlString xgetServiceElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEELEMENTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ServiceElementName" element
         */
        public boolean isSetServiceElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICEELEMENTNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "ServiceElementName" element
         */
        public void setServiceElementName(java.lang.String serviceElementName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEELEMENTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEELEMENTNAME$0);
                }
                target.setStringValue(serviceElementName);
            }
        }
        
        /**
         * Sets (as xml) the "ServiceElementName" element
         */
        public void xsetServiceElementName(org.apache.xmlbeans.XmlString serviceElementName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEELEMENTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEELEMENTNAME$0);
                }
                target.set(serviceElementName);
            }
        }
        
        /**
         * Unsets the "ServiceElementName" element
         */
        public void unsetServiceElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICEELEMENTNAME$0, 0);
            }
        }
        
        /**
         * Gets the "ListOfAttribute" element
         */
        public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute getListOfAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute)get_store().find_element_user(LISTOFATTRIBUTE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ListOfAttribute" element
         */
        public boolean isSetListOfAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTOFATTRIBUTE$2) != 0;
            }
        }
        
        /**
         * Sets the "ListOfAttribute" element
         */
        public void setListOfAttribute(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute listOfAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute)get_store().find_element_user(LISTOFATTRIBUTE$2, 0);
                if (target == null)
                {
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute)get_store().add_element_user(LISTOFATTRIBUTE$2);
                }
                target.set(listOfAttribute);
            }
        }
        
        /**
         * Appends and returns a new empty "ListOfAttribute" element
         */
        public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute addNewListOfAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute target = null;
                target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute)get_store().add_element_user(LISTOFATTRIBUTE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "ListOfAttribute" element
         */
        public void unsetListOfAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTOFATTRIBUTE$2, 0);
            }
        }
        /**
         * An XML ListOfAttribute(@com/icare/eai/schema/om/evSORequest).
         *
         * This is a complex type.
         */
        public static class ListOfAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute
        {
            
            public ListOfAttributeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
                new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "Attribute");
            
            
            /**
             * Gets a List of "Attribute" elements
             */
            public java.util.List<com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute> getAttributeList()
            {
                final class AttributeList extends java.util.AbstractList<com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute>
                {
                    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute get(int i)
                        { return ListOfAttributeImpl.this.getAttributeArray(i); }
                    
                    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute set(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute o)
                    {
                      com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute old = ListOfAttributeImpl.this.getAttributeArray(i);
                      ListOfAttributeImpl.this.setAttributeArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute o)
                        { ListOfAttributeImpl.this.insertNewAttribute(i).set(o); }
                    
                    public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute remove(int i)
                    {
                      com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute old = ListOfAttributeImpl.this.getAttributeArray(i);
                      ListOfAttributeImpl.this.removeAttribute(i);
                      return old;
                    }
                    
                    public int size()
                        { return ListOfAttributeImpl.this.sizeOfAttributeArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new AttributeList();
                }
            }
            
            /**
             * Gets array of all "Attribute" elements
             */
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute[] getAttributeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ATTRIBUTE$0, targetList);
                    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute[] result = new com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Attribute" element
             */
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute getAttributeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute target = null;
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Attribute" element
             */
            public int sizeOfAttributeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ATTRIBUTE$0);
                }
            }
            
            /**
             * Sets array of all "Attribute" element
             */
            public void setAttributeArray(com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute[] attributeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(attributeArray, ATTRIBUTE$0);
                }
            }
            
            /**
             * Sets ith "Attribute" element
             */
            public void setAttributeArray(int i, com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute attribute)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute target = null;
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(attribute);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
             */
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute insertNewAttribute(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute target = null;
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute)get_store().insert_element_user(ATTRIBUTE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Attribute" element
             */
            public com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute addNewAttribute()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute target = null;
                    target = (com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute)get_store().add_element_user(ATTRIBUTE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Attribute" element
             */
            public void removeAttribute(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ATTRIBUTE$0, i);
                }
            }
            /**
             * An XML Attribute(@com/icare/eai/schema/om/evSORequest).
             *
             * This is a complex type.
             */
            public static class AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icare.eai.schema.om.evSORequest.ListOfServiceElementsComplexType.ServiceElement.ListOfAttribute.Attribute
            {
                
                public AttributeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "Name");
                private static final javax.xml.namespace.QName VALUE$2 = 
                    new javax.xml.namespace.QName("com/icare/eai/schema/om/evSORequest", "Value");
                
                
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
                 * True if has "Name" element
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NAME$0) != 0;
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
                 * Unsets the "Name" element
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NAME$0, 0);
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
                 * True if has "Value" element
                 */
                public boolean isSetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(VALUE$2) != 0;
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
                
                /**
                 * Unsets the "Value" element
                 */
                public void unsetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(VALUE$2, 0);
                    }
                }
            }
        }
    }
}
