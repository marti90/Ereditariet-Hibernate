package model;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "Alunno")
public class Studente extends Persona{
	
	private double media;
	
	public Studente(){
		
	}

	public Studente(String nome, String cognome, double media) {
		super(nome,cognome);
		this.setMedia(media);
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	

}
