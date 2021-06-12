package com.uacm.we.bean;

import java.io.Serializable;

public class Alumno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private DatosPersonales dp;
	private DatosAcademicos da;
	private DatosBeca db;
	private DatosMedicos dm;
	public DatosPersonales getDp() {
		return dp;
	}
	public void setDp(DatosPersonales dp) {
		this.dp = dp;
	}
	public DatosAcademicos getDa() {
		return da;
	}
	public void setDa(DatosAcademicos da) {
		this.da = da;
	}
	public DatosBeca getDb() {
		return db;
	}
	public void setDb(DatosBeca db) {
		this.db = db;
	}
	public DatosMedicos getDm() {
		return dm;
	}
	public void setDm(DatosMedicos dm) {
		this.dm = dm;
	}
	
	

}