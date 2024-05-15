package tpjava;

public class Livre {
	
	private String titre, auteur, isbn;
	private boolean disponible;
	
	public Livre(String titre, String auteur, boolean isDisponible) {
		this.titre = titre;
		this.auteur = auteur;
		this.disponible = isDisponible;
	}
	
	public String getTitre() {
		return this.titre;
	}
	
	public String getAuteur() {
		return this.auteur;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public boolean getDisponible() {
		return this.disponible;
	}
	
	public void setTitre(String newTitre) {
		this.titre = newTitre;
	}
	
	public void setAuteur(String newAuteur) {
		this.auteur = newAuteur;
	}
	
	public void setIsbn(String newIsbn) {
		this.isbn = newIsbn;
	}
	
	public void setDisponible(boolean isDisponible) {
		this.disponible = isDisponible;
	}
	
	public void afficherDetails() {
		System.out.println("Titre : " + getTitre() + "\nAuteur : " + getAuteur() + "\nIsbn : " + getIsbn() + "\nDisponible ? " + getDisponible());
	}
}
