package ch.makery.rollhab.view;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;

public class ToolsOverviewVerbesController {
	// Reference to the main application.
	private MainApp mainApp;

	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public ToolsOverviewVerbesController() {
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

	/**
	 * Called when the user clicks the connexion button. Opens a overview.
	 */
	@FXML
	private void handleToolsLexique() {
		mainApp.showHomeLayout();
		mainApp.showToolsOverviewLexique();
		
	}
	

	
	@FXML
	private void handleToolsTemps() {
		mainApp.showHomeLayout();
		mainApp.showToolsOverviewTemps();
		
	}
	
}
