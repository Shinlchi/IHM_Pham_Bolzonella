package ch.makery.rollhab.view;

import javafx.fxml.FXML;
import ch.makery.rollhab.MainApp;

public class AtelierLayoutController {
	
	// Reference to the main application.
	private MainApp mainApp;

	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public AtelierLayoutController() {
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
	
	@FXML
	private void handleAcceuil() {
		mainApp.showHomeLayout();
	    mainApp.showHomeOverview();
	}
	@FXML
	private void handleRetour() {
		mainApp.showHomeLayout();
	    mainApp.showHomeOverview();
	}
}
