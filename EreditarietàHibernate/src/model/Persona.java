package model;

//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(discriminatorType=DiscriminatorType.STRING)
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id_utente;
	
	protected String nome;
	protected String cognome;
	
	public Persona(){
		
	}
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public long getId_utente() {
		return id_utente;
	}

	public void setId_utente(long id_utente) {
		this.id_utente = id_utente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
