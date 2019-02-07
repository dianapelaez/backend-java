package coop.tecso.examen.model;

import javax.persistence.Entity;

@Entity
public class CuentaCorriente extends AbstractPersistentObject {
    
	private static final long serialVersionUID = -8901155893511467206L;
	
	private Long numero;
	private Persona titular;
	private int moneda;
	private double saldo;

	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public int getMoneda() {
		return moneda;
	}
	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
	   this.saldo = saldo;
	}

}
