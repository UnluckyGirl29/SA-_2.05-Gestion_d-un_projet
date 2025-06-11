package controleur;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import modele.Donnees;
import modele.Membre;
import vue.FenListeEmployes;
import vue.FenModifierEmploye;

public class Main extends Application{
	static private FenModifierEmploye fModifierEmp;
	static private FenListeEmployes fListeEmp;
	
	public void start(Stage f) throws Exception {
		Donnees.chargementDonnees();
		fModifierEmp = new FenModifierEmploye();
		fListeEmp = new FenListeEmployes();
		fListeEmp.show();
	} 
	
	static public void main(String args[]) { 
		Application.launch(args); 
	}
	
	static public void fermerAppli() {
		System.exit(0);
	}
	
	static public void ouvrirModifierEmploye(Membre e) {
		fModifierEmp.show();
	}
	
	static public void fermerModifierEmploye() {
		fModifierEmp.close();
	}
	
	static public void modifierEmploye(int id, String nom, String prenom, String inscription, float montantPaye, float montantDu) { 
		Membre e = new Membre();
		Donnees.modifierEmploye(e);
		fModifierEmp.close();
	}
	
	static public void supprimerEmploye(Membre e) {
		Donnees.supprimerEmploye(e);
	}


	static public ObservableList<Membre> getLesEmployes(){
		return Donnees.getLesEmployes();
	}
	
	static public ArrayList<Integer> getLesSuperieurs(){
		return Donnees.getLesSuperieurs();
	}
	
}
