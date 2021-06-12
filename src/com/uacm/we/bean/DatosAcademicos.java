package com.uacm.we.bean;

import java.io.Serializable;

public class DatosAcademicos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int cursosCertificados;
	private int cursosFaltantes;
	private double promedio;
	private String tutor;
	private String plantel;
	private String carrera;
	public int getCursosCertificados() {
		return cursosCertificados;
	}
	public void setCursosCertificados(int cursosCertificados) {
		this.cursosCertificados = cursosCertificados;
	}
	public int getCursosFaltantes() {
		return cursosFaltantes;
	}
	public void setCursosFaltantes(int cursosFaltantes) {
		this.cursosFaltantes = cursosFaltantes;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getPlantel() {
		return plantel;
	}
	public void setPlantel(String plantel) {
		this.plantel = plantel;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
}
		
