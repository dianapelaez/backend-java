package coop.tecso.examen.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Movimiento extends AbstractPersistentObject {
    
	private static final long serialVersionUID = -8901155893511467206L;
	
	private CuentaCorriente cuenta;
	private Date fecha;
	private int tipoMovimiento;
	private String descripcion;
	private double importe;
	public CuentaCorriente getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(int tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}	
}
