package com.uacm.we.bean;

import java.io.Serializable;

public class DatosMedicos  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String alergias;
	private double peso;
	private double estatura;
	private String enfermedades;
	
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(String enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	
}

