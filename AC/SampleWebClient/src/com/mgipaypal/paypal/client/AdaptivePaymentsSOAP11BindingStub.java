/**
 * AdaptivePaymentsSOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;

public class AdaptivePaymentsSOAP11BindingStub extends org.apache.axis.client.Stub implements com.mgipaypal.paypal.client.AdaptivePaymentsPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelPreapproval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalRequest"), com.mgipaypal.paypal.client.CancelPreapprovalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.CancelPreapprovalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfirmPreapproval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalRequest"), com.mgipaypal.paypal.client.ConfirmPreapprovalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.ConfirmPreapprovalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConvertCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyRequest"), com.mgipaypal.paypal.client.ConvertCurrencyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.ConvertCurrencyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecutePayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentRequest"), com.mgipaypal.paypal.client.ExecutePaymentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.ExecutePaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllowedFundingSources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesRequest"), com.mgipaypal.paypal.client.GetAllowedFundingSourcesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPaymentOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsRequest"), com.mgipaypal.paypal.client.GetPaymentOptionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.GetPaymentOptionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PaymentDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsRequest"), com.mgipaypal.paypal.client.PaymentDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.PaymentDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Pay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayRequest"), com.mgipaypal.paypal.client.PayRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.PayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PreapprovalDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsRequest"), com.mgipaypal.paypal.client.PreapprovalDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.PreapprovalDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Preapproval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalRequest"), com.mgipaypal.paypal.client.PreapprovalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.PreapprovalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Refund");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundRequest"), com.mgipaypal.paypal.client.RefundRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.RefundResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetPaymentOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsRequest"), com.mgipaypal.paypal.client.SetPaymentOptionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.SetPaymentOptionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFundingPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansRequest"), com.mgipaypal.paypal.client.GetFundingPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.GetFundingPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvailableShippingAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesRequest"), com.mgipaypal.paypal.client.GetAvailableShippingAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetShippingAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesRequest"), com.mgipaypal.paypal.client.GetShippingAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.GetShippingAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserLimits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsRequest"), com.mgipaypal.paypal.client.GetUserLimitsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsResponse"));
        oper.setReturnClass(com.mgipaypal.paypal.client.GetUserLimitsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"),
                      "com.mgipaypal.paypal.client.FaultMessage",
                      new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage"), 
                      true
                     ));
        _operations[15] = oper;

    }

    public AdaptivePaymentsSOAP11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AdaptivePaymentsSOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AdaptivePaymentsSOAP11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Address");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "AddressList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.Address[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Address");
            qName2 = new javax.xml.namespace.QName("", "address");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CancelPreapprovalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CancelPreapprovalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ConfirmPreapprovalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ConfirmPreapprovalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ConvertCurrencyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ConvertCurrencyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyCodeList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "currencyCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversion");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CurrencyConversion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversionList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CurrencyConversionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversionTable");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CurrencyConversionList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversionList");
            qName2 = new javax.xml.namespace.QName("", "currencyConversionList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CurrencyType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType");
            qName2 = new javax.xml.namespace.QName("", "currency");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "DisplayOptions");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.DisplayOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ErrorList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ErrorData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorData");
            qName2 = new javax.xml.namespace.QName("", "error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ExecutePaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ExecutePaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingConstraint");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FundingConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlan");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FundingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlanCharge");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FundingPlanCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingSource");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FundingSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FundingTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingTypeList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FundingTypeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingTypeInfo");
            qName2 = new javax.xml.namespace.QName("", "fundingTypeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetAllowedFundingSourcesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetAvailableShippingAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetFundingPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetFundingPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetFundingPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetPaymentOptionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetPaymentOptionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetShippingAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetShippingAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetUserLimitsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.GetUserLimitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InitiatingEntity");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.InitiatingEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InstitutionCustomer");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.InstitutionCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InvoiceData");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.InvoiceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InvoiceItem");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.InvoiceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayError");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PayError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayErrorList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PayError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayError");
            qName2 = new javax.xml.namespace.QName("", "payError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PaymentDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PaymentDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentInfoList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PaymentInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentInfo");
            qName2 = new javax.xml.namespace.QName("", "paymentInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PayRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PreapprovalDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PreapprovalDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PreapprovalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PreapprovalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.Receiver.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ReceiverIdentifier");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ReceiverIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ReceiverList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.Receiver[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver");
            qName2 = new javax.xml.namespace.QName("", "receiver");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ReceiverOptions");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ReceiverOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.RefundInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundInfoList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.RefundInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundInfo");
            qName2 = new javax.xml.namespace.QName("", "refundInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.RefundRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.RefundResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SenderIdentifier");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.SenderIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SenderOptions");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.SenderOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.SetPaymentOptionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.SetPaymentOptionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "TaxIdDetails");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.TaxIdDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "UserLimit");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.UserLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "WarningData");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.WarningData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "WarningDataList");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.WarningData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "WarningData");
            qName2 = new javax.xml.namespace.QName("", "warningData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "AccountIdentifier");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.AccountIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "AckCode");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.AckCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "BaseAddress");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.BaseAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ClientDetailsType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ClientDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.CurrencyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "DayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "DetailLevelCode");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.DetailLevelCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorCategory");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ErrorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorData");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ErrorData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorParameter");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ErrorParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorSeverity");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ErrorSeverity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "FaultMessage");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.FaultMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "PhoneNumberType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.PhoneNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.RequestEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.paypal.client.ResponseEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.mgipaypal.paypal.client.CancelPreapprovalResponse cancelPreapproval(com.mgipaypal.paypal.client.CancelPreapprovalRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:CancelPreapproval");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CancelPreapproval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.CancelPreapprovalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.CancelPreapprovalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.CancelPreapprovalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.ConfirmPreapprovalResponse confirmPreapproval(com.mgipaypal.paypal.client.ConfirmPreapprovalRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ConfirmPreapproval");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConfirmPreapproval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.ConfirmPreapprovalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.ConfirmPreapprovalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.ConfirmPreapprovalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.ConvertCurrencyResponse convertCurrency(com.mgipaypal.paypal.client.ConvertCurrencyRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ConvertCurrency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConvertCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.ConvertCurrencyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.ConvertCurrencyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.ConvertCurrencyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.ExecutePaymentResponse executePayment(com.mgipaypal.paypal.client.ExecutePaymentRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ExecutePayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExecutePayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.ExecutePaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.ExecutePaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.ExecutePaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse getAllowedFundingSources(com.mgipaypal.paypal.client.GetAllowedFundingSourcesRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetAllowedFundingSources");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllowedFundingSources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.GetPaymentOptionsResponse getPaymentOptions(com.mgipaypal.paypal.client.GetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetPaymentOptions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPaymentOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.GetPaymentOptionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.GetPaymentOptionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.GetPaymentOptionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.PaymentDetailsResponse paymentDetails(com.mgipaypal.paypal.client.PaymentDetailsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:PaymentDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PaymentDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.PaymentDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.PaymentDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.PaymentDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.PayResponse pay(com.mgipaypal.paypal.client.PayRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Pay");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Pay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.PayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.PayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.PayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.PreapprovalDetailsResponse preapprovalDetails(com.mgipaypal.paypal.client.PreapprovalDetailsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:PreapprovalDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PreapprovalDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.PreapprovalDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.PreapprovalDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.PreapprovalDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.PreapprovalResponse preapproval(com.mgipaypal.paypal.client.PreapprovalRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Preapproval");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Preapproval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.PreapprovalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.PreapprovalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.PreapprovalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.RefundResponse refund(com.mgipaypal.paypal.client.RefundRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Refund");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Refund"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.RefundResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.RefundResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.RefundResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.SetPaymentOptionsResponse setPaymentOptions(com.mgipaypal.paypal.client.SetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SetPaymentOptions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetPaymentOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.SetPaymentOptionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.SetPaymentOptionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.SetPaymentOptionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.GetFundingPlansResponse getFundingPlans(com.mgipaypal.paypal.client.GetFundingPlansRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetFundingPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetFundingPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.GetFundingPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.GetFundingPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.GetFundingPlansResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse getAvailableShippingAddresses(com.mgipaypal.paypal.client.GetAvailableShippingAddressesRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetAvailableShippingAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAvailableShippingAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.GetShippingAddressesResponse getShippingAddresses(com.mgipaypal.paypal.client.GetShippingAddressesRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetShippingAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetShippingAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.GetShippingAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.GetShippingAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.GetShippingAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.paypal.client.GetUserLimitsResponse getUserLimits(com.mgipaypal.paypal.client.GetUserLimitsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetUserLimits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUserLimits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.paypal.client.GetUserLimitsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.paypal.client.GetUserLimitsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.paypal.client.GetUserLimitsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.paypal.client.FaultMessage) {
              throw (com.mgipaypal.paypal.client.FaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
