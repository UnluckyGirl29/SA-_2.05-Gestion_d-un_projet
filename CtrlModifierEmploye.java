package vue;

import controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modele.*;

public class CtrlModifierEmploye {
    @FXML private Button 			bnAnnuler;
    @FXML private Button 			bnOK;
    @FXML private TextField 		txtIdentifiant;
    @FXML private TextField 		txtPrenom;
    @FXML private TextField 		txtInscription;
    @FXML private TextField 		txtMontantDu;
    @FXML
    private TextField txtDatePaiement;

    @FXML
    private Button retour;

    @FXML
    private Button supprMontant;

    @FXML
    private Button supprDate;

    @FXML
    private TextField txtMontantPaye;

    @FXML
    private Button supprMembre;

    @FXML
    private TextField txtNom;
      
	@FXML public void annuler() {
    	Main.fermerModifierEmploye();
    }
	
	@FXML public void valider() {
    	Main.modifierEmploye( 	Integer.parseInt(txtIdentifiant.getText()),
								txtNom.getText(),
								txtPrenom.getText(),
								txtInscription.getText(),
								Integer.parseInt(txtMontantPaye.getText()),
								Integer.parseInt(txtMontantDu.getText())
    	);
    }

	public void initialize() {
		bnOK.disableProperty().bind(txtNom.textProperty().isEmpty());
    }

	public void afficherEmploye(Membre e) {
		txtIdentifiant.setText(""+e.getIdentifiant());
		txtNom.setText(e.getNom());
		txtPrenom.setText(e.getPrenom());
		txtInscription.setText(e.getInscription());
		txtMontantPaye.setText(""+e.getMontantPaye());
		txtMontantDu.setText(""+e.getMontantDu());
		
	}
}