package tpjava;

public abstract class Personne {
	String nom, prénom;
	int id;
	
	public Personne(String nom, String prénom, int id) {
		this.nom = nom;
		this.prénom = prénom;
		this.id = id;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrénom() {
		return this.prénom;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNom(String newNom) {
		this.nom = newNom;
	}
	
	public void setPrénom(String newPrénom) {
		this.nom = newPrénom;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public abstract void afficherDetails();
}
