package vue;

import controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CtrlModifierEmploye {
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

}
