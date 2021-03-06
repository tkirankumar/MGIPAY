/**
 * CurrencyConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * Describes the conversion between 2 currencies.
 */
public class CurrencyConversion  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.CurrencyType from;

    private com.mgipaypal.paypal.client.CurrencyType to;

    private java.math.BigDecimal exchangeRate;

    private org.apache.axis.message.MessageElement [] _any;

    public CurrencyConversion() {
    }

    public CurrencyConversion(
           com.mgipaypal.paypal.client.CurrencyType from,
           com.mgipaypal.paypal.client.CurrencyType to,
           java.math.BigDecimal exchangeRate,
           org.apache.axis.message.MessageElement [] _any) {
           this.from = from;
           this.to = to;
           this.exchangeRate = exchangeRate;
           this._any = _any;
    }


    /**
     * Gets the from value for this CurrencyConversion.
     * 
     * @return from
     */
    public com.mgipaypal.paypal.client.CurrencyType getFrom() {
        return from;
    }


    /**
     * Sets the from value for this CurrencyConversion.
     * 
     * @param from
     */
    public void setFrom(com.mgipaypal.paypal.client.CurrencyType from) {
        this.from = from;
    }


    /**
     * Gets the to value for this CurrencyConversion.
     * 
     * @return to
     */
    public com.mgipaypal.paypal.client.CurrencyType getTo() {
        return to;
    }


    /**
     * Sets the to value for this CurrencyConversion.
     * 
     * @param to
     */
    public void setTo(com.mgipaypal.paypal.client.CurrencyType to) {
        this.to = to;
    }


    /**
     * Gets the exchangeRate value for this CurrencyConversion.
     * 
     * @return exchangeRate
     */
    public java.math.BigDecimal getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CurrencyConversion.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the _any value for this CurrencyConversion.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this CurrencyConversion.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyConversion)) return false;
        CurrencyConversion other = (CurrencyConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(CurrencyConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
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
