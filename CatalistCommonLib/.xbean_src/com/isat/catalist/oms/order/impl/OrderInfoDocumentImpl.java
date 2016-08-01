/*
 * An XML document type.
 * Localname: OrderInfo
 * Namespace: http://oms.catalist.isat.com/order
 * Java type: com.isat.catalist.oms.order.OrderInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.isat.catalist.oms.order.impl;
/**
 * A document containing one OrderInfo(@http://oms.catalist.isat.com/order) element.
 *
 * This is a complex type.
 */
public class OrderInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OrderInfoDocument
{
    
    public OrderInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERINFO$0 = 
        new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "OrderInfo");
    
    
    /**
     * Gets the "OrderInfo" element
     */
    public com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo getOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo target = null;
            target = (com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo)get_store().find_element_user(ORDERINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderInfo" element
     */
    public void setOrderInfo(com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo orderInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo target = null;
            target = (com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo)get_store().find_element_user(ORDERINFO$0, 0);
            if (target == null)
            {
                target = (com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo)get_store().add_element_user(ORDERINFO$0);
            }
            target.set(orderInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderInfo" element
     */
    public com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo addNewOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo target = null;
            target = (com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo)get_store().add_element_user(ORDERINFO$0);
            return target;
        }
    }
    /**
     * An XML OrderInfo(@http://oms.catalist.isat.com/order).
     *
     * This is a complex type.
     */
    public static class OrderInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.isat.catalist.oms.order.OrderInfoDocument.OrderInfo
    {
        
        public OrderInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "header");
        private static final javax.xml.namespace.QName ITEMS$2 = 
            new javax.xml.namespace.QName("http://oms.catalist.isat.com/order", "items");
        
        
        /**
         * Gets the "header" element
         */
        public com.isat.catalist.oms.order.OOSOrderHeaderType getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderHeaderType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderHeaderType)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "header" element
         */
        public void setHeader(com.isat.catalist.oms.order.OOSOrderHeaderType header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderHeaderType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderHeaderType)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    target = (com.isat.catalist.oms.order.OOSOrderHeaderType)get_store().add_element_user(HEADER$0);
                }
                target.set(header);
            }
        }
        
        /**
         * Appends and returns a new empty "header" element
         */
        public com.isat.catalist.oms.order.OOSOrderHeaderType addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderHeaderType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderHeaderType)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "items" elements
         */
        public java.util.List<com.isat.catalist.oms.order.OOSOrderLineItemType> getItemsList()
        {
            final class ItemsList extends java.util.AbstractList<com.isat.catalist.oms.order.OOSOrderLineItemType>
            {
                public com.isat.catalist.oms.order.OOSOrderLineItemType get(int i)
                    { return OrderInfoImpl.this.getItemsArray(i); }
                
                public com.isat.catalist.oms.order.OOSOrderLineItemType set(int i, com.isat.catalist.oms.order.OOSOrderLineItemType o)
                {
                    com.isat.catalist.oms.order.OOSOrderLineItemType old = OrderInfoImpl.this.getItemsArray(i);
                    OrderInfoImpl.this.setItemsArray(i, o);
                    return old;
                }
                
                public void add(int i, com.isat.catalist.oms.order.OOSOrderLineItemType o)
                    { OrderInfoImpl.this.insertNewItems(i).set(o); }
                
                public com.isat.catalist.oms.order.OOSOrderLineItemType remove(int i)
                {
                    com.isat.catalist.oms.order.OOSOrderLineItemType old = OrderInfoImpl.this.getItemsArray(i);
                    OrderInfoImpl.this.removeItems(i);
                    return old;
                }
                
                public int size()
                    { return OrderInfoImpl.this.sizeOfItemsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ItemsList();
            }
        }
        
        /**
         * Gets array of all "items" elements
         */
        public com.isat.catalist.oms.order.OOSOrderLineItemType[] getItemsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ITEMS$2, targetList);
                com.isat.catalist.oms.order.OOSOrderLineItemType[] result = new com.isat.catalist.oms.order.OOSOrderLineItemType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "items" element
         */
        public com.isat.catalist.oms.order.OOSOrderLineItemType getItemsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderLineItemType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderLineItemType)get_store().find_element_user(ITEMS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "items" element
         */
        public int sizeOfItemsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ITEMS$2);
            }
        }
        
        /**
         * Sets array of all "items" element
         */
        public void setItemsArray(com.isat.catalist.oms.order.OOSOrderLineItemType[] itemsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(itemsArray, ITEMS$2);
            }
        }
        
        /**
         * Sets ith "items" element
         */
        public void setItemsArray(int i, com.isat.catalist.oms.order.OOSOrderLineItemType items)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderLineItemType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderLineItemType)get_store().find_element_user(ITEMS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(items);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "items" element
         */
        public com.isat.catalist.oms.order.OOSOrderLineItemType insertNewItems(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderLineItemType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderLineItemType)get_store().insert_element_user(ITEMS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "items" element
         */
        public com.isat.catalist.oms.order.OOSOrderLineItemType addNewItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.isat.catalist.oms.order.OOSOrderLineItemType target = null;
                target = (com.isat.catalist.oms.order.OOSOrderLineItemType)get_store().add_element_user(ITEMS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "items" element
         */
        public void removeItems(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ITEMS$2, i);
            }
        }
    }
}
