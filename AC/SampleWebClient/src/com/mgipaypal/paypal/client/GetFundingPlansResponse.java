/**
 * GetFundingPlansResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The response to get the funding plans available
 * 						for a payment.
 */
public class GetFundingPlansResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope;

    private com.mgipaypal.paypal.client.FundingPlan[] fundingPlan;

    private org.apache.axis.message.MessageElement [] _any;

    public GetFundingPlansResponse() {
    }

    public GetFundingPlansResponse(
           com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope,
           com.mgipaypal.paypal.client.FundingPlan[] fundingPlan,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.fundingPlan = fundingPlan;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this GetFundingPlansResponse.
     * 
     * @return responseEnvelope
     */
    public com.mgipaypal.paypal.client.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this GetFundingPlansResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the fundingPlan value for this GetFundingPlansResponse.
     * 
     * @return fundingPlan
     */
    public com.mgipaypal.paypal.client.FundingPlan[] getFundingPlan() {
        return fundingPlan;
    }


    /**
     * Sets the fundingPlan value for this GetFundingPlansResponse.
     * 
     * @param fundingPlan
     */
    public void setFundingPlan(com.mgipaypal.paypal.client.FundingPlan[] fundingPlan) {
        this.fundingPlan = fundingPlan;
    }

    public com.mgipaypal.paypal.client.FundingPlan getFundingPlan(int i) {
        return this.fundingPlan[i];
    }

    public void setFundingPlan(int i, com.mgipaypal.paypal.client.FundingPlan _value) {
        this.fundingPlan[i] = _value;
    }


    /**
     * Gets the _any value for this GetFundingPlansResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetFundingPlansResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFundingPlansResponse)) return false;
        GetFundingPlansResponse other = (GetFundingPlansResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseEnvelope==null && other.getResponseEnvelope()==null) || 
             (this.responseEnvelope!=null &&
              this.responseEnvelope.equals(other.getResponseEnvelope()))) &&
            ((this.fundingPlan==null && other.getFundingPlan()==null) || 
             (this.fundingPlan!=null &&
              java.util.Arrays.equals(this.fundingPlan, other.getFundingPlan()))) &&
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
        if (getResponseEnvelope() != null) {
            _hashCode += getResponseEnvelope().hashCode();
        }
        if (getFundingPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFundingPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFundingPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetFundingPlansResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlan"));
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
