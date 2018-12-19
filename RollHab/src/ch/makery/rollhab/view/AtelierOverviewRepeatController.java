package ch.makery.rollhab.view;
import java.io.File;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;

public class AtelierOverviewRepeatController {
	// Reference to the main application.
	private MainApp mainApp;

	@FXML
	private MediaView mv;
	private MediaPlayer mp;
	private Media me;
	public AtelierOverviewRepeatController() {
	}

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
	 * Called when the user clicks the continue button. Opens a overview.
	 */
	@FXML
	public void handleContinuer()
	{
		mainApp.showAtelierOverviewTrad();
	}

	@FXML
	public void handleSound() {
		
	}

}
