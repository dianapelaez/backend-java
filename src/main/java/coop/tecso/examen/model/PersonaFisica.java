package coop.tecso.examen.model;

import javax.persistence.Entity;

@Entity
public class PersonaFisica extends Persona {
	
	private String nombre;
	private String apellido;
	private Long dni;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	
	

}
