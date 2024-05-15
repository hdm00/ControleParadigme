package tpjava;

import java.util.Date;

public class Membre extends Personne{
	
	private String statut;
	private Date dateAdhésion;

	public Membre(String nom, String prénom, int id, Date dateAdhésion, String statut) {
		super(nom, prénom, id);
		this.dateAdhésion = dateAdhésion;
		this.statut = statut;
	}

	public void afficherDetails() {		
		System.out.println("Nom : " + super.getNom() + "\nPrénom : " + super.getPrénom() + "\nIdentifiant : " + super.getId() + "\nDateAdhésion : " + this.dateAdhésion + "\nStaut : " + this.statut);
	}

}
