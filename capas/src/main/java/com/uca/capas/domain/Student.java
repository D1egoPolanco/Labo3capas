package com.uca.capas.domain;

public class Student {

	private String nombre;
	private String apellidos;
	private String fEntrada;
	private String carrera;
	private boolean estado;
	
	public Student(String nombre, String apellido, String fEntrada, String carrera, boolean estado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellido;
		this.fEntrada = fEntrada;
		this.carrera = carrera;
		this.estado = estado;
	}
	
	public Student() {}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getfEntrada() {
		return fEntrada;
	}
	public void setfEntrada(String fEntrada) {
		this.fEntrada = fEntrada;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String delegateEstado() {
		return this.estado? "Activo": "Inactivo";
	}
	
	
}