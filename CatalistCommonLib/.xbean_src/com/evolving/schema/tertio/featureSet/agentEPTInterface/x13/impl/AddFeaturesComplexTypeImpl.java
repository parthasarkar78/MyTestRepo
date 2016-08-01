/*
 * XML Type:  AddFeaturesComplexType
 * Namespace: http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3
 * Java type: com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType
 *
 * Automatically generated - do not modify.
 */
package com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.impl;
/**
 * An XML AddFeaturesComplexType(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
 *
 * This is a complex type.
 */
public class AddFeaturesComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType
{
    
    public AddFeaturesComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURE$0 = 
        new javax.xml.namespace.QName("http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3", "Feature");
    
    
    /**
     * Gets a List of "Feature" elements
     */
    public java.util.List<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature> getFeatureList()
    {
        final class FeatureList extends java.util.AbstractList<com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature>
        {
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature get(int i)
                { return AddFeaturesComplexTypeImpl.this.getFeatureArray(i); }
            
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature set(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature o)
            {
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature old = AddFeaturesComplexTypeImpl.this.getFeatureArray(i);
                AddFeaturesComplexTypeImpl.this.setFeatureArray(i, o);
                return old;
            }
            
            public void add(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature o)
                { AddFeaturesComplexTypeImpl.this.insertNewFeature(i).set(o); }
            
            public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature remove(int i)
            {
                com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature old = AddFeaturesComplexTypeImpl.this.getFeatureArray(i);
                AddFeaturesComplexTypeImpl.this.removeFeature(i);
                return old;
            }
            
            public int size()
                { return AddFeaturesComplexTypeImpl.this.sizeOfFeatureArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FeatureList();
        }
    }
    
    /**
     * Gets array of all "Feature" elements
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature[] getFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATURE$0, targetList);
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature[] result = new com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Feature" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature getFeatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature)get_store().find_element_user(FEATURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Feature" element
     */
    public int sizeOfFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURE$0);
        }
    }
    
    /**
     * Sets array of all "Feature" element
     */
    public void setFeatureArray(com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature[] featureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(featureArray, FEATURE$0);
        }
    }
    
    /**
     * Sets ith "Feature" element
     */
    public void setFeatureArray(int i, com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature feature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature)get_store().find_element_user(FEATURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(feature);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Feature" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature insertNewFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature)get_store().insert_element_user(FEATURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Feature" element
     */
    public com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature addNewFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature target = null;
            target = (com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature)get_store().add_element_user(FEATURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Feature" element
     */
    public void removeFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURE$0, i);
        }
    }
    /**
     * An XML Feature(@http://schema.evolving.com/Tertio/FeatureSet/AgentEPTInterface/1.3).
     *
     * This is a complex type.
     */
    public static class FeatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.AddFeaturesComplexType.Feature
    {
        
        public FeatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURENAME$0 = 
            new javax.xml.namespace.QName("", "FeatureName");
        private static final javax.xml.namespace.QName FEATUREVALUE$2 = 
            new javax.xml.namespace.QName("", "FeatureValue");
        
        
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
         * Gets the "FeatureValue" attribute
         */
        public java.lang.String getFeatureValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATUREVALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FeatureValue" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFeatureValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATUREVALUE$2);
                return target;
            }
        }
        
        /**
         * True if has "FeatureValue" attribute
         */
        public boolean isSetFeatureValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FEATUREVALUE$2) != null;
            }
        }
        
        /**
         * Sets the "FeatureValue" attribute
         */
        public void setFeatureValue(java.lang.String featureValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATUREVALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATUREVALUE$2);
                }
                target.setStringValue(featureValue);
            }
        }
        
        /**
         * Sets (as xml) the "FeatureValue" attribute
         */
        public void xsetFeatureValue(org.apache.xmlbeans.XmlString featureValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATUREVALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FEATUREVALUE$2);
                }
                target.set(featureValue);
            }
        }
        
        /**
         * Unsets the "FeatureValue" attribute
         */
        public void unsetFeatureValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FEATUREVALUE$2);
            }
        }
    }
}
