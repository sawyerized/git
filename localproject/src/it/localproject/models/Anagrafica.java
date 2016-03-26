package it.localproject.models;

public class Anagrafica {

	String nome, cognome;
	int eta;
	
	public Anagrafica(String nome, String cognome, int eta){
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setCognome(String cognome){
		this.cognome=cognome;
	}
	public void setEta(int eta){
		this.eta=eta;
	}
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
		}
	public int getEta(){
		return eta;
	}
	
	
}
