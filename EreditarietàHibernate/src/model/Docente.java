package model;

import javax.persistence.Entity;

@Entity
public class Docente extends Persona{
	
	private double stipendio;
	
	public Docente(){
		
	}

	public Docente(String nome, String cognome, double stipendio) {
		super(nome,cognome);
		this.setStipendio(stipendio);
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	

}
