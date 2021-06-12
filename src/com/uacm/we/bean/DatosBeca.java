package com.uacm.we.bean;

import java.io.Serializable;

public class DatosBeca  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombreBeca;
	private String fechaDeposito;
	private double importe;
	private String status;
	
	public String getNombreBeca() {
		return nombreBeca;
	}
	public void setNombreBeca(String nombreBeca) {
		this.nombreBeca = nombreBeca;
	}
	public String getFechaDeposito() {
		return fechaDeposito;
	}
	public void setFechaDeposito(String fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
