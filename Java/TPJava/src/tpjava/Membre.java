package tpjava;

public class Membre extends Personne{
	
	private String dateAdhésion, statut;

	public Membre(String nom, String prénom, int id, String dateAdhésion, String statut) {
		super(nom, prénom, id);
		this.dateAdhésion = dateAdhésion;
		this.statut = statut;
	}

	public void afficherDetails() {		
		System.out.println("Nom : " + this.getNom() + "\nPrénom : " + this.getPrénom() + "identifiant : " + this.getId() + "dateAdhésion : " + this.dateAdhésion + "staut : " + this.statut);
	}

}
