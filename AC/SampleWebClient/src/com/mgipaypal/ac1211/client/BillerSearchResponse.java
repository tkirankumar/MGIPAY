/**
 * BillerSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillerSearchResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.BillerInfo[] billerInfo;

    public BillerSearchResponse() {
    }

    public BillerSearchResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.BillerInfo[] billerInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.billerInfo = billerInfo;
    }


    /**
     * Gets the billerInfo value for this BillerSearchResponse.
     * 
     * @return billerInfo
     */
    public com.mgipaypal.ac1211.client.BillerInfo[] getBillerInfo() {
        return billerInfo;
    }


    /**
     * Sets the billerInfo value for this BillerSearchResponse.
     * 
     * @param billerInfo
     */
    public void setBillerInfo(com.mgipaypal.ac1211.client.BillerInfo[] billerInfo) {
        this.billerInfo = billerInfo;
    }

    public com.mgipaypal.ac1211.client.BillerInfo getBillerInfo(int i) {
        return this.billerInfo[i];
    }

    public void setBillerInfo(int i, com.mgipaypal.ac1211.client.BillerInfo _value) {
        this.billerInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillerSearchResponse)) return false;
        BillerSearchResponse other = (BillerSearchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billerInfo==null && other.getBillerInfo()==null) || 
             (this.billerInfo!=null &&
              java.util.Arrays.equals(this.billerInfo, other.getBillerInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBillerInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillerInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillerInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillerSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
