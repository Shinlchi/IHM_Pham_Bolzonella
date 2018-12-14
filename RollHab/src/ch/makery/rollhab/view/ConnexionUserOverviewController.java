package ch.makery.rollhab.view;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
public class ConnexionUserOverviewController {
	// Reference to the main application.
	private MainApp mainApp;

	
	/**
	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public ConnexionUserOverviewController() {
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
		 // Add observable list data to the table
       
	}


	/**
	 * Called when the user clicks the connexion button. Opens a overview.
	 */
	
	@FXML
	private void handleUser() {
		
		mainApp.showHomeLayout();
	    mainApp.showHomeOverview();
	 
	}

}
