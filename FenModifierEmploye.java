package vue;

import java.io.File;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.Membre;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenModifierEmploye extends Stage {
	
	private CtrlModifierEmploye ctrl;
	
	public FenModifierEmploye() throws IOException {
		this.setTitle("Détail d'un membre");
		this.setResizable(false);
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException { 
		File f = new File("/home/etuinfo/glollieric/Documents/SAE2.01/modifierMembre.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(f.toURI().toURL());
		Pane racine = loader.load();
		this.ctrl = loader.getController();
		return racine;
	}
}
