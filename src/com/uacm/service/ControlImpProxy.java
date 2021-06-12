package com.uacm.service;

public class ControlImpProxy implements com.uacm.service.ControlImp {
	 private String _endpoint = null;
	  private com.uacm.service.ControlImp controlImp = null;
	  
	  public ControlImpProxy() {
	    _initControlImpProxy();
	  }
	  
	  public ControlImpProxy(String endpoint) {
	    _endpoint = endpoint;
	    _initControlImpProxy();
	  }
	  
	  private void _initControlImpProxy() {
	    try {
	      controlImp = (new com.uacm.service.ControlImpServiveLocator()).getControlImp();
	      if (controlImp != null) {
	        if (_endpoint != null)
	          ((javax.xml.rpc.Stub)controlImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
	        else
	          _endpoint = (String)((javax.xml.rpc.Stub)controlImp)._getProperty("javax.xml.rpc.service.endpoint.address");
	      }
	      
	    }
	    catch (javax.xml.rpc.ServiceException serviceException) {}
	  }
	  
	  public String getEndpoint() {
	    return _endpoint;
	  }
	  
	  public void setEndpoint(String endpoint) {
	    _endpoint = endpoint;
	    if (controlImp != null)
	      ((javax.xml.rpc.Stub)controlImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
	    
	  }
	  
	  public com.uacm.service.ControlImp getControlImp() {
	    if (controlImp == null)
	      _initControlImpProxy();
	    return controlImp;
	  }
	  
	  public com.uacm.we.bean.Alumno control(com.uacm.we.bean.Alumno control) throws java.rmi.RemoteException{
	    if (controlImp == null)
	      _initControlImpProxy();
	    return controlImp.control(control);
	  }
}
