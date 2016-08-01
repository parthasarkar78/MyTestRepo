/*
 * XML Type:  PersonalisationsComplexType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.impl;
/**
 * An XML PersonalisationsComplexType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public class PersonalisationsComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType
{
    
    public PersonalisationsComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONALISATION$0 = 
        new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Personalisation");
    
    
    /**
     * Gets a List of "Personalisation" elements
     */
    public java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation> getPersonalisationList()
    {
        final class PersonalisationList extends java.util.AbstractList<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation>
        {
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation get(int i)
                { return PersonalisationsComplexTypeImpl.this.getPersonalisationArray(i); }
            
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation set(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation o)
            {
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation old = PersonalisationsComplexTypeImpl.this.getPersonalisationArray(i);
                PersonalisationsComplexTypeImpl.this.setPersonalisationArray(i, o);
                return old;
            }
            
            public void add(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation o)
                { PersonalisationsComplexTypeImpl.this.insertNewPersonalisation(i).set(o); }
            
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation remove(int i)
            {
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation old = PersonalisationsComplexTypeImpl.this.getPersonalisationArray(i);
                PersonalisationsComplexTypeImpl.this.removePersonalisation(i);
                return old;
            }
            
            public int size()
                { return PersonalisationsComplexTypeImpl.this.sizeOfPersonalisationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PersonalisationList();
        }
    }
    
    /**
     * Gets array of all "Personalisation" elements
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation[] getPersonalisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONALISATION$0, targetList);
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation[] result = new com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Personalisation" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation getPersonalisationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation)get_store().find_element_user(PERSONALISATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Personalisation" element
     */
    public int sizeOfPersonalisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONALISATION$0);
        }
    }
    
    /**
     * Sets array of all "Personalisation" element
     */
    public void setPersonalisationArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation[] personalisationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personalisationArray, PERSONALISATION$0);
        }
    }
    
    /**
     * Sets ith "Personalisation" element
     */
    public void setPersonalisationArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation personalisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation)get_store().find_element_user(PERSONALISATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personalisation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Personalisation" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation insertNewPersonalisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation)get_store().insert_element_user(PERSONALISATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Personalisation" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation addNewPersonalisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation)get_store().add_element_user(PERSONALISATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Personalisation" element
     */
    public void removePersonalisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONALISATION$0, i);
        }
    }
    /**
     * An XML Personalisation(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public static class PersonalisationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.PersonalisationsComplexType.Personalisation
    {
        
        public PersonalisationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURENAME$0 = 
            new javax.xml.namespace.QName("", "FeatureName");
        private static final javax.xml.namespace.QName PERSONALISATIONNAME$2 = 
            new javax.xml.namespace.QName("", "PersonalisationName");
        private static final javax.xml.namespace.QName PERSONALISATIONACTION$4 = 
            new javax.xml.namespace.QName("", "PersonalisationAction");
        private static final javax.xml.namespace.QName KEYVALUE$6 = 
            new javax.xml.namespace.QName("", "KeyValue");
        private static final javax.xml.namespace.QName PARAMETERS$8 = 
            new javax.xml.namespace.QName("", "Parameters");
        
        
        /**
         * Gets the "FeatureName" attribute
         */
        public java.lang.String getFeatureName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURENAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FeatureName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFeatureName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURENAME$0);
                return target;
            }
        }
        
        /**
         * True if has "FeatureName" attribute
         */
        public boolean isSetFeatureName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FEATURENAME$0) != null;
            }
        }
        
        /**
         * Sets the "FeatureName" attribute
         */
        public void setFeatureName(java.lang.String featureName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATURENAME$0);
                }
                target.setStringValue(featureName);
            }
        }
        
        /**
         * Sets (as xml) the "FeatureName" attribute
         */
        public void xsetFeatureName(org.apache.xmlbeans.XmlString featureName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FEATURENAME$0);
                }
                target.set(featureName);
            }
        }
        
        /**
         * Unsets the "FeatureName" attribute
         */
        public void unsetFeatureName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FEATURENAME$0);
            }
        }
        
        /**
         * Gets the "PersonalisationName" attribute
         */
        public java.lang.String getPersonalisationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONALISATIONNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonalisationName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPersonalisationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONALISATIONNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "PersonalisationName" attribute
         */
        public boolean isSetPersonalisationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERSONALISATIONNAME$2) != null;
            }
        }
        
        /**
         * Sets the "PersonalisationName" attribute
         */
        public void setPersonalisationName(java.lang.String personalisationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONALISATIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONALISATIONNAME$2);
                }
                target.setStringValue(personalisationName);
            }
        }
        
        /**
         * Sets (as xml) the "PersonalisationName" attribute
         */
        public void xsetPersonalisationName(org.apache.xmlbeans.XmlString personalisationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONALISATIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERSONALISATIONNAME$2);
                }
                target.set(personalisationName);
            }
        }
        
        /**
         * Unsets the "PersonalisationName" attribute
         */
        public void unsetPersonalisationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERSONALISATIONNAME$2);
            }
        }
        
        /**
         * Gets the "PersonalisationAction" attribute
         */
        public java.lang.String getPersonalisationAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONALISATIONACTION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonalisationAction" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPersonalisationAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONALISATIONACTION$4);
                return target;
            }
        }
        
        /**
         * True if has "PersonalisationAction" attribute
         */
        public boolean isSetPersonalisationAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERSONALISATIONACTION$4) != null;
            }
        }
        
        /**
         * Sets the "PersonalisationAction" attribute
         */
        public void setPersonalisationAction(java.lang.String personalisationAction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONALISATIONACTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONALISATIONACTION$4);
                }
                target.setStringValue(personalisationAction);
            }
        }
        
        /**
         * Sets (as xml) the "PersonalisationAction" attribute
         */
        public void xsetPersonalisationAction(org.apache.xmlbeans.XmlString personalisationAction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONALISATIONACTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERSONALISATIONACTION$4);
                }
                target.set(personalisationAction);
            }
        }
        
        /**
         * Unsets the "PersonalisationAction" attribute
         */
        public void unsetPersonalisationAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERSONALISATIONACTION$4);
            }
        }
        
        /**
         * Gets the "KeyValue" attribute
         */
        public java.lang.String getKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYVALUE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KeyValue" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYVALUE$6);
                return target;
            }
        }
        
        /**
         * True if has "KeyValue" attribute
         */
        public boolean isSetKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEYVALUE$6) != null;
            }
        }
        
        /**
         * Sets the "KeyValue" attribute
         */
        public void setKeyValue(java.lang.String keyValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYVALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYVALUE$6);
                }
                target.setStringValue(keyValue);
            }
        }
        
        /**
         * Sets (as xml) the "KeyValue" attribute
         */
        public void xsetKeyValue(org.apache.xmlbeans.XmlString keyValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYVALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEYVALUE$6);
                }
                target.set(keyValue);
            }
        }
        
        /**
         * Unsets the "KeyValue" attribute
         */
        public void unsetKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEYVALUE$6);
            }
        }
        
        /**
         * Gets the "Parameters" attribute
         */
        public java.lang.String getParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERS$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Parameters" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERS$8);
                return target;
            }
        }
        
        /**
         * True if has "Parameters" attribute
         */
        public boolean isSetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARAMETERS$8) != null;
            }
        }
        
        /**
         * Sets the "Parameters" attribute
         */
        public void setParameters(java.lang.String parameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERS$8);
                }
                target.setStringValue(parameters);
            }
        }
        
        /**
         * Sets (as xml) the "Parameters" attribute
         */
        public void xsetParameters(org.apache.xmlbeans.XmlString parameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAMETERS$8);
                }
                target.set(parameters);
            }
        }
        
        /**
         * Unsets the "Parameters" attribute
         */
        public void unsetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARAMETERS$8);
            }
        }
    }
}
