package com.uacm.client;

import java.rmi.RemoteException;

import com.uacm.service.ControlImp;
import com.uacm.service.ControlImpProxy;
import com.uacm.we.bean.Alumno;


public class Principal {
	public static void main(String[] args) {
	ControlImp c = new ControlImpProxy("http://localhost:8080/Control/services/ControlImp");
	Alumno a = new Alumno();
	a = control.control(a);
	
/*	BeanLogin beanLogin = new BeanLogin();
	beanLogin.setUsuario("Bellicose");

	beanLogin.setPassword("123456");
	try {
		beanLogin=login.validaLogin(beanLogin);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(beanLogin.isStatus()) {
		System.out.println("Welcome...");
		String nombre = beanLogin.getUsuario();
		String password=beanLogin.getPassword();
		System.out.println(nombre);
		System.out.println(password);
	}else
		System.out.println(beanLogin.getMensaje());
}*/
	}
}
