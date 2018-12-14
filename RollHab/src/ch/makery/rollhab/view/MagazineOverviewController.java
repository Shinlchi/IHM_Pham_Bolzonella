package ch.makery.rollhab.view;

import java.util.ResourceBundle;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MagazineOverviewController {
	// Reference to the main application.
	private MainApp mainApp;


@FXML
private AnchorPane root;


	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public MagazineOverviewController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
	
	    }

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void handleHistoireSecond() {
		mainApp.showMagazineOverviewSecond();
		}
	/**
	 * Called when the user clicks the connexion button. Opens a overview.
	 */
}
