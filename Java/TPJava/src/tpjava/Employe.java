package tpjava;

public class Employe extends Personne{
	
	private String poste;
	private double salaire;

	public Employe(String nom, String prénom, int id, String poste, double salaire) {
		super(nom, prénom, id);
		this.poste = poste;
		this.salaire = salaire;
	}
	
	public String getPoste() {
		return this.poste;
	}
	
	public double getSalaire() {
		return this.salaire;
	}
	
	public void setPoste(String newPoste) {
		this.poste = newPoste;
	}
	
	public void setSalaire(double newSalaire) {
		this.salaire = newSalaire;
	}

	public void afficherDetails() {
		System.out.println("Nom : " + super.getNom() + "\nPrénom : " + super.getPrénom() + "\nId : " + super.getId() + "\nPoste : " + this.getPoste() + "\nSalaire : " + this.getSalaire() + " €");
	}

}
