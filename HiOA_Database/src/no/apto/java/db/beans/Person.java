package no.apto.java.db.beans;
//denne er kun for testing, brukes ikke
import java.io.Serializable;
import java.sql.Date;

/**
 * @author KnutInge
 *
 */
public class Person implements Serializable{

	//trenger egentlig ikke denne slik det er nå
	private static final long serialVersionUID = -6226181638570017594L;
	
	private int personId;
	private String fornavn;	
	private String etternavn;
	private String mail;
	private String hjemmeside;
	private int mobil;
	private Date dato;
	

	
	
	public int getPersonId() {
		return personId;
	}
		
	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getHjemmeside() {
		return hjemmeside;
	}

	public void setHjemmeside(String hjemmeside) {
		this.hjemmeside = hjemmeside;
	}

	public int getMobil() {
		return mobil;
	}

	public void setMobil(int mobil) {
		this.mobil = mobil;
	}

	public Date getDato() {
		return dato;
	}

	public void setDato(Date dato) {
		this.dato = dato;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	public String getFornavn() {
		return fornavn;
	}
	
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
