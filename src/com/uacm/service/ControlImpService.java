package com.uacm.service;

public interface ControlImpService  extends javax.xml.rpc.Service{
	
	    public java.lang.String getLoginImpAddress();

	    public com.uacm.service.ControlImp getControlImp() throws javax.xml.rpc.ServiceException;

	    public com.uacm.service.ControlImp getControlImp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

}
