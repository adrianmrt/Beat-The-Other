package com.example.demo;

public class User {

	private String nombre;
	private String password;

	public User() {
	}

	public User(String nombre, String password) {
		this.nombre = nombre;
		this.password= password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

}