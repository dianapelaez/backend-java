package coop.tecso.examen.model;

import javax.persistence.Entity;

@Entity
public class PersonaJuridica extends Persona {
    
	private String razonSocial;
	private int fundacion;
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getFundacion() {
		return fundacion;
	}
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}



}
