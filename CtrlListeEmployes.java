package vue;

import controleur.Main;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.*;
import modele.Membre;

public class CtrlListeEmployes {

    @FXML private Button bnModifier;
    @FXML private Button bnSupprimer;
    @FXML private Button bnFermer;
    @FXML private TableView<Membre> tvListeEmployes;
    @FXML private CheckBox saison;
    //@FXML private CheckBox cours;
    @FXML private CheckBox nom;
    
    @FXML void clicModifier(ActionEvent event) {
    	controleur.Main.ouvrirModifierEmploye(tvListeEmployes.getSelectionModel().getSelectedItem());
    }
    
    @FXML void clicSupprimer(ActionEvent event) {
    	Alert alert = new Alert(
    			AlertType.CONFIRMATION,
    			"Voulez-vous vraiment supprimer ce membre ?",
    			ButtonType.YES,
    			ButtonType.NO
    	);
    	alert.setTitle("Confirmation de suppression");
    	alert.showAndWait();
    	if(alert.getResult() == ButtonType.YES) {
    		System.out.print("Suppression...");
    		controleur.Main.supprimerEmploye(tvListeEmployes.getSelectionModel().getSelectedItem());
    	}
    }
     
    @FXML void clicFermer(ActionEvent event) {
    	controleur.Main.fermerAppli();
    	controleur.Main.fermerModifierEmploye();
    }
    
    @FXML void doubleClic(MouseEvent e) {
    	
    }
    
    @FXML void initialize() {
    	TableColumn<Membre,Integer> colonne1 = new TableColumn<Membre,Integer>("Identifiant");
		colonne1.setCellValueFactory(new PropertyValueFactory<Membre,Integer>("identifiant"));	
		tvListeEmployes.getColumns().set(0, colonne1);
		TableColumn<Membre, String> colonne2 = new TableColumn<Membre,String>("Nom");
		colonne2.setCellValueFactory(new PropertyValueFactory<Membre, String>("nom"));
		tvListeEmployes.getColumns().set(1, colonne2);
		TableColumn<Membre, String> colonne3 = new TableColumn<Membre,String>("Prénom");
		colonne3.setCellValueFactory(new PropertyValueFactory<Membre, String>("prenom"));
		tvListeEmployes.getColumns().set(2, colonne3);
		TableColumn<Membre,Integer> colonne4 = new TableColumn<Membre,Integer>("Inscription cours");
		colonne4.setCellValueFactory(new PropertyValueFactory<Membre, Integer>("inscription"));
		tvListeEmployes.getColumns().set(3, colonne4);
		TableColumn<Membre,Float> colonne5 = new TableColumn<Membre,Float>("Montant payé");
		colonne5.setCellValueFactory(new PropertyValueFactory<Membre, Float>("paye"));
		tvListeEmployes.getColumns().set(4, colonne5);
		TableColumn<Membre,Float> colonne6 = new TableColumn<Membre,Float>("Montant dû");
		colonne6.setCellValueFactory(new PropertyValueFactory<Membre, Float>("impaye"));
		tvListeEmployes.getColumns().set(5, colonne6);
				
		tvListeEmployes.setItems(Main.getLesEmployes());
		tvListeEmployes.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		BooleanBinding rien = Bindings.equal(tvListeEmployes.getSelectionModel().selectedIndexProperty(), -1);
		bnSupprimer.disableProperty().bind(rien);
		bnModifier.disableProperty().bind(rien);
    }
    
}