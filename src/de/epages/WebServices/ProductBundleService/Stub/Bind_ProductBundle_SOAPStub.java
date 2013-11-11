/**
 * Bind_ProductBundle_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductBundleService.Stub;

public class Bind_ProductBundle_SOAPStub extends org.apache.axis.client.Stub implements de.epages.WebServices.ProductBundleService.Stub.Port_ProductBundle_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductBundles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Create_In"), de.epages.WebServices.ProductBundleService.Stub.TCreate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Create_Out"));
        oper.setReturnClass(de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductBundles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductBundles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Delete_In"), de.epages.WebServices.ProductBundleService.Stub.TDelete_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Delete_Out"));
        oper.setReturnClass(de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductBundles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductBundles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Exists_In"), de.epages.WebServices.ProductBundleService.Stub.TExists_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Exists_Out"));
        oper.setReturnClass(de.epages.WebServices.ProductBundleService.Stub.TExists_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductBundles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_GetInfo_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_GetInfo_Out"));
        oper.setReturnClass(de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductBundles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

    }

    public Bind_ProductBundle_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_ProductBundle_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_ProductBundle_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Create_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TCreate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TCreate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Create_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TCreate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Delete_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TDelete_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TDelete_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Delete_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TDelete_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Exists_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TExists_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TExists_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_Exists_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TExists_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TExists_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_GetInfo_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "type_GetInfo_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TGetInfo_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "ListOfBundledProductPaths");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TBundledProductPath[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TBundledProductPath");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "ListOfBundledProducts");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TBundledProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TBundledProduct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TBundledProduct");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TBundledProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TBundledProductPath");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TBundledProductPath.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TCreate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TCreate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TCreate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TCreate_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TDelete_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TDelete_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TDelete_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TDelete_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TExists_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TExists_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TExists_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TExists_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TGetInfo_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return.class;
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
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
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

    public de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[] create(de.epages.WebServices.ProductBundleService.Stub.TCreate_Input[] productBundles) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductBundleService/2007/07#create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productBundles});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[] delete(de.epages.WebServices.ProductBundleService.Stub.TDelete_Input[] productBundles) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductBundleService/2007/07#delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productBundles});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.ProductBundleService.Stub.TExists_Return[] exists(de.epages.WebServices.ProductBundleService.Stub.TExists_Input[] productBundles) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductBundleService/2007/07#exists");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productBundles});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.ProductBundleService.Stub.TExists_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.ProductBundleService.Stub.TExists_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.ProductBundleService.Stub.TExists_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[] getInfo(java.lang.String[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductBundleService/2007/07#getInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "getInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
