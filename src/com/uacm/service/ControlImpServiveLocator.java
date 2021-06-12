package com.uacm.service;

import java.net.URL;

import javax.xml.rpc.ServiceException;

public class ControlImpServiveLocator extends org.apache.axis.client.Service implements com.uacm.service.ControlImpService{
	 public ControlImpServiveLocator() {
	    }


	    public ControlImpServiveLocator(org.apache.axis.EngineConfiguration config) {
	        super(config);
	    }

	    public ControlImpServiveLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
	        super(wsdlLoc, sName);
	    }

	    // Use to get a proxy class for LoginImp
	    private java.lang.String ControlImp_address = "http://localhost:8080/Control/services/ControlImp";

	    public java.lang.String getLoginImpAddress() {
	        return ControlImp_address;
	    }

	    // The WSDD service name defaults to the port name.
	    private java.lang.String ControlImpWSDDServiceName = "ControlImp";

	    public java.lang.String getControlImpWSDDServiceName() {
	        return ControlImpWSDDServiceName;
	    }

	    public void setControlImpWSDDServiceName(java.lang.String name) {
	        ControlImpWSDDServiceName = name;
	    }

	    public com.uacm.service.ControlImp getControlImp() throws javax.xml.rpc.ServiceException {
	       java.net.URL endpoint;
	        try {
	            endpoint = new java.net.URL(ControlImp_address);
	        }
	        catch (java.net.MalformedURLException e) {
	            throw new javax.xml.rpc.ServiceException(e);
	        }
	        return getControlImp(endpoint);
	    }

	    public com.uacm.service.ControlImp getLoginImp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
	        try {
	            com.uacm.service.ControlImpSoapBindingStub _stub = new com.uacm.service.ControlImpSoapBindingStub(portAddress, this);
	            _stub.setPortName(getControlImpWSDDServiceName());
	            return _stub;
	        }
	        catch (org.apache.axis.AxisFault e) {
	            return null;
	        }
	    }

	    public void setControlImpEndpointAddress(java.lang.String address) {
	        ControlImp_address = address;
	    }

	    /**
	     * For the given interface, get the stub implementation.
	     * If this service has no port for the given interface,
	     * then ServiceException is thrown.
	     */
	    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
	        try {
	            if (com.uacm.service.ControlImp.class.isAssignableFrom(serviceEndpointInterface)) {
	                com.uacm.service.ControlImpSoapBindingStub _stub = new com.uacm.service.ControlImpSoapBindingStub(new java.net.URL(ControlImp_address), this);
	                _stub.setPortName(getControlImpWSDDServiceName());
	                return _stub;
	            }
	        }
	        catch (java.lang.Throwable t) {
	            throw new javax.xml.rpc.ServiceException(t);
	        }
	        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	    }

	    /**
	     * For the given interface, get the stub implementation.
	     * If this service has no port for the given interface,
	     * then ServiceException is thrown.
	     */
	    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
	        if (portName == null) {
	            return getPort(serviceEndpointInterface);
	        }
	        java.lang.String inputPortName = portName.getLocalPart();
	        if ("ControlImp".equals(inputPortName)) {
	            return getControlImp();
	        }
	        else  {
	            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
	            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
	            return _stub;
	        }
	    }

	    public javax.xml.namespace.QName getServiceName() {
	        return new javax.xml.namespace.QName("http://service.uacm.com", "ControlImpService");
	    }

	    private java.util.HashSet ports = null;

	    public java.util.Iterator getPorts() {
	        if (ports == null) {
	            ports = new java.util.HashSet();
	            ports.add(new javax.xml.namespace.QName("http://service.uacm.com", "ControlImp"));
	        }
	        return ports.iterator();
	    }

	    /**
	    * Set the endpoint address for the specified port name.
	    */
	    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
	        
	if ("LoginImp".equals(portName)) {
	            setControlImpEndpointAddress(address);
	        }
	        else 
	{ // Unknown Port Name
	            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
	        }
	    }

	    /**
	    * Set the endpoint address for the specified port name.
	    */
	    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
	        setEndpointAddress(portName.getLocalPart(), address);
	    }


		@Override
		public ControlImp getControlImp(URL portAddress) throws ServiceException {
			// TODO Auto-generated method stub
			return null;
		}
}
