package ch.makery.rollhab.view;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HomeOverviewController {
	// Reference to the main application.
	private MainApp mainApp;
	@FXML
	private Label firstNameLabel;
	@FXML
	private Label lastNameLabel;

	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public HomeOverviewController() {
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
	private void handleAtelier() {
		mainApp.showAtelierLayout();
		mainApp.showAtelierOverviewRepeat();
	}
	@FXML
	private void handleToutesLesLecon() {
		mainApp.showHomeLayout();
		mainApp.showHomeAtelierOverview();
	}

	@FXML
	private void handleToolsLexique() {
		mainApp.showHomeLayout();
		mainApp.showToolsOverviewLexique();

	}

	@FXML
	private void handleToolsVerbes() {

		mainApp.showHomeLayout();
		mainApp.showToolsOverviewVerbes();

	}

	@FXML
	private void handleToolsTemps() {
		mainApp.showHomeLayout();
		mainApp.showToolsOverviewTemps();

	}

}
