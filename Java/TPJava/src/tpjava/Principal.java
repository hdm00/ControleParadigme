package tpjava;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
	
//pas de majuscule au main car l'IDE eclipse ne le reconnait pas comme programme principal autrement
	public static void main(String[] args) {

		Date date = new Date(); //Actuellement
		
		ArrayList<Personne> liste = new ArrayList<Personne>();
		Membre membre1 = new Membre("de Marco","Hugo", 1, date, "Actif");
		Employe employe1 = new Employe("Cloux", "Erwan", 2, "Libraire", 1700.0);
		liste.add(membre1);
		liste.add(employe1);
		
		for(int i=0; i < liste.size(); i++) {
			Personne element = liste.get(i);
			element.afficherDetails();
			System.out.println();
		}
		
		Livre livre1 = new Livre("Tintin", "Zed", true);
		membre1.emprunterLivre(livre1);

		for(int i=0; i < membre1.emprunts.size(); i++) {
			Livre element = membre1.emprunts.get(i);
			System.out.println("Liste des emprunts de " + membre1.getNom() + " " + membre1.getPrénom() + " :" + element.getTitre());
		}
	}

}