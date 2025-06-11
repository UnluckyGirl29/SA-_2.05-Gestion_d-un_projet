package modele;

import javafx.beans.property.*;

public class Membre {
	private final IntegerProperty identifiant;
	private final StringProperty nom;
	private final StringProperty prenom;
	private final StringProperty inscription;
	private final IntegerProperty montantPaye;
	private final IntegerProperty montantDu;

	public Membre() {
		this.identifiant = new SimpleIntegerProperty();
		this.nom = new SimpleStringProperty();
		this.prenom = new SimpleStringProperty();
		this.inscription = new SimpleStringProperty();
		this.montantPaye = new SimpleIntegerProperty();
		this.montantDu = new SimpleIntegerProperty();
	}
	public Membre(int id, String nom, String prenom, String inscription, int montantPaye, int montantDu) {
		this.identifiant = new SimpleIntegerProperty(id);
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.inscription = new SimpleStringProperty(inscription);
		this.montantPaye = new SimpleIntegerProperty(montantPaye);
		this.montantDu = new SimpleIntegerProperty(montantDu);
	}
	

	public int getIdentifiant() {
		return identifiant.get();
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant.set(identifiant);
	}
	public IntegerProperty identifiantProperty() {
		return this.identifiant;
	}
	

	public String getNom() {
		return nom.get();
	}
	public void setNom(String nom) {
		this.nom.set(nom);
	}
	public StringProperty nomProperty() {
		return this.nom;
	}
	
	
	public String getPrenom() {
		return prenom.get();
	}
	public void setPrenom(String prenom) {
		this.prenom.set(prenom);
	}
	public StringProperty prenomProperty() {
		return this.prenom;
	}
	
	
	public String getInscription() {
		return inscription.get();
	}
	public void setInscription(String superieur) {
		this.inscription.set(superieur);
	}
	public StringProperty inscriptionProperty() {
		return this.inscription;
	}
	
	
	public int getMontantPaye() {
		return montantPaye.get();
	}
	public void setMontantPaye(int montantPaye) {
		this.montantPaye.set(montantPaye);
	}
	public IntegerProperty montantPayeProperty() {
		return this.montantPaye;	
	}
	
	
	public int getMontantDu() {
		return montantDu.get();
	}
	public void setMontantDu(int montantDu) {
		this.montantDu.set(montantDu);
	}
	public IntegerProperty montantDuProperty() {
		return this.montantDu;	
	}
	
	
	public void affiche() {
		System.out.println("Identifiant : " + this.getIdentifiant());
		System.out.println("Nom : " + this.getNom());
		System.out.println("Prénom : " + this.getPrenom());
		System.out.println("Inscription : " + this.getInscription());
		System.out.println("Montant payé : " + this.getMontantPaye());
		System.out.println("Montant dû : " + this.getMontantDu());
	}
	
}
