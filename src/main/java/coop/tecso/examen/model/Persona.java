package coop.tecso.examen.model;

public abstract class Persona extends AbstractPersistentObject {
    
	private static final long serialVersionUID = -8901155893511467206L;
	
	private Long cuit;

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

}
