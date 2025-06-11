package modele;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Donnees {
	static private ObservableList<Membre> 		lesMembres  	= FXCollections.observableArrayList();

	static public void chargementDonnees() { 
		lesMembres.add(new Membre(007,"JULIEN","Amélie","Danse moderne",75,0, 75));
		lesMembres.add(new Membre(044,"TESSIER","Léo","Danse moderne jazz",15,60, 75));
		lesMembres.add(new Membre(011,"LOLLIERIC","Gaëtan","Danse classique",0,75, 75));
		lesMembres.add(new Membre(025,"KIM","Ji-O","Danse hip-hop",75,0, 75));
		lesMembres.add(new Membre(002,"GUERNION","Titouan","Danse moderne",75,0, 75));
		lesMembres.add(new Membre(031,"CHARRETEUR","Korentin","Danse moderne jazz",75,0, 75));
		lesMembres.add(new Membre(044,"ANNIC","Enzo","Danse classique",0,75, 75));
		lesMembres.add(new Membre(060,"SALAÜN","Marie-Lisa","Danse classique",75,0, 75));
		lesMembres.add(new Membre(001,"GOURDON","Gabriel","Danse hip-hop",0,75, 75));
		lesMembres.add(new Membre(006,"AUBREE","Henri","Danse hip-hop",30,35));
		lesMembres.add(new Membre(058,"BOND","James","Danse moderne jazz",75,0));
		lesMembres.add(new Membre(027,"DUCK","Donald","Danse moderne",35,30));
		lesMembres.add(new Membre(012,"LEMET","Axel","Danse moderne",75,0));
	}

	static public ObservableList<Membre> getLesEmployes() {
		return lesMembres;
	}
	
	static public ArrayList<Integer> getLesSuperieurs() {
		ArrayList<Integer> lesSuperieurs = new ArrayList<Integer>();;
		for(int i=0 ; i<lesMembres.size() ; i++) {
			lesSuperieurs.add(lesMembres.get(i).getIdentifiant());
		}
		return lesSuperieurs;
	}
	
	static public void ajouterEmploye(Membre e) {
		lesMembres.add(e);
	}
	
	static public void supprimerEmploye(Membre e) {
		boolean trouve = false;
		int i=0;
		while (!trouve && i<lesMembres.size()) {
			if ( lesMembres.get(i).getIdentifiant() == e.getIdentifiant() ){
				lesMembres.remove(i);
				trouve = true;
			}
			i++;
		}
	}
	
	static public void modifierEmploye(Membre e) {
		boolean trouve = false;
		int i=0;
		while (!trouve && i<lesMembres.size()) {
			if ( lesMembres.get(i).getIdentifiant() == e.getIdentifiant() ){
				lesMembres.set(i, e);
				trouve = true;
			}
			i++;
		}
	}
}
